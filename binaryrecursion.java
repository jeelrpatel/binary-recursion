package extra;
import java.util.Arrays;
public class BinarySearchRecursionMidterm {

	public static void main(String[] args) {
		int[] array = {11, 21, 33, 40, 50}; //list the original array 
		Arrays.sort(array); 
		int low = 0; //indicate the lowest value
		int target = 21; //indicate the target value 
		int high = array.length - 1;
		int result = Recursive(array, low, high, target); //enter the recursive 
		
			if(result != -1) {
				System.out.println(target+ " found at index: " +result);  //case if target is found successfully
			}
			
			else {
				System.out.println("Target cannot be found"); //case if target is not found
			}
	}
	
	static int Recursive(int[] array, int low, int high, int target) {  //recursive implementation
		if (low > high)  //case if the lower is smaller
			return - 1;

		int middle= (low + high) / 2; 

		if(array[middle] == target) { 
			return middle;

		}
		
		else if(target > array[middle]) { //if target is bigger than the middle 
			return Recursive(array,middle+1, high,target); 

		}
		
		else if(target < array[middle]) {  //if the target is smalle
			return Recursive(array,low,middle-1,target);		
		}
		
		return middle;
		

	}

}
