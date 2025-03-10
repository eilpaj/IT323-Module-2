// 2. Create a program that calculates the area of a rectangle (length × width).

package neil;
import java.util.Scanner;

public class neilneil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculate the area of a rectangle.");
		
		System.out.println("Enter the rectangle's Lenght:");
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		
		System.out.println("Enter the rectangle's Width:");
		int width = scanner.nextInt();
		
		System.out.println("The area of Rectangle is:");
		System.out.println(length * width);
		scanner.close();

	}

}
