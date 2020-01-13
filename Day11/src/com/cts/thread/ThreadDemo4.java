package com.cts.thread;

public class ThreadDemo4 {
	
	public static void main(String[] args) {

		Resource resource=new Resource();
		
		Thread firstThread=new Thread(new FirstThread3(resource));
		Thread secondThread=new Thread(new SecondThread3(resource));
		
		firstThread.start();
		secondThread.start();
	
	}

}

//Odd Values
class FirstThread3 implements Runnable{

	Resource resource;
	
	public FirstThread3(Resource resource) {
		this.resource=resource;
	}
	
	@Override
	public void run() {
		resource.display("First Thread");
	}

}

//Even Values
class SecondThread3 implements Runnable{

	Resource resource;
	
	public SecondThread3(Resource resource) {
		this.resource=resource;
	}
	
	@Override
	public void run() {
		resource.display("Second Thread");
	}

}

/* Method 1
class Resource{
	public synchronized void display(String message) {
		for(int i=1;i<=5;i++) {
			System.out.println(message + " "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
*/

//Method 2
class Resource{
	public void display(String message) {
		synchronized (this) {
			for(int i=1;i<=5;i++) {
				System.out.println(message + " "+i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
