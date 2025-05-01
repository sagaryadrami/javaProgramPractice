package StringsQuestions;

public class Vowels_Constants {

	public static void main(String[] args) {
		String str ="sagar yadrami";
		checkVowels_constants(str);
	}

	public static void checkVowels_constants(String str) {
		int vowels=0;
		int constant=0;
		str = str.toLowerCase();
		
		for(char ch :str.toCharArray()) {
			if(ch>='a' && ch<='z') {
				if(ch =='a' || ch =='e' || ch=='i' || ch=='o'|| ch=='u' ) {
					vowels ++;
				}else {
					constant  ++;
				}
			}
		}
		System.out.println("the number of vowels: "+ vowels);
		System.out.println("the number of constant : "+constant);
	}
}
