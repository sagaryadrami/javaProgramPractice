package coding_question;

public class Reverse_String {

	public static void main(String[] args) {
		System.out.println(reverseWord("sagar"));
	}
	
	public static String reverseWord(String str) {
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			result = result+str.charAt(i);
		}
		return result;
	}
}
