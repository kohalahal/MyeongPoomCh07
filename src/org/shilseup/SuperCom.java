package org.shilseup;

import java.util.ArrayList;
import java.util.Scanner;

public class SuperCom {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수퍼컴작동.명령어:mov, add, sub, jn0, prt+GO");
		ArrayList<String> arr = new ArrayList<>();
		int sum = 0;
		int i = 0;
		int n = 0;
		Print prt = null;
		
		
		while(true) {
			System.out.print(">>");
			String cc = sc.nextLine();
			
			if((cc.equals("GO"))||(cc.equals("go"))) break;
			else arr.add(cc);
		}
		

		for(int k = 0; k<arr.size(); k++) {
			
			System.out.println("arr size:"+arr.size());
			System.out.println("시작:"+k);
				String s = arr.get(k);
			
				String[] cmd = new String[3];
				cmd = s.split(" ");
				int x = 0;
				if(Character.isDigit(cmd[2].charAt(0))) {
				 x = Integer.parseInt(cmd[2]);
				} else {
					switch(cmd[2]) {
					case "sum": x = sum; break;
					case "i": x= i; break;
					case "n": x=n; break;
					}
				}
				
				
				
				switch(cmd[0]) {
				case "mov":
					switch(cmd[1]) {
					case "sum": sum = x; continue;
					case "i": i = x; continue;
					case "n": n= x; continue;
					}
					
				case "add":
					switch(cmd[1]) {
					case "sum": sum += x; continue;
					case "i": i += x; continue;
					case "n": n += x; continue;
					}
					
				case "sub":
					switch(cmd[1]) {
					case "sum": sum -= x; continue;
					case "i": i -= x; continue;
					case "n": n -= x; continue;
					}
					
				case "jn0":
					switch(cmd[1]) {
					case "sum":if(sum!=0) k=x-1; continue ;
					case "i":if(i!=0) k=x-1; continue;
					case "n":if(n!=0) k=x-1; continue;
					}
					
				case "prt":
					switch(cmd[1]) {
					case "sum": prt = new Print("sum"); continue;
					case "i": prt = new Print("i"); continue;
					case "n": prt =new Print("n"); continue;
					}

					}//switch
				
				}//for
				int pp = 0;
				if(prt!=null) {
					switch(prt.getName()) {
					case "sum":System.out.println("[prt sum "+sum+"]"); pp = sum;break;
					case "i": System.out.println("[prt i "+i+"]");pp = sum;break;
					case "n": System.out.println("[prt n "+n+"]"); pp = sum;break;
					}
				}
				System.out.println("I:"+i+"SUM:"+sum+"N:"+n);
				System.out.println("출력할 결과는 "+pp+". 프로그램 실행 끝");

		}
}
	
class Print {
	String name;
	int x;
	
	public Print(String s) {
		name = s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	
}
