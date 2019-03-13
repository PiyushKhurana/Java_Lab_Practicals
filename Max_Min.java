import java.util.Scanner;
public class L
{
	public static void main(String[] args) 
	{
		//int a[] = new int[] { 23, 34, 13, 64, 72, 90, 10, 15, 9, 27 };
		int a[] =new int[10];
		Scanner s =new Scanner(System.in);
		System.out.println("Enter array elements ");
		for(int i=0;i<a.length;i++)
		{	
			a[i]=s.nextInt();
		}
		int min = a[0]; //  assume first elements as smallest number
		int max = a[0]; //  assume first elements as largest number

		for (int i = 1; i < a.length; i++)  // iterate for loop from arrays 1st index (second element)
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("Largest Number in a given array is : " + max);
		System.out.println("Smallest Number in a given array is : " + min);
	}

}