package notforgit;

public class SwapTwoString {

	public static void main(String[] args) {
		String str1="sagar";
		String str2="java";
		firstWay(str1,str2);
		secondWay(str1,str2);

	}

	
	public static void firstWay(String str1,String str2) {
		System.out.println("before swapping str 1 : "+str1);
		System.out.println("before swapping str 2 : "+str2);
		
		String temp = str1;
		str1=str2;
		str2=temp;
		
		System.out.println("after swapping str1 : "+str1);
		System.out.println("after swapping str2 : "+str2);
	}
	
	public static void secondWay(String str1,String str2) {
		System.out.println("before swapping str1 : "+str1+" before swapping str2 :"+str2);
		
		str1=str1+str2;
		str2=str1.substring(0,str1.length() - str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("after swapping str1 : "+str1+" after swapping str2 : "+str2);
	}
}
