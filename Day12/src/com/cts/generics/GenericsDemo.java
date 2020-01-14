package com.cts.generics;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericsType<String> type=new GenericsType<>();
		type.set("Hello");
		System.out.println(type.get());
		
		GenericsType<Integer> type2=new GenericsType();
		type2.set(110);
		System.out.println(type2.get());
		
//		System.out.println(type);
		
		GenericsType type3=new GenericsType();
		type3.set("Lunch Time");
		type3.set(1_30);
		System.out.println(type3.get());
		
		
	}

}

class GenericsType<T>{
	private T t;
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return this.t;
	}
	@Override
	public String toString() {
		return "t =" + t ;
	}
	
}