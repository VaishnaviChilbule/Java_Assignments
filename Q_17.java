package assignment_1;
//:Write a program to check entered number is Armstrong number or not.
import java.util.Scanner;
import java.math.*;
public class Q_17 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number,l,flag=0,sum=0;
		System.out.println("Enter any number");
		number=sc.nextInt();
		String s=Integer.toString(number);
		l=s.length();
		flag=number;
		for(int i=0;i<=l;i++) 
		{
			int r=number%10;
			sum=(int)(sum+Math.pow(r, l));
			number=number/10;
		}
		if(flag==sum)
			System.out.println("Is armstrong number");
		else
			System.out.println("Not armstrong number");
	}

}
