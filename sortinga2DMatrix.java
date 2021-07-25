/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;
public class Main
{
   //convert 2D to 1D
   //sort the 1D
   //convert 1d to 2d 
   public static void doSort(int matrix[][] , int m, int n) {
	    int matArray[] = new int[9];
	    int k=0; 
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	           matArray[k++] = matrix[i][j];
	           
	        }
	    }
	    for(int i=0;i<m*n;i++){
	        for(int j=i;j<m*n;j++){
	            if(matArray[i]>matArray[j]) {
	               int temp = matArray[i];
	               matArray[i] = matArray[j];
	               matArray[j] = temp;
	            }
	       }
	    }
	    for(int i=0;i<m;i++){
	        for(int j=0;j<n;j++){
	            System.out.print(matArray[i*m+j]);
	       }
	       System.out.println(" ");
	    }     
	}
	
	public static void main(String[] args) {
        int matrix[][] = { 
                            { 2, 5, 9 },
                            { 1, 3, 8 },
                            { 7, 8, 9 }
                         };
        doSort(matrix,3,3);
        
    }
}    
