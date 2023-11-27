//Write a  program to enter a number and print its reverse.
package assignment_1;
import java.util.Scanner;
public class Q_16 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int number,sum=0;
		System.out.println("Enter any number:");
		number=sc.nextInt();
		while(number>0) 
		{ 
			int r=number%10;
			sum=sum*10+r;
			number=number/10;
		}
		System.out.println("Reversed number is :"+sum);
	}
}


