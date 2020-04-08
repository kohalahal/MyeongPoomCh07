package org.shilseup.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;

public class CustopmerPoint {
	public static void main(String[] args) {
		System.out.println("포인트 관리 프로그램***\n");
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> cp = new HashMap<>();

		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String name = sc.next();
			if(name.equals("그만")) System.exit(0);
			int p = sc.nextInt();
			if(cp.get(name)!=null) {
				cp.put(name, cp.get(name)+p); 
			} else {
				cp.put(name, p);
			}
			
			Iterator<String> e = cp.keySet().iterator();
			while(e.hasNext()) {
				String s = e.next();
				System.out.print("("+s+", "+cp.get(s)+") \n");	
			}
			
		}
	}
}
