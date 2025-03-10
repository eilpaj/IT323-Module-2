// 2. Write a program to add two matrices

package neil;

public class neilneil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] matrix1 = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };

		        int[][] matrix2 = {
		            {9, 8, 7},
		            {6, 5, 4},
		            {3, 2, 1}
		        };

		        int rows = matrix1.length;
		        int cols = matrix1[0].length;
		        int[][] result = new int[rows][cols];

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                result[i][j] = matrix1[i][j] + matrix2[i][j];
		            }
		        }

		        System.out.println("Sum of the two matrices:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();
		        }
	}

}
