package assignment_1;
import java.util.Scanner;
public class Q_6 {

	public static void main(String[] args)
	{
		
	 float basic_sal;
	 double tax =0,in_hand_sal;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter your Basic salary:");
	 basic_sal=sc.nextFloat();
	 if (basic_sal<150000) {
	  	tax=0;
	 }
	 else if((150000<basic_sal)&&(basic_sal<300000)) {
	 	tax= basic_sal*(0.20);
	 }
	 else if(basic_sal>300000) {
	 	tax= basic_sal*(0.30);
	 }
	 else
	 	System.out.println("Enter valid value");
	  in_hand_sal=basic_sal-tax;
	  System.out.println("Salary after tax cutting is: "+in_hand_sal);
	}
    
}
