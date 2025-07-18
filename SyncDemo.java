package General_Programs;

class Counter{
	
	int count=0;
	synchronized void increment() {
		count ++;
	}
}
public class SyncDemo {
	
	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread( ()->{
			for(int i=0; i<1000; i++) c.increment();
		});
		
		
		Thread t2 = new Thread(()->{
			for(int i=0; i<1000; i++) c.increment();
		});
		
		t1.start();
		t2.start(); // start method is used to start the thread
		
		t1.join();
		t2.join(); // join method is used to pause the thread until another thread is to be executed
                 
		
		
		System.out.println("Thread running times is "+c.count);
		}
		
	}


