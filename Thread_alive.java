


public class Thread_alive extends Thread { 
	public void run() 
	{ 
		System.out.println("this is  "); 
		try { 
			Thread.sleep(500); 
		} 
		catch (InterruptedException ie) { 
		} 
		System.out.println("computer "); 
	} 
	public static void main(String[] args) 
	{ 
		Thread_alive c1 = new Thread_alive(); 
		Thread_alive c2 = new Thread_alive(); 
		c1.start(); 
		c2.start(); 
		System.out.println(c1.isAlive()); 
		System.out.println(c2.isAlive()); 
	} 
} 
