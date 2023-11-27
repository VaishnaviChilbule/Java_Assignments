package assignment_1;
import java.util.Scanner;
public class Q_7 {

	public static void main(String[] args) {
		//Accept a lowercase character from the user and check whether the character is a vowel or consonant. 
		//(Hint: a, e, i, o, u are vowels)
		Scanner sc=new Scanner(System.in);
		char c;
		System.out.println("Enter any character:");
		c = sc.next().charAt(0);
		if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')) {
			System.out.println("Vowel ");
		}
		else
			System.out.println("Consonent ");
		
	}

}
