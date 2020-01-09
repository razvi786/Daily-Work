package com.cts.challenge;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer();
		
		System.out.println("Capacity: "+sb.capacity());
		
		sb.append("Welcome");
		
		System.out.println("Capacity: "+sb.capacity());
		
		sb.append(" Hello Everyone");
		
		System.out.println("Capacity: "+sb.capacity());
		
		sb.append(" To the java class session");
		
		System.out.println("Capacity: "+sb.capacity());
		
		StringBuffer sb2=new StringBuffer("Hello");
		
		System.out.println("Capacity: "+sb2.capacity());
		
		StringBuffer sb3=new StringBuffer(50);
		
		System.out.println("Capacity: "+sb3.capacity());
		
		System.out.println("String: "+sb);
		
		sb.insert(0, "How are you? ");
		
		System.out.println("String(insert): "+sb);
		
		sb.delete(12, 20);
		
		System.out.println("String(delete): "+sb);
		
		sb.replace(0, 13 , "I am Fine ");
		
		System.out.println("String(replace): "+sb);
		
		sb.ensureCapacity(200);
		
		System.out.println("Capacity: "+sb.capacity());
		
	}

}
