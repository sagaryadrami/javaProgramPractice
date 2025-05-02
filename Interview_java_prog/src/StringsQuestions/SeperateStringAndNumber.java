package StringsQuestions;

public class SeperateStringAndNumber {

	public static void main(String[] args) {
		String str = "sagar123yadrami";
		seperateStringAndNumberFromString(str);
	}
	
	public static void seperateStringAndNumberFromString(String str) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(char ch :str.toCharArray()) {
			if(Character.isAlphabetic(ch)){
				sb1.append(ch);
			}if(Character.isDigit(ch)) {
				sb2.append(ch);
			}
		}
		System.out.println(sb1.toString());
		System.out.println(sb2.toString());
	}

}
