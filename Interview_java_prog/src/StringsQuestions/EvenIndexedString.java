package StringsQuestions;

public class EvenIndexedString {

	public static void main(String[] args) {
	String s="sagar yadrami";
	printEvenIndexedChar(s);

	}

	public static void printEvenIndexedChar(String str) {
		for(int i = 0; i<str.length();i++) {
			if(i% 2 == 0) {
				System.out.println(str.charAt(i));
			}
		}
	}
}
