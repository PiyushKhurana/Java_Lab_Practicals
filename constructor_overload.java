 
class Box 
{ 
	int width, height, depth; 

	Box(int w, int h, int d) 
	{ 
		width = w; 
		height = h; 
		depth = d; 
	} 

	 
	Box() 
	{ 
		width = height = depth = 0; 
	} 

	
	Box(int len) 
	{ 
		width = height = depth = len; 
	} 
 
	int volume() 
	{ 
		return width * height * depth; 
	} 
} 

 
public class constructor_overload 
{ 
	public static void main(String args[]) 
	{  	Box mybox2 = new Box();
		Box mybox3 = new Box(7); 
		Box mybox1 = new Box(5,10,15); 
		 
		

		int vol; 

		
		vol = mybox1.volume(); 
		System.out.println(" Volume of mybox1 is " + vol); 

		
		vol = mybox2.volume(); 
		System.out.println(" Volume of mybox2 is " + vol); 

		 
		vol = mybox3.volume(); 
		System.out.println(" Volume of mybox3 is " + vol); 
	} 
} 
