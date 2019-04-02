
import java.lang.*; 

class Thread_prio extends Thread 
{ 
	public void run() 
	{ 
		System.out.println("Inside run method"); 
	} 

	public static void main(String[]args) 
	{ 
		Thread_prio t1 = new Thread_prio(); 
		Thread_prio t2 = new Thread_prio(); 
		Thread_prio t3 = new Thread_prio(); 

		System.out.println("t1 thread priority : " + 
							t1.getPriority()); 
		System.out.println("t2 thread priority : " + 
							t2.getPriority());  
		System.out.println("t3 thread priority : " + 
							t3.getPriority());  

		t1.setPriority(3); 
		t2.setPriority(6); 
		t3.setPriority(9); 

	
		System.out.println("t1 thread priority : " + 
							t1.getPriority()); 
		System.out.println("t2 thread priority : " + 
							t2.getPriority()); 
		System.out.println("t3 thread priority : " + 
							t3.getPriority()); 

		
		
	} 
} 
