import java.util.Scanner;
  
public class Floyd_Pyramid
{ 
    public static void print(int n) 
    { 
        int i, j, num=1; 
          
        
        for(i=0; i<n; i++) 
        { 
  
            
            for(j=0; j<=i; j++) 
            { 
                System.out.print(num+ " "); 
                  
                num = num + 1; 
            } 
  
            System.out.println(); 
        } 
    } 
  
    public static void main(String args[]) 
    { 
        int n; 
        Scanner in = new Scanner(System.in);
		System.out.print("Enter the number");
	     n = in.nextInt(); 
		 print(n);

    } 
} 
