/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static int[] productExceptSelf(int[] nums) {
        int products[] = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            products[i] = 1;
            for(int j=0;j<nums.length;j++) {
                if(i != j) {
                   products[i] = products[i]*nums[j];   
                }
            }
            System.out.println(products[i]);
        }
        return products;    
    }
	public static void main(String[] args) {
	    int array[] = new int[] {1,2,3,4};
	    productExceptSelf(array);
	}
}
