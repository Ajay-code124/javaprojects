package General_Programs;

public class ThreadsExample implements Runnable {

	public void run() {
		System.out.println("Current Thread is : "+ Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		
		//ThreadsExample t1= new ThreadsExample();
		Thread t2 = new Thread(new ThreadsExample());
		
		t2.start();
	}
	
}
