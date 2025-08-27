package tnsbackendtraining;

public class ReverseArray {
	public void reverse(int[] arr) {
		System.out.print("Reversed Array:");
		for(int i=arr.length-1;i>=0;i--) {
		  System.out.print(arr[i] + " ");
		
		}
		System.out.println();
	}	
}
