package org.shilseup.city;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CitySearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Location> city = new HashMap<>();
		int i = 0;
		System.out.println("도시, 경도, 위도를 입력하세요.");
		while(i<4) {
			System.out.print(">>");
			String s = sc.nextLine();
			String[] q = s.split(", ");
			city.put(q[0], new Location(Integer.parseInt(q[1]), Integer.parseInt(q[2])));
			i++;
		}
		System.out.println("---");
		Iterator<String> it = city.keySet().iterator();
		while(it.hasNext()) {
			String w = it.next();
			System.out.println(w+city.get(w).toString());
		}
		System.out.println("---");
		while(true) {
			System.out.print("도시 이름>>");
			String w = sc.nextLine();
			if(w.equals("그만")) break;
			else if(city.get(w)!=null) System.out.println(w+city.get(w).toString());
			else System.out.println(w+"는 없습니다.");
		}
		System.exit(0);
	}
}

class Location {
	int x,y;
	
	public Location(int a, int b) {
		x = a;
		y = b;
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " "+x+" "+y;
	}
}