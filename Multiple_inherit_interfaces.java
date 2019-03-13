 
interface I1 
{ 
	 void show1(); 
	 
} 

interface I2 
{ 
	 void show2(); 
 
} 


class M implements I1, I2 
{ 
	
	 public void show1() 
	{ 
		System.out.println("Interface 1 function"); 
	} 
	
	 public void show2() 
	{ 
		System.out.println("Interface 2 function"); 
	} 
	 public void show3() 
	{ 
		System.out.println("Derived class function"); 
	}
	
	public static void main(String args[]) 
	{ 
		M d = new M(); 
		d.show1();
		d.show2();
		d.show3();
	} 
} 
