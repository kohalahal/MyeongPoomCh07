package org.shilseup;

import java.util.Scanner;
import java.util.Vector;

public class Precipitation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Vector<Integer> precipitation = new Vector<>();
		while(true) {
			
			System.out.print("강수량 입력(0입력시 종료)>>");
			Integer rain = sc.nextInt(); //오토박싱
			if(rain==0) break;
			precipitation.add(rain);
			int sum = 0;
			for(int i = 0; i<precipitation.size();i++) {
				System.out.print(precipitation.elementAt(i)+" ");
				sum +=precipitation.elementAt(i);
			}
			System.out.println("\n현재 평균:"+sum/precipitation.size());
		}
		System.exit(0);
		
	}

}
