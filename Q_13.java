package assignment_1;
//14:Write a  program to find sum of all even and odd numbers between 1 to n.
import java.util.Scanner;
public class Q_13 {

	public static void main(String[] args) {
	int number,sum_even=0,sum_odd=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number:");
	number=sc.nextInt();
	for(int i=1;i<=number;i++) {
		if(i%2==0)
			sum_even=sum_even+i;
		else
			sum_odd=sum_odd+i;
	}
	System.out.println("sum of even is:"+sum_even);
	System.out.println("sum of odd is:"+sum_odd);

	}

}
