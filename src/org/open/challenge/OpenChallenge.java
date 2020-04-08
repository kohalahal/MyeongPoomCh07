package org.open.challenge;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class OpenChallenge {

	public static void main(String[] args) {
		Vector<Word> v = new Vector<>();
		v.add(new Word("terrifying", "무서운"));
		v.add(new Word("fish", "생선"));
		v.add(new Word("Shoes", "신발"));
		v.add(new Word("keep", "유지하다"));
		v.add(new Word("concentrate", "집중하다"));
		v.add(new Word("friend", "친구"));
		v.add(new Word("coke", "콜라"));
		v.add(new Word("water", "물"));
		v.add(new Word("eat", "먹다"));
		v.add(new Word("chewy", "쫀득하다"));
		
		System.out.println("영어단어테스트시작. -1입력하면 종료\n현재"+v.size()+"개의 단어가 들어있습니다.");
		Scanner sc = new Scanner(System.in);


		while(true) {

			
			
			
			int x = (int)(Math.random()*10);
			System.out.println(v.get(x).getEng()+"?");
			HashSet<Integer> z = new HashSet<>();
			z.add(x);
			while(z.size()<4) {
				z.add((int)(Math.random()*10));
			}
			Iterator<Integer> it = z.iterator();
			int g = 1;
			int i = 0;
			int[] t = new int[4];
			while(it.hasNext()) {
				t[i] = it.next();
			System.out.print("("+(g++)+")"+v.get(t[i++]).getKor()+" ");
			}
			System.out.print(">");
			int q = sc.nextInt()-1;
			
			if(q==-2) {System.out.println("종료"); System.exit(0);}
			else if(t[q]==x) {
				System.out.println("엑설런트");
			}else System.out.println("ㄴㄴㄴㄴ");
			}
		
		

		
		
	}
}




class Word {
	String eng;
	String kor;
	
	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public Word(String eng, String kor) {
		this.eng=eng;
		this.kor=kor;
	}
}
