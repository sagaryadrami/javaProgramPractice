package coding_question;

public class Reverse_A_Number {

	public static void main(String[] args) {

	int num =123456;
	int rev=0,a,r;

	while(num>0) {
		r = num %10;
		rev = rev * 10 + r;
		num = num / 10;
	}
		System.out.println(rev);
	}

}
