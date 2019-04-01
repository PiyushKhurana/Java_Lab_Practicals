
class Base
{ 
	void message() 
	{ 
		System.out.println("This is base class"); 
	} 
} 


class Derived extends Base 
{ 
	void message() 
	{ 
		System.out.println("This is derived class"); 
	} 

	
	void display() 
	{ 
		
		message(); 

		
		super.message(); 
	} 
} 


class super_method
{ 
	public static void main(String args[]) 
	{ 
		Derived s = new Derived(); 

		
		s.display(); 
	} 
} 
