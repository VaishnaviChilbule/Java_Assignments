package assignment_1;
//Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3
import java.util.Scanner;
public class Q_10 {

	public static void main(String[] args) {
		int m,n,power=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of m and n:");
		m=sc.nextInt();
		n=sc.nextInt();
		for (int i=1;i<=n;i++) {
		 power=power*m;	
		}
		System.out.println("m to the power n is:"+power);
	}

}
