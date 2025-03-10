// 2. Find the maximum and minimum value in an array.

package neil;

public class neilneil {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 12, 89, 5, 37};
        int max = numbers[0];
        int min = numbers[0];

        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }
}
