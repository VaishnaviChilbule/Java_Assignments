// Write a program to input angles of a triangle and check whether triangle is valid or not.


package assignment_1;
import java.util.Scanner;
public class Q_8 {

	public static void main(String[] args) {
	int angle_1,angle_2,angle_3,sum_angle;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the angles of triangle:");
	angle_1=sc.nextInt();
	angle_2=sc.nextInt();
	angle_3=sc.nextInt();
	sum_angle=angle_1+angle_2+angle_3;
	if(sum_angle<180)
		System.out.println("triangle is valid");
	else
		System.out.println("triangle is not valid");
	
	}

}
