//John Smith
package census2000;

import java.io.IOException;
import java.util.Scanner;

public class Main  {
	
	static Scanner keyboard = new Scanner(System.in);
	static String response = null;
	static LastNames value = new LastNames();
	static String userInput;
	
	public static void main(String[] args) throws IOException{
		LastNames[] localArray = new LastNames[151671];
		Array i = new Array();
		i.create();
		localArray= i.getArray();
		System.out.println("Please wait while the census is sorted.");
		insertionSort(localArray);
		
		do {
			System.out.println("Please enter a name.");
			userInput = keyboard.nextLine();
			value.setName(userInput);
			
			int location = binarySearch(localArray, value, 0, localArray.length);
			if(location >=0) {				
				System.out.println("Index of name searched: " + location +" \n" + localArray[location]);
			}
			else {
				System.out.println("Name Not Found");				
			}
			
			System.out.println("Would you like to search any other names?");
			System.out.println("Y or y if yes");
			
			response = keyboard.nextLine();
		} while(response.charAt(0) == 'y' || response.charAt(0) == 'Y');
		
		keyboard.close();
		System.out.println("end of program");
	}
	
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		T newVal;
		int index;
		for (int outter = 1; outter< array.length; outter++){
			 newVal = array[outter];
			 index = outter;	
			 while(index > 0 && array[index - 1].compareTo(newVal) > 0) {
				 array[index] = array[index - 1];
				 index --;	 
			 }
			 array[index] = newVal;
		 }
	}
	
	public static <T extends Comparable<T>> int binarySearch(T[] array,T value, int low, int high) {
		 int middle;
		
		 if(low == 151671)
			 return -1;
		 if(low > high)
			 return -1;
		 
		 middle = (low + high) / 2;
		 if(array[middle].compareTo(value)==0) {			 
			 //if middle, return middle	
			 return middle;
		 }
		 else if(array[middle].compareTo(value) < 0) {			 
			 // recursive if value compared to is larger
			 return binarySearch(array, value, middle + 1, high);
		 }
		 else {			 
			 // recursive if value compared to is smaller
			 return binarySearch(array, value, low, middle - 1); 
		 }
	 }
}
