/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void printUpperTriangularMatrix(int matrix[][],int m,int n) {
	    for(int i=0;i<m;i++) {
	        for(int j=0;j<m;j++) {
	            if(i < j) {
	                matrix[i][j] = 0;
	            }
	            System.out.print(matrix[i][j]);
	        }
	        System.out.println(" ");
	     }
	}
	public static void printLowerTriangularMatrix(int matrix[][],int m,int n) {
	    for(int i=0;i<m;i++) {
	        for(int j=0;j<m;j++) {
	            if(i > j) {
	                matrix[i][j] = 0;
	            }
	            System.out.print(matrix[i][j]);
	        }
	        System.out.println(" ");
	     }
	}
	public static void main(String[] args) {
		int matrix[][] = {
		                {1,2,3},
		                {4,5,6},
		                {7,8,9}
		             };
		printUpperTriangularMatrix(matrix,3,3);
		printLowerTriangularMatrix(matrix,3,3);
		
	}
}
