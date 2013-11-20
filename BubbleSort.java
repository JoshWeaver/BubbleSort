//Java BubbleSort
//Josh Weaver, October 19th 2013

import java.util.*;

public class BubbleSort{

	public static int[] array = {3,5,6,2,3,7,3,4,6,2,3,6,4,2,4,324,2,3,6,3,2,3,6,3,2,3,6,6,2,3,7,3,4,6,2,3,6,4,2,4,324,2,3,6,3,2,3,6,3,2,3,6,3,3,6,3,3,6,7,2,2,7,23,23,23,7,27,23,75,745,2,45,245,724,72,5,24,7,25,7,245,757,7,8,56,75,896,7968,25,6,7,676,86989,3,93,36,73,673,67,7,3,4,6,2,3,6,4,2,4,324,2,3,6,3,2,3,6,3,2,3,6,3,3,6,3,3,6,7,2,2,7,23,23,23,7,27,23,75,745,2,45,245,724,72,5,24,7,25,7,245,757,7,8,56,75,896};
	public static int temp;

	public static void main(String[] args){
		
		System.out.print("Original list: ");
		for (int k = 0; k < array.length; k++){
				System.out.print(array[k]);
				System.out.print(" ");
		}
		System.out.println();
		System.out.println("Sorting... ");
		
		for (int i = 0; i < (array.length - 1); i++){
			for (int j = 0; j < (array.length - i - 1); j++){
				if (array[j] > array [j + 1]){
					swap(j, j + 1);
				}
			}

		}
		
		System.out.print("Final list: ");
		for (int k = 0; k < array.length; k++){
				System.out.print(array[k]);
				System.out.print(" ");
		}
		
	}
	
	
	public static void swap(int i, int j){
		temp = array[i];
		array[i] = array[j];
		array[j] = temp; 
	}
	
}