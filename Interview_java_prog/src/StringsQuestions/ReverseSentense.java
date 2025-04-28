package StringsQuestions;

public class ReverseSentense {

	public static void main(String[] args) {
		
		
		String original = "sagar is working";
		ReverseSentense rs =new ReverseSentense();
		String reversed = rs.sentenceReversing(original);
		
		System.out.println(original);
		System.out.println(reversed);

	}

	public String sentenceReversing(String str) {
		String[] words = str.split(" ");
		
		String reversedStr="";
		for(int i=0;i<words.length;i++) {
		 String word=words[i];
		 
		 String newstr="";
		 char ch;
		 for(int j=word.length()-1;j>=0;j--) {
			 ch = word.charAt(j);
			 newstr =newstr+ch;
		 }
		 reversedStr = reversedStr + newstr + " ";
		}
		return reversedStr;
	}
		
	}

