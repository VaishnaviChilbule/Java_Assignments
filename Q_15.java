package assignment_1;
//Check whether the number is palindrome or not?
import java.util.Scanner;
public class Q_15 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number,flag=0,sum=0;
		System.out.println("Enter any number:");
		number=sc.nextInt();
		flag=number;
		while(number>0) 
		{ 
			int r=number%10;
			sum=sum*10+r;
			number=number/10;
		}
		if(flag==sum)
		     System.out.println("Number is palindrome ");
		else
			 System.out.println("Not a palindrome");
				

	}

}
