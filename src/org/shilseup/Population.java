package org.shilseup;

import java.util.HashMap;
import java.util.Scanner;

public class Population {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		String nation;
		Integer pop;
		while(true) {
			System.out.print("나라 인구 입력>>");
			nation = sc.next();
			if(nation.equals("그만")) break;
			pop = sc.nextInt();
			nations.put(nation, pop);
		}
		
		while(true) {
			System.out.print("인구 검색>>");
			nation = sc.next();
			if(nation.equals("그만")) break;
			System.out.println(nations.get(nation));
		}
	}

}
