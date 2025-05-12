epackage ArraysQuestions;

public class LargestAndSmallestInArray {

	public static void main(String[] args) {
		int[] a = {3,9,79,99,5};
		int[] result = findLargestAndSmallestNumber(a);
        System.out.println(result[0]);
        System.out.println(result[1]); 
        
	}

	public static int[] findLargestAndSmallestNumber(int[] arr) {
		int smallest=arr[0];
		int largest=arr[0];
		for(int num:arr) {
			if(num>smallest) {
				smallest=num;
			}if(num<largest) {
				largest=num;
			}
		}
		return new int[] {smallest,largest};
	}
}
