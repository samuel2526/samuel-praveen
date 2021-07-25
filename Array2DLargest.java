import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Array2DLargest {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
	    List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				list.add(scanner.nextInt());
			}
		}
        int numbers[] = new int[list.size()];
        for(int i=0; i<list.size(); i++ ) {
        	numbers[i] = list.get(i);
        }
        for(int i=0; i< numbers.length; i++ ) {
        	if( i != (numbers.length-1)) {
        		if((numbers[i] > numbers[i+1]) ) {
            		int temp = numbers[i];
            		numbers[i] = numbers[i+1];
            		numbers[i+1] = temp;
            	}
        	}
        	
        }
        System.out.println("the 5 th smallest number"+numbers[4]);
        
    }
}
