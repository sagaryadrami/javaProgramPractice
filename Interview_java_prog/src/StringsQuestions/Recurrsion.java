package StringsQuestions;

public class Recurrsion {

	public static void main(String[] args) {
		Recurrsion r = new Recurrsion();
		
		String str ="sagar yadrami";
		String result = r.recurssiveStr(str);
		System.out.println(result);

		
	}

	public String recurssiveStr(String str) {
		
		if(str.isEmpty()) {
			return str;
		}
		return recurssiveStr(str.substring(1))+str.charAt(0);
	}
}
