package com.cts.thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread=Thread.currentThread();
		
		System.out.println(thread);
		
		System.out.println(thread.getName());
		thread.setName("Not Main");
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getId());
		System.out.println(thread.isDaemon());
		System.out.println(thread.isAlive());
		System.out.println(thread.getState());
		
	}

}
