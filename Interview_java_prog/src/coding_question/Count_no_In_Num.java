package coding_question;

public class Count_no_In_Num {

	public static void main(String[] args) {
		int num =994094;int a =0;
		if(num <0) {
			num = num*-1;
			
		}else if(num==0){
			num=1;//test
		}//123
		while(num>0) {
			num = num/10;
			a++;
		}
		System.out.println(a);
	}

}
