package coding_question;

public class SumOfDigts_In_Numbers {

	public static void main(String[] args) {
		int n = 222;
		System.out.println(sumOfNumber(n));
		//test
	}
	
	public static  int sumOfNumber(int num) {
		int sum =0;
		while(num>0) {
			int digit = num%10;
			sum = sum +digit;
			num = num/10;
			
		}
		return sum;
		
	}

}
