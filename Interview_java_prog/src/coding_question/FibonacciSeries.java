package coding_question;

public class FibonacciSeries {

	public static void main(String[] args) {

		int num= 8;
		int first=0;
		int second=1;
		System.out.println("fibonacci series are ");
		for(int i=0;i<=num;i++) {
			
			int next= first+second;
			System.out.println(next);
			first=second;
			second=next;
			next=first;
			
		}

	}

}
