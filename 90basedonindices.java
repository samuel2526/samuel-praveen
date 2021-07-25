/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
   public static void displayMatrix(int matrix[][], int m , int n ){
	   
	   for(int j=0;j<m;j++){
	        for(int i=m-1;i>=0;i--){
	            System.out.print( matrix[i][j] );
	        }
	        System.out.println(" ");
	    }
	}
	
	
	public static void main(String[] args) {
        int matrix[][] = { 
                            { 1, 2, 3 },
                            { 4, 5, 6 },
                            { 7, 8, 9}
                         };
        displayMatrix(matrix,3,3);
        
    }
}    
