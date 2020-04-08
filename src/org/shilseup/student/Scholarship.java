package org.shilseup.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Scholarship {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Double> st = new HashMap<>();
		System.out.println("미래 장학금 관리 시스템입니다.");
		int i = 0;
		double cut = 0;
		while(i<5) {
			System.out.print("이름과 학점");
			st.put(sc.next(), sc.nextDouble());
			i++;
		}
		System.out.print("장학생 선발 기준 학점 입력>>");
		cut = sc.nextDouble();
		Iterator<Double> c = st.values().iterator();
		double tmp = 0;
		double[] pass = new double[5];
		System.out.print("장학생 명단: ");
		int q = 0;
		while(c.hasNext()) {
			tmp = c.next();
			if(tmp>=cut) {
				System.out.print(getKey(st, tmp)+" ");
			}
		}
	}
	
	public static <K, V>K getKey(HashMap<K,V> map, V value) {
		for(K key:map.keySet()) {
			if(value.equals(map.get(key))) {
				return key;
			}
		}
		return null;
	}
}
