//7. Write a menu driven program to do following operations :
//a) Compute area of circle
//b) Compute area of rectangle
//c) Compute area of triangle
//d) Exit
package assignment_2;
import java.util.Scanner;
public class Q_7 {

	public static void main(String[] args) 
	{   int choice;
		Scanner sc=new Scanner(System.in);
	do {
		System.out.println("enter your choice for operation:\n"
				+ "1.Compute area of circle\r\n"
				+ "2. Compute area of rectangle\r\n"
				+ "3. Compute area of triangle\r\n"
				+ "4. Exit");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			double radius,area;
			System.out.println("enter the radius for cicle:");
			radius=sc.nextInt();
			area=(3.14)*radius*radius;
			System.out.println("Area is :"+area);
			break;
		case 2:
			double l,w,a;
			System.out.println("enter length and width of rectangle:");
			l=sc.nextInt();
			w=sc.nextInt();
			a=l*w;
			System.out.println("Area is:"+a);
			break;
		case 3:
			double base,height,area_t;
			System.out.println("enter base and height of triangle:");
			base=sc.nextInt();
			height=sc.nextInt();
			area_t=0.5*(base*height);
			System.out.println("Area is:"+area_t);
			break;
		case 4:
			System.out.println("Thank you !!!");
			break;
		default:
			System.out.println("Enter valid input!!!");
			break;
		}
	}while(choice<4);
	}

}
