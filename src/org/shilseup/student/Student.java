package org.shilseup.student;

class Student {
	String name;
	String major;
	int stN;
	double avrg;
	
	public Student(String nn, String m, int n, double a) {
		name=nn;
		major=m;
		stN=n;
		avrg=a;
	}
	
	public Student(String n, double a) {
		name = n;
		avrg = a;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "이름:"+name+"\n학과:"+major+"\n학번:"+stN+"\n학점평균:"+avrg;
	}

}
