package coding_question;

import java.util.Scanner;

public class Even_Or_Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number : ");
		int num = sc.nextInt();
		Even_Or_Odd eo = new Even_Or_Odd();
		eo.checkNumIsEvenOrOdd(num);
	}

	public void checkNumIsEvenOrOdd(int randomNum) {
		
		if(randomNum % 2==0) {
			System.out.println("given number is even : " + randomNum);
		}else {
			System.out.println("given number is odd : " + randomNum);
			
		}
	}
}
