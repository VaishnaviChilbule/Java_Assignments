//1:Write a program that accepts numbers continuously as long as the number is positive and prints the 
//sum of the given numbers.
package assignment_2;
import java.util.Scanner;
public class Q_1 {

	public static void main(String[] args)
	{
		int number,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number:");
		do 
		{
			number=sc.nextInt();
			if (number>0)
				sum=sum+number;
			
		}while(number>0);
		System.out.println("sum of numbers entered is:"+sum);
	}

}
