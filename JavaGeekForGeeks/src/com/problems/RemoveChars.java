package com.problems;

import java.util.Scanner;

/*Given two Strings s1 and s2, remove all the characters from s1 which is present in s2.
Input: s1=”expErIence”, s2=”En”
output: s1=”exprIece”*/

/*Algorithm
 * 1. convert string to array
 * 2. Compare and replace the same char with ""
 * */

public class RemoveChars {

	public void getInputAndProcess() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter String 1");
		String s1 = in.nextLine();
		System.out.println("Enter String 2");
		String s2 = in.nextLine();
		removeChars(s1, s2);
	}

	public void removeChars(String str1, String str2) {

		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		int c1Len = c1.length;
		int c2Len = c2.length;
		String result = str1;

		for (int i = 0; i < c1Len; i++) {
			for (int j = 0; j < c2Len; j++) {
				if (c1[i] == c2[j]) {
					result = result.replace(c1[i] + "", "");
				}
			}
		}
		if (result.equals(str1)) {
			System.out.println("No matching letters");
		} else {
			System.out.println(result);

		}
	}

	public static void main(String[] args) {
		new RemoveChars().getInputAndProcess();
	}

}
