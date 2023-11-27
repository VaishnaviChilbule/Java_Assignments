//Write a program to calculate factors of a given number.
package assignment_2;
import java.util.Scanner;
public class Q_5 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int input_num;
		System.out.println("enter the number:");
		input_num=sc.nextInt();
		for(int i=1;i<=input_num;i++) {
			if (input_num%i==0) {
				System.out.print(i+" ");
			}
		}
		

	}

}
