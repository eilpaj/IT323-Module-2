// 1. Create an array of 5 student grades and calculate the average.

package neil;

public class neilneil {
    public static void main(String[] args) {
        int[] grades = {85, 90, 78, 88, 92};
        int sum = 0;
        
        for (int grade : grades) {
            sum += grade;
        }
        
        double average = (double) sum / grades.length;
        System.out.println("Average Grade: " + average);
    }
}
