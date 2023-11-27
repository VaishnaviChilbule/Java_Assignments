//Accept two numbers and calculate GCD of them.
package assignment_2;
import java.util.Scanner;
public class Q_6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1,num2,GCD=0;
		System.out.println("enter the two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
		{  for(int i=1;i<=num1;i++) 
			{   if ((num1%i==0)&&(num2%i==0))
				{
					GCD=i;
				}	
		    }
		}
		else {
			for(int i=1;i<=num2;i++) 
			{   if ((num1%i==0)&&(num2%i==0))
				{
					GCD=i;
				}	
		    }
			
		}
		System.out.println("GCD of:"+num1+","+num2+"="+GCD);

}
}
