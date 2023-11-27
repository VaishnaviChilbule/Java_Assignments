//4. Write a program to calculate factorial of a number. 
//For e.g. factorial of 5 = 5! = 5 *4*3*2*1 = 120
package assignment_2;
import java.util.Scanner;

public class Q_4 {
	public int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		int number;
		Scanner sc= new Scanner(System.in);
		Q_4 obj=new Q_4();
		System.out.println("Enter number: ");
		number=sc.nextInt();
        int factorial=obj.fact(number);
        System.out.println("factorial is: "+factorial);
        
	}

}
