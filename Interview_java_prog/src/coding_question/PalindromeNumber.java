package coding_question;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 12321;
		chechPalindromeNumber(num);
	
	}
	
	public static void chechPalindromeNumber(int num) {
		int reversedNumber=0,r;
		int originalNumber=num;
		while(num > 0) {
			r = num %10;
			reversedNumber=reversedNumber*10+r;
			num = num/10;
			
		}
		if (originalNumber == reversedNumber) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
