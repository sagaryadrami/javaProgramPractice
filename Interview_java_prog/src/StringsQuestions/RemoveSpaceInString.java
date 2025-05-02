package StringsQuestions;

public class RemoveSpaceInString {

	public static void main(String[] args) {
		RemoveSpaceInString rm = new RemoveSpaceInString();
		String s ="Api Testing done using the rest assured";
		System.out.println(rm.removeSpacefromString(s));
	}

	public String removeSpacefromString(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<str.length();i++) {
			if(str.charAt(i) != ' ') {
				sb.append(str.charAt(i));
			}
			
		}
		return sb.toString();
	}
}
