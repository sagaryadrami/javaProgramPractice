package coding_question;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int number = sc.nextInt();
		if(isPrimeNumber(number)) {
			System.out.println("not a prime number : "+number);
		}else {
			System.out.println("it is prime number : " +number);
		}
	}
	
	//prime number is a number which is divisible by 1 and number itself
	public static boolean isPrimeNumber(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num % i==0) {
				return false;
			}
		}
		return true;
	}
}
