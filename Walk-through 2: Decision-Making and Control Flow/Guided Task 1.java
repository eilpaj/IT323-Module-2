// 1. Modify the program to check if a number is even or odd.

package neil;
import java.util.Scanner;

public class neilneil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (number % 2 == 0) {
	            System.out.println("The number " + number + " is even.");
	        } else {
	            System.out.println("The number " + number + " is odd.");
	        }

	        scanner.close();

	}

}
