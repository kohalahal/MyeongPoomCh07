package org.shilseup;

import java.util.ArrayList;
import java.util.Scanner;


public class ScoreConverter {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		//char[] w =s.toCharArray();
		ArrayList<Character> c = new ArrayList<>(); 
				//Stream.of(w).collect(Collectors.toCollection(ArrayList::new));
		
		String[] q = s.split(" ");
		for(int i = 0; i<q.length; i++) {
			c.add(q[i].charAt(0));
		}
		double sum = 0;
		for(int i = 0; i<c.size(); i++) {
			if(c.get(i).equals('A')) {
				sum += 4.0;
			} else if(c.get(i).equals('B')) {
				sum += 3.0;
			} else if(c.get(i).equals('C')) {
				sum += 2.0;
			} else if(c.get(i).equals('D')) {
				sum += 1.0;
			} else if(c.get(i).equals('F')) {
				sum += 0.0;
			}	
		}
		System.out.println(sum/c.size());
	}

}
