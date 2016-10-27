/**
 * - [x] Given an array of ints = [6, 4, 0, 5, 0, 0, 0, 1, 0] move   
 * all non zero numbers to the left and zeros to the right. How can you now improve your answer to O(n)
 * @author tasneem
 *
 */
public class Test1 {
	public static void main(String[] args) {
		int a[] = {6,4,0,5,0,0,0,1,0};
		System.out.println("Before : ");
		for (int i = 0 ; i < a.length; i++) {
			System.out.print(a[i]);	
		}
		System.out.println("");
		
		moveZerosToRight(a);
		System.out.println("After : ");
		for (int i = 0 ; i < a.length; i++) {
			System.out.print(a[i]);	
		}
		System.out.println("\n\n");
	
	}
	
	public static void moveZerosToRight(int[] input) {

	    int n = input.length;

	    int zeroIndex = n - 1;
	    int i = 0;

	    while(i < zeroIndex) {

	        if(input[i] == 0) {
	            int temp = input[i];
	            input[i] = input[zeroIndex];
	            input[zeroIndex] = temp;
	            zeroIndex--;
	            continue;
	        }
	        i++;
	    }

	}
}
