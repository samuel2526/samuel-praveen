/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    
	    int arr1[] = {1,4,5,6,4,4};
	    int arr2[] = {1,5,4};
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++) {
            set.add(arr1[i]);
        }
        int size = set.size();
        for(int i=0;i<arr2.length;i++) {
            set.add(arr2[i]);
        }
        if(set.size() == size) {
            System.out.println("The given array is the subset");
        } else {
            System.out.println("The given array is not the subset");
        }
	}
}
