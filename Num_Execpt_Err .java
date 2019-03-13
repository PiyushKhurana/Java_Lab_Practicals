 class NumberE 
{ 
	public static void main(String args[]) 
	{ 
		try { 
		
			int num = Integer.parseInt ("jajoo") ; 

			System.out.println(num); 
		} catch(NumberFormatException e) { 
			System.out.println("Number format exception has occur"); 
		} 
	} 
} 
