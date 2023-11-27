//Write a program, which accepts two integers and an operator as a character (+ - * / ), performs the
//corresponding operation and displays the result.
package assignment_1;
import java.util.Scanner;
public class Q_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		 int n1,n2,res=0;
		 char operator;
		 System.out.println("Enter any two numbers ");
		 n1=sc.nextInt();
		 n2=sc.nextInt();
		 System.out.println("Enter operators out of(+,-,*,/)");
		 operator=sc.next().charAt(0);
		 if(operator=='+'){
			 res=n1+n2;
			 System.out.println("addition is:"+res);
		 }
		 else if(operator=='-') {
			 res=n1-n2;
			 System.out.println("substraction is:"+res);
		 }
		 else if(operator=='*') {
			 res=n1*n2;
			 System.out.println("multiplication is:"+res);
		 }
		 else if(operator=='/') {
			 res=n1/n2;
			 System.out.println("division is:"+res);
		 }
		 else {
			 System.out.println("Enter valid operation");
		 }
	}

}
