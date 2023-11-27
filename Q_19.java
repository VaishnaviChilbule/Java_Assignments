//Write a program to find greatest of three numbers using nested if-else.
package assignment_1;
import java.util.Scanner;
public class Q_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 3 numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		if((n1>n2)&&(n1>n3)){
			System.out.println(n1+" is greatest");
		}
		else if((n2>n1)&&(n2>n3)){
			System.out.println(n2+" is greatest");
		}
		else {
			System.out.println(n3+" is greatest");
		}

	}

}
