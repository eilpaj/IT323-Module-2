// 2. Implement a Linear Search to find an element in an array.

package neil;
import java.util.Scanner;

public class neilneil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int[] arr = {5, 1, 4, 2, 8};
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number to search: ");
		        int target = scanner.nextInt();

		        boolean found = false;
		        for (int i = 0; i < arr.length; i++) {
		            if (arr[i] == target) {
		                System.out.println("Element found at index: " + i);
		                found = true;
		                break;
		            }
		        }

		        if (!found) {
		            System.out.println("Element not found in the array.");
		        }

		        scanner.close();

	}

}
