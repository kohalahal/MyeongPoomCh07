package org.shilseup.student;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageCalc {
	
	
	
	public static void main(String[] args) {
		ArrayList<Student> st = new ArrayList<>(); 
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i<4) {
			System.out.print("학생 이름, 학과, 학번, 학점 평균 입력하세요.>>");
			String s = sc.nextLine();
			String[] a =s.split(", ");
			st.add(new Student(a[0], a[1], Integer.parseInt(a[2]), Double.parseDouble(a[3])));
			i++;
		}
		for(int j = 0; j<st.size(); j++) {
			System.out.println("----");
			System.out.println(st.get(j).toString());
		}

		while(true) {
			System.out.println("----");
			System.out.print("이름입력>>");
			String s = sc.nextLine();
			System.out.println("----");
			if(s.equals("그만")) System.exit(0);
			for(int j = 0; j<st.size(); j++) {
				if(st.get(j).name.equals(s)) System.out.println(st.get(j).toString());
			}
		}
	}

}
