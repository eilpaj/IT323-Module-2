// 2. Implement insertion sort on an array of strings.

package neil;
import java.util.Scanner;

public class neilneil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of words: ");
	        int n = scanner.nextInt();
	        scanner.nextLine();

	        String[] arr = new String[n];

	        System.out.println("Enter " + n + " words:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = scanner.nextLine();
	        }

	        for (int i = 1; i < arr.length; i++) {
	            String key = arr[i];
	            int j = i - 1;

	            while (j >= 0 && arr[j].compareTo(key) > 0) {
	                arr[j + 1] = arr[j];
	                j--;
	            }
	            arr[j + 1] = key;
	        }

	        System.out.print("Sorted Words: ");
	        for (String word : arr) {
	            System.out.print(word + " ");
	        }

	        scanner.close();
	}

}
