package org.shilseup.city;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class CapitalCities {
	static Vector<Nation> n = new Vector<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("수도 맞추기 게임을 시작합니다.");
		Random r = new Random();
		
		{
			n.add(new Nation("과테말라", "과테말라"));
			n.add(new Nation("그리스", "아테네"));
			n.add(new Nation("일본", "도쿄"));
			n.add(new Nation("대한민국", "서울"));
			n.add(new Nation("미국", "워싱턴dc"));
			n.add(new Nation("중국", "북경"));
			n.add(new Nation("인도", "뉴델리"));
			n.add(new Nation("이탈리아", "로마"));
		}
		
		while(true) {
			start:
			System.out.print("1.입력 2.퀴즈 3.종료>>");
			int e =sc.nextInt();
			switch(e) {
			
			case 1:
				System.out.println("현재 "+n.size()+"개의 나라와 수도가 입력되어 있습니다.");
				input:
				while(true) {
					System.out.print((n.size()+1)+"번 나라와 수도 입력>>");
					String s = sc.next();
					if(s.equals("그만")) { sc.nextLine();break;}
					else { String q = sc.nextLine();
						for(int i = 0; i<n.size(); i++) {
							if(s.equals(n.elementAt(i).getCountry())) {System.out.println(s+"는 이미 있습니다."); continue input;}
						}
						n.add(new Nation(s, q));
					}
				}
				break;
				
				
			case 2:sc.nextLine();		
				while(true) {
					int i = r.nextInt(n.size());
					System.out.print(n.elementAt(i).getCountry()+"의 수도는??>>");
					String s = sc.nextLine();
					if(s.equals("그만")) break;
					else if(s.equals(n.elementAt(i).getCapital())) {
						System.out.println("정답!!");
					} else System.out.println("아닙니다.");
				}break;
				
				
			case 3:System.out.print("게임을 종료합니다."); System.exit(0);
			}
		}
	}
	
	static void input() {
//		System.out.print((n.size()+1)+"번 나라와 수도 입력>>");
//		String s = sc.next();
//		if(s.equals("그만")) break;
//		else {
//			for(int i = 0; i<n.size(); i++) {
//				if(s.equals(n.elementAt(i).getCountry())) {System.out.println(s+"는 이미 있습니다."); return;}
//			}
//			n.add(new Nation(s, sc.next()));
//		}
	}
}

class Nation {
	String country;
	String capital;
	
	public Nation(String s, String ss) {
		country = s;
		capital =ss;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}
	
	
}