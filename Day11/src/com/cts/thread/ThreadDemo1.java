package com.cts.thread;

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Thread"); //Only 1 Thread
		
		FirstThread firstThread=new FirstThread();
		
		// we have 2 threads main and firstThread
		
		firstThread.setPriority(10);
		firstThread.start();
		
		SecondThread secondThread=new SecondThread();
		
		secondThread.start();
		
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Main Thread: "+i);
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}

}

//Odd Values
class FirstThread extends Thread{
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if (i%2!=0) {
				System.out.println("First Thread: " + i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

//Even Values
class SecondThread extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			if (i%2==0) {
				System.out.println("Second Thread: " + i);
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}