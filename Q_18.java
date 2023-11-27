//Create menu driven program for Pizza Shop.And display total amount
package assignment_1;
import java.util.Scanner;

public class Q_18 {

	public static void main(String[] args) {
		
		int number,rate = 0,amount,quantity;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice of your pizza"+"\n"+
		                    "1.Margherita 99"+"\n"+
				            "2.Farmhouse 149"+"\n"+
		                    "3.Veggie delight 189"+"\n"+
				            "4.Paneer Tandoori 299"+"\n"+
		                    "5.Paneer Makhani 359"+"\n"+
				            "6.Exit");
		number=sc.nextInt();
		switch(number)
		{
		case 1:
			rate=99;
			System.out.println("Margherita");
			break;
		case 2:
			rate=149;
			System.out.println("Farmhouse");
		    break;
		case 3:
			rate=189;
			System.out.println("Veggie delight");
			break;
		case 4:
			rate=299;
			System.out.println("Paneer Tandoori");
			break;
		case 5:
			rate=359;
			System.out.println("Paneer Makhani");
			break;
		
		default:
			System.out.println("Thank you visit again...");
			break;
	    }
		
		System.out.println("Price="+rate);
		System.out.println("Enter quantity");
		quantity=sc.nextInt();
		amount=rate*quantity;
		System.out.println("Total Bill is: "+amount);
	}
}
