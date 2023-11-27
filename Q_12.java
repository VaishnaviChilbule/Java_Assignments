package assignment_1;
//12:Sum of series :1+2+3+….+n
import java.util.Scanner;
public class Q_12 {

	public static void main(String[] args) {
		int number,total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of digits(n):");
		number=sc.nextInt();
		for(int i=1;i<=number;i++) {
			total=total+i;
		}
		
		System.out.println("Sum of n digits is :"+total);
	}

}
