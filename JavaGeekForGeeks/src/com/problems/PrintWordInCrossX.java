package com.problems;

/*Print the word with odd letters as

P         M
 R      A
   O  R
     G
  O    R
 R       A
P          M */

public class PrintWordInCrossX {

	char[] chArr = { 'D', 'A', 'V', 'I', 'D', 'R', 'J' };
	int length = chArr.length;

	public void printX() {
		for (int i = 0; i < chArr.length; i++) {
			for (int j = 0; j < chArr.length; j++) {
				if (i == j || j + i == chArr.length - 1)
					System.out.print(chArr[j]);
				else
					System.out.print("-");
			}
			System.out.println();
		}
	}
}
