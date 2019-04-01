 
class Q 
{ 
	public static void main(String args[]) 
	{ 
		
		int b = 80; 

		 
		Integer iobj = new Integer(b); 

		
		float c = 16.6f; 

		 
		Float fobj = new Float(c); 

		

		 
		System.out.println("Values of Wrapper objects (printing as objects)"); 
		 
		System.out.println("Integer object intobj: " + iobj); 
		System.out.println("Float object floatobj: " + fobj); 
		

		
		
		int iv = iobj; 
		float fv = fobj; 
		

		 
		System.out.println("Unwrapped values (printing as data types)"); 
	 
		System.out.println("int value : " + iv); 
		System.out.println("float value : " + fv); 
		
	} 
} 
