// 2. Write a program to transpose a matrix.

package neil;

public class neilneil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[][] matrix = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

		        int rows = matrix.length;
		        int cols = matrix[0].length;
		        int[][] transpose = new int[cols][rows];

		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                transpose[j][i] = matrix[i][j];
		            }
		        }

		        System.out.println("Original Matrix:");
		        for (int i = 0; i < rows; i++) {
		            for (int j = 0; j < cols; j++) {
		                System.out.print(matrix[i][j] + " ");
		            }
		            System.out.println();
		        }

		        System.out.println("Transposed Matrix:");
		        for (int i = 0; i < cols; i++) {
		            for (int j = 0; j < rows; j++) {
		                System.out.print(transpose[i][j] + " ");
		            }
		            System.out.println();
		        }
	}

}
