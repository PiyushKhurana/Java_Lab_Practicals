 

 
 abstract class Base 
{ 
	void show() { System.out.println("Base show()"); } 
} 


class Derived extends Base 
{ 
	
	void show() { System.out.println("Derived show()"); } 
} 


class abstract_class 
{ 
	public static void main(String[] args) 
	{ 
		
		Derived obj1 = new Derived(); 
		obj1.show(); 
		

		
	} 
} 
