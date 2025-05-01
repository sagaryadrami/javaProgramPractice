package coding_question;

public class SwappingOfNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		System.out.println("Before swapping a = "+a+ " before swapping b = " + b);
		a=a+b;//10+5->s15
		b=a-b;//15-5->10
		a=a-b;//15-10->5
		System.out.println("after swapping a = "+a+" after swapping b = "+b);
	}
//test
}
