package org.shilseup.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Manager {
	
	public static void main(String[] args) {
		
		HashMap<String, Student> st = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i<4) {
			System.out.print("학생 이름, 학과, 학번, 학점평균 입력하세요.\n >>");
			String s = sc.nextLine();
			String[] q = s.split(", ");
			st.put(q[0], new Student(q[0], q[1], Integer.parseInt(q[2]), Double.parseDouble(q[3])));
			i++;
		}
		Iterator<Student> it = st.values().iterator();
		while(it.hasNext()) {
			System.out.println("---\n"+it.next().toString());
		}
		while(true) {
		System.out.print("학생이름>>");
		String s = sc.nextLine();
		if(s.equals("그만")) break;
		else if (st.get(s)!=null) {
		System.out.println(st.get(s).toString());
		}
		}
		System.exit(0);
		
		
	}

}
