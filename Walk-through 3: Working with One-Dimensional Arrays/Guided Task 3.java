// 3. Convert the Linear Search into a Binary Search.

package neil;
import java.util.Arrays;
import java.util.Scanner;

public class neilneil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {5, 1, 4, 2, 8};

	        Arrays.sort(arr);

	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number to search: ");
	        int target = scanner.nextInt();

	        int left = 0, right = arr.length - 1;
	        boolean found = false;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (arr[mid] == target) {
	                System.out.println("Element found at index: " + mid);
	                found = true;
	                break;
	            } else if (arr[mid] < target) {
	                left = mid + 1; 
	            } else {
	                right = mid - 1; 
	            }
	        }

	        if (!found) {
	            System.out.println("Element not found in the array.");
	        }

	        scanner.close();
	}

}
