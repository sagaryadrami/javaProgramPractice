package ArraysQuestions;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
	int[] arr = {10,29,38,47,56,20,5};{
		int n = 28;
		Arrays.sort(arr);
		BinarySearch bs = new BinarySearch();
		int result = bs.useBianrySearch(arr, n);
		if(result == -1) {
			System.out.println("the element is not found in the array");
		}else {
			System.out.println("Element is  found in the array");
		}
	}
	
	}
	
	public int useBianrySearch(int[] arr , int key) {
		int low =0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = low +( high - low ) / 2;
			if(arr[mid]==key) {
				return mid;
			}else if(arr[mid]<key) {
				low = mid+1;
			}else {
				high = mid -1;
			}
		}
		return -1;
	

}
}