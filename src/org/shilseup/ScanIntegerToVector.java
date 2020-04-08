package org.shilseup;

import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class ScanIntegerToVector {
	public static void main(String[] args) {
		System.out.print("정수 (-1 입력전까지)>>");
		Scanner sc = new Scanner(System.in);
		Vector<Integer> v = new Vector<>();
		int a ;
		while(true) {
			a = sc.nextInt();
			if(a!=-1) v.add(a);
			else break;
		} 
		
		System.out.println("최대값은 "+Collections.max(v));

	}

}
