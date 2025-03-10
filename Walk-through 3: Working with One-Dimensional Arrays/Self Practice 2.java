// 2. Implement a program to remove duplicates from an array.

package neil;

import java.util.Arrays;

public class neilneil {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5};
        Arrays.sort(numbers);
        int[] temp = new int[numbers.length];
        int j = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                temp[j++] = numbers[i];
            }
        }
        temp[j++] = numbers[numbers.length - 1];

        int[] uniqueArray = Arrays.copyOf(temp, j);

        System.out.println("Array after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}
