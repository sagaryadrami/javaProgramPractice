package coding_question;

public class IsPalindrome {

	public static void main(String[] args) {
		System.out.println(checkPalindrome("mom"));

	}
	public static boolean checkPalindrome(String str) {
		String reversedStr = new StringBuilder(str).reverse().toString();
		return str.equals(reversedStr);
	}

}
