package org.shilseup.graphic;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class GrapihEditor {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("그래픽 에디터 실행");
		Vector<Shape> s = new Vector<>();
		while(true) {
			System.out.print("1.삽입 2.삭제 3.모두보기 4.종료 >>");
			switch(sc.nextInt()) {
			
			case 1:System.out.print("1.라인 2.사각, 3.원 >>");
				switch(sc.nextInt()) {
				case 1:s.add(new Line());break;
				case 2:s.add(new Rect());break;
				case 3:s.add(new Circle());break;
				}break;
			
			case 2:System.out.print("삭제할 도형의 위치 >>");
				int a = sc.nextInt();
				if(s.elementAt(a-1)!=null) s.remove(a-1);
				else System.out.println("삭제할 수 없습니다.");
				break;
			case 3:
				Iterator<Shape> it = s.iterator();
				while(it.hasNext()) {
					it.next().draw();
				}break;
			case 4:System.out.println("종료합니다."); System.exit(0);
			
			
			
			}
			
		}
		
	}

}

abstract class Shape {
	private Shape next;
	public Shape() {next=null;}
	public void setNext(Shape obj) {next=obj;}
	public Shape getNext() {return next;}
	public abstract void draw();
}


class Line extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Line");	
	}
	
}

class Rect extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rect");
	}
	
}


class Circle extends Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle");
	}
	
}
