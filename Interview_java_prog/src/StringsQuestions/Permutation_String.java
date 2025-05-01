package StringsQuestions;

public class Permutation_String {

	public static void main(String[] args) {
		String s ="abc";
		possiblePermutation(s,"");

	}
	public static void possiblePermutation(String str,String prefix) {
		if(str.length()==0) {
			System.out.println(prefix);
		}else {
			for(int i =0;i<str.length();i++) {
			String rem=	str.substring(0, i) + str.substring(i+1);
			possiblePermutation(rem,prefix+str.charAt(i)); 
			}
		}
	}

}
