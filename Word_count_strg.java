import java.util.Scanner;
public class N
{ 
	public static void main(String args[])
	{ 
		
		Scanner si =new Scanner(System.in);
		System.out.println("Enter String ");
		String s = si.nextLine();
 
		int count = 1;
 
		for (int i = 0; i < s.length() - 1; i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
 
			}
		}
 		System.out.println("Number of words in a string = " + count);
	}
}