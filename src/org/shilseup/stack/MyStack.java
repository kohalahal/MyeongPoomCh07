package org.shilseup.stack;

public class MyStack<T> implements IStack<T>{
	private int tos;
	Object[] st;
	
	
	public MyStack() {
		super();
		this.tos = 0;
		this.st = new Object[10];
	}

	@Override
	public T pop() {
		// TODO Auto-generated method stub
		if(tos==0) return null;
		else return (T) st[(tos--)-1];
	}

	@Override
	public boolean push(T ob) {
		// TODO Auto-generated method stub
		if(tos==10) return false;
		else st[tos++] = ob; return true;
		
	}

}

interface IStack<T> {
	T pop();
	boolean push(T ob);
	
}