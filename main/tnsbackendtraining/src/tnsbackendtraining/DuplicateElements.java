package tnsbackendtraining;

public class DuplicateElements {

	public static void main(String[] args) {
        int[] arr = {10, 78, 78, 90, 56, 90, 2, 56, 21};
        
        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
	}
}
