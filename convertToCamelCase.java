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
	public static void convertToCamelcase(String str) {
	    int index = 0;
	    char char_array[] = str.toCharArray();
	    for(int i=0;i<char_array.length;i++) {
	        if(char_array[i] == ' ') {
	            char_array[i+1] = Character.toUpperCase(char_array[i+1]);
	        } else {
	            char_array[index] = char_array[i];
	            index++;
	        }
	        
	    }
	    for(int i=0;i<char_array.length;i++) {
	        System.out.print(char_array[i]);
	    }
	}
	public static void main(String[] args) {
		
		String str = "print lower triangular Matrix";
		convertToCamelcase(str);
	}
}
