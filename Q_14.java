package assignment_1;
//:Write a  program to print all Prime numbers between 1 to n. 
import java.util.Scanner;
public class Q_14 {

	public static void main(String[] args) {
		int n,flag;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		n=sc.nextInt();
		for(int i=1;i<=n;i++) 
		{
			flag=1;
			for (int j=2;j<=(Math.sqrt(i)+1);++j) 
			{
				if (i%j==0) 
				{
					flag=0;
					break;
				}
			}
			if(flag==1)
				System.out.println(i+" ");
		}

	}

}
