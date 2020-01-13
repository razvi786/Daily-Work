package com.cts.thread;

public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Thread"); //Only 1 Thread
		Thread t=Thread.currentThread();
		t.setPriority(Thread.MAX_PRIORITY-2);
		
		Thread firstThread=new Thread(new FirstThread2());
		Thread secondThread=new Thread(new SecondThread2());
		
		secondThread.setPriority(Thread.MIN_PRIORITY+2);
		
		firstThread.start();
		secondThread.start();
		
		
		
		System.out.println(firstThread.getPriority());
		System.out.println(secondThread.getPriority());
		
	}

}

//Odd Values
class FirstThread2 implements Runnable{
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if (i%2!=0) {
				System.out.println("First Thread: " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

//Even Values
class SecondThread2 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if (i%2==0) {
				System.out.println("Second Thread: " + i);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}