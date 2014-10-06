import java.util.Scanner;

public class ArrayTester {
	public static void main (String[] args)	{
		
		Scanner in = new Scanner(System.in);
		final int LENGTH = 100;
		
		int[] a = new int[LENGTH];
		int[] b = new int[LENGTH];
		
		int input;
		
		//taking input into the array 1
		for(int i = 0; i < a.length; i++){
			
			System.out.print("Enter data for Array 1 (0 to finish):");
			
			input = in.nextInt();
			
			if(input == 0){
				break;
			}else{
				a[i] = input;
			}
		}
		
		System.out.println("");
		
		//taking input into the array 2
		for(int i = 0; i < b.length; i++){
			
			System.out.print("Enter data for Array 2 (0 to finish):");
			
			input = in.nextInt();
			
			if(input == 0){
				break;
			}else{
				b[i] = input;
			}
		}
		
		System.out.println("");
		
		
		// printing all of the output
		System.out.print("Values for array 1: "); 
		printArray(a);
		System.out.println("");
		System.out.print("Values for array 2: ");
		printArray(b);
		
		if(a[0] != 0 && b[0] != 0){
			System.out.println();
			System.out.print("Duplicate data: ");
			displayCommon(a,b);
			System.out.println("");
			
			System.out.print("Uncommon data: ");
			for(int i = 0; i < displayUncommon(a,b).length; i++){
				//if(displayUncommon(a,b)[i] != 0){
					System.out.print(displayUncommon(a,b)[i] + " ");
			//	}else{
				//	continue;
			//	}
			}
		}
		
	}
	
	// method to print array's elements excluding "0"
	public static void printArray(int[] array){
		if(array[0] != 0){
			for(int i = 0; i < array.length; i++){
				if(array[i] != 0){
					System.out.print(array[i] + " ");
				}else{
					continue;
				}
			}
		}else{
			System.out.println("Array is empty");
		}
	}
	
	// method compares elements of the arrays and prints the common ones, and the their count
	public static void displayCommon(int[] array1, int[] array2){
		int count = 0;
		for(int i = 0; i < array1.length; i++){
			for(int y = 0; y < array1.length; y++){
				if(array1[i] == array2[y]){
					if(array1[i] != 0){
						System.out.print(array1[i] + " ");
						count++;
					}else{
						continue;
					}
				}	
			}
		}
		System.out.println("");
		System.out.print("Number of common data: "+count);
	}
	
	
	
	// check the workings of the array3
	
	//returns an array with the uncommon elements of the parameter arrays
	
	public static int[] displayUncommon(int[] array1, int[] array2){
		int[] array3 = new int[array1.length];
		
		for(int i = 0; i < array1.length; i++){
			for(int y = 0; y < array1.length; y++){
				if(array1[i] != array2[y]){
					
					
					if(array1[i] != 0){
						if(i > 0 && array3[i] != array3[i-1]){
							array3[i] = array1[i];
						}
					}else{
						continue;
					}
				}	
			}
		}
		return array3;		
	}
}
	
	

