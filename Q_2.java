//2. Write a program to accept two integers x and n and compute x raised to n.
package assignment_2;
import java.util.Scanner;
import java.math.*;
public class Q_2 {

	public static void main(String[] args) 
	{
		int x,n,power_num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of x & n:");
		x=sc.nextInt();
		n=sc.nextInt();
		power_num=(int) Math.pow(x,n);
		System.out.println("x raised to n is :"+power_num);
		
	}

}
