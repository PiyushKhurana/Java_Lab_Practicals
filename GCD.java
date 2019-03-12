import java.util.Scanner;
public class GCD {

    public static void main(String[] args) {
	        int num1,num2,gcd = 1;

        Scanner in = new Scanner(System.in);
		System.out.print("Enter the number 1:");
	     num1 = in.nextInt();
		System.out.print("Enter the number 2:");
	     num2 = in.nextInt();

        
        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }

        System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
    }

}