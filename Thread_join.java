 

public class Thread_join extends Thread { 
	public void run() 
	{ 
		System.out.println("this is "); 
		try { 
			Thread.sleep(300); 
		} 
		catch (InterruptedException ie) { 
		} 
		System.out.println("computer "); 
	} 
	public static void main(String[] args) 
	{ 
		Thread_join c1 = new Thread_join(); 
		Thread_join c2 = new Thread_join(); 
		c1.start(); 

		try { 
			c1.join();  
		} 
		catch (InterruptedException ie) { 
		} 

		c2.start(); 
	} 
} 
