// 3. Implement matrix multiplication.

package neil;

public class neilneil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[][] matrixA = {
		            {1, 2, 3},
		            {4, 5, 6}
		        };

		        int[][] matrixB = {
		            {7, 8},
		            {9, 10},
		            {11, 12}
		        };

		        int rowsA = matrixA.length;
		        int colsA = matrixA[0].length;
		        int colsB = matrixB[0].length;
		        
		        int[][] result = new int[rowsA][colsB];

		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsB; j++) {
		                for (int k = 0; k < colsA; k++) {
		                    result[i][j] += matrixA[i][k] * matrixB[k][j];
		                }
		            }
		        }

		        System.out.println("Product of the two matrices:");
		        for (int i = 0; i < rowsA; i++) {
		            for (int j = 0; j < colsB; j++) {
		                System.out.print(result[i][j] + " ");
		            }
		            System.out.println();
		        }
	}

}
