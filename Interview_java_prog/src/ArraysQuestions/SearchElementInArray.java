package ArraysQuestions;

public class SearchElementInArray {

	public static void main(String[] args) {
    int[] arr = {1,9,30,50,100,91,20,10};
    int search =9;
     boolean found = false;
     
     for(int i=0;i<arr.length;i++) {
    	 if(arr[i]==search) {
    		 System.out.println(" the value of "+search+" is found in the arr");
    		 found=true;
    		 break;
    	 }
     }
     if(!found) {
    	 System.out.println("the value of "+search+" not found in the arr");
     }
     
	}   
	
}

