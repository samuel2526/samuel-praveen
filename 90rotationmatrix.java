/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void displayMatrix(int matrix[][], int m , int n ){
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            System.out.print( matrix[i][j] );
	        }
	        System.out.println(" ");
	    }
	}
	
	public static int [][] getTransposeMatrix(int matrix[][], int m , int n ){
	    int transposed_matrix[][] = new int [3][3];;
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            transposed_matrix[i][j] = matrix[j][i]; 
	        }
	    }
	    return transposed_matrix;
	}
	
	public static int [][] rotateMatrix(int matrix[][], int m , int n ){
	    int swapped_matrix[][] = new int[3][3];
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            swapped_matrix[i][j] = matrix[i][(n-1)-j];          
	        }
	    }
	    return swapped_matrix;
	}
	public static void main(String[] args) {
        int matrix[][] = { 
                            { 1, 2, 3 },
                            { 4, 5, 6 },
                            { 7, 8, 9}
                         };
        displayMatrix(matrix,3,3);
        matrix = getTransposeMatrix(matrix,3,3);
        displayMatrix(matrix,3,3);
        matrix = rotateMatrix(matrix,3,3);
        displayMatrix(matrix,3,3);
    }
}
