package assignment_1;
import java.util.Scanner;
public class Q_4 {

	public static void main(String[] args) {
		int number_1;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number:");
		number_1=sc.nextInt();
		if (number_1%2==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}

	}

}
