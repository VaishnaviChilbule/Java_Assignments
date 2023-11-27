//Accept a single digit from the user and display it in words.
//For example, if digit entered is 9, display Nine.
package assignment_1;
import java.util.Scanner;
public class Q_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any single digit number");
		number=sc.nextInt();
		switch(number){
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
		    break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		default:
			System.out.println("Enter single digit number");
	}

	}
}
