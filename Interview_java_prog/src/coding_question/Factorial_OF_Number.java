package coding_question;

import java.util.Scanner;

public class Factorial_OF_Number {

	public static void main(String[] args) {
		int factorial=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			factorial = factorial *i;
		}
		System.out.println("The factorial of the number is : " + factorial);
		
	}
}
