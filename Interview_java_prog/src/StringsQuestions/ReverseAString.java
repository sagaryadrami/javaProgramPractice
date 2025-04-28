package StringsQuestions;

public class ReverseAString {

	
	public static void main(String[] args) {
		
		String name="sagar";
		reversingStr(name);
	}
	
	public static void reversingStr(String str) {
		String reversedStr= "";
		for(int i=str.length()-1;i>=0;i--) {
			 reversedStr =reversedStr + str.charAt(i);
		}
		
		System.out.println(reversedStr);
	}
}
