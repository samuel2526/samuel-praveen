import java.util.Scanner;
public class Rotation {
	public static void main(String args[]) {
		int arr[] = new int[5];
        int rotation;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for(int i=0; i< 5;i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter rotation number");
        rotation = scan.nextInt();
        int tempArr[] = new int[rotation];
        for (int i=0; i< rotation ;i++) {
            tempArr[i] = arr[i];
        }
        for(int i=0 ; i<arr.length - rotation; i++) {
            arr[i] = arr[rotation + i];
        }
        for (int i = 0 ; i<rotation; i++) {
        	int currentPosition = (arr.length - rotation) + i;
        	arr[currentPosition ] = tempArr[i];
        }
        for(int i=0;i<5;i++) {
        	System.out.println(arr[i]);
        }
        
        
	}
}
