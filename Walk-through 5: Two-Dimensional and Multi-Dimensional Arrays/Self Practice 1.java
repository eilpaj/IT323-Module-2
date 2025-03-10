// 1. Create a program that checks if a matrix is symmetric.

package neil;

public class neilneil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[][] matrix = {
		            {1, 2, 3},
		            {2, 5, 6},
		            {3, 6, 9}
		        };

		        int rows = matrix.length;
		        int cols = matrix[0].length;
		        boolean isSymmetric = true;

		        if (rows != cols) {
		            isSymmetric = false;
		        } else {
		            for (int i = 0; i < rows; i++) {
		                for (int j = 0; j < cols; j++) {
		                    if (matrix[i][j] != matrix[j][i]) {
		                        isSymmetric = false;
		                        break;
		                    }
		                }
		            }
		        }

		        if (isSymmetric) {
		            System.out.println("The matrix is symmetric.");
		        } else {
		            System.out.println("The matrix is NOT symmetric.");
		        }
	}

}
