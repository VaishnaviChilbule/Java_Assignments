//Write a program to find factorial of a given number. ex:no5  fact=5*4*3*2*1=120
package assignment_1;
import java.util.Scanner;
public class Q_9 
{

	public static void main(String[] args) 
	{
		int number,fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of number is:"+fact);
    }

}
