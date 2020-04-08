package org.open.challenge;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class ModiOpChallenge {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Words> w = new ArrayList<>();
		{ 
			w.add(new Words("love", "사랑"));
			w.add(new Words("water", "물"));
			w.add(new Words("cup", "컵"));
			w.add(new Words("CANDY", "사탕"));
			w.add(new Words("computer", "컴퓨터"));
			w.add(new Words("pen", "펜"));
			
		}
		
		System.out.println("영어단어 테스트 프로그램");
		
		while(true) {
		System.out.print("1.단어 테스트  2.단어 삽입  3.종료 >>");
		Random r = new Random();
		int a = sc.nextInt();
		sc.nextLine();
		switch(a) {
		
		case 1:		
			test:
			if(w.size()>3) {
			System.out.println("현재 "+w.size()+"개의 단어가 들어있습니다. -1입력하면 테스트를 종료합니다.");
			
				while(true) {
					int i = r.nextInt(w.size());
					System.out.println(w.get(i).getEng()+"?");
					HashSet<Integer> set = new HashSet<>();
					int[] dd = new int[4];
					set.add(i);
					int cnt =0;
					while(cnt<3) {
						int e = r.nextInt(w.size());
						if(set.add(e)) {
							dd[cnt++]=e;
						}
					}
					dd[3]=i;
					HashSet<Integer> set2 = new HashSet<>();
					int[] ans = new int[4];
					for(int h = 1; h<5;) {
						int b = r.nextInt(4);
						if(set2.add(b)) {
							ans[h-1]=b;
							System.out.print(h+++"."+w.get(dd[b]).getKor()+" ");
						}
					}
					try {
						int anss = sc.nextInt();
						if(anss==-1) {break test;}
						else if(dd[ans[anss-1]]==i) {
							System.out.println("정답!!");
						} else { System.out.println("아님 ㅜㅜ");
						}
					}catch (InputMismatchException e) {
						System.out.println("숫자를 입력하세요!");
					}
					
					
				}
			} else {System.out.println("현재 "+w.size()+"개의 단어가 들어있습니다. 단어가 4개 이상 등록되어 있어야 퀴즈를 풀 수 있습니다."); break;}
		break;
			
			
			
		case 2:
			System.out.println("현재 "+w.size()+"개의 단어가 들어있습니다. \"그만\"을 입력하면 입력을 종료합니다.");
			while(true) {
				System.out.print("영어 한글 입력>>");
				String fg = sc.next();
				if(fg.equals("그만")) break;
				String hh = sc.next();
				//sc.nextLine();

				w.add(new Words(fg, hh));
			}
			break;
			
			
			
			
			
			
			
			
		case 3:
		
		System.out.println("명품 영어를 종료합니다.");
		System.exit(0);
		
		}
		}
	}
}

class Words {
	String eng;
	String kor;
	public Words(String a , String b) {
		eng = a;
		kor = b;
	}
	public String getEng() {
		return eng;
	}
	public String getKor() {
		return kor;
	}
	
	
}
