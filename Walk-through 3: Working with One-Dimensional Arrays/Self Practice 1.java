// 1. Modify the program to accept user input for an array.

package neil;
import java.util.Scanner;

public class neilneil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
	}

}
