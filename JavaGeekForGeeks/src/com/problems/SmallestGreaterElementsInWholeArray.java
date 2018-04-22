package com.problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*An array is given of n length, and we need to calculate the next greater element for 
each element in given array. If next greater element is not available in given array
then we need to fill ‘_’ at that index place.*/

/*1. Set - by default sorts its items
 *2. 2 loops- 1st loop to get the element to compare; 2nd loop to compare with the first loop element
 *3. add all the greated values in the set, and by default it will get sorted.
 *4. Pick the first element and add it to the sorted array and clear the set to repeat the same process
 * */

public class SmallestGreaterElementsInWholeArray {

	public void sort(int arr[], int length) {
		Set<Integer> s = new HashSet<>();
		int sortedArr[] = new int[length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (arr[i] != arr[j] && arr[i] < arr[j]) {
					s.add(arr[j]);
				}
			}
			if (s.iterator().hasNext())
				sortedArr[i] = s.iterator().next();
			s.clear();
			System.out.print(sortedArr[i] == 0 ? "_" : sortedArr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 6, 3, 9, 8, 10, 2, 1, 15, 7 };
		new SmallestGreaterElementsInWholeArray().sort(arr, arr.length);
	}

}
