package StringsQuestions;

public class Anagram {

	public static void main(String[] args) {
		String str1="silent";
		String str2="listen";
		System.out.println(checkAnagram(str1,str2));

	}
	
	public static boolean checkAnagram(String s1,String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		int[] charCount=new int[256];
		for(int i=0;i<s1.length();i++) {
			charCount[s1.charAt(i)]++;
			charCount[s2.charAt(i)]--;
		}
		
		for(int count : charCount) {
			if(count != 0) {
				return false;
			}
		}
		return true;
	}

}
