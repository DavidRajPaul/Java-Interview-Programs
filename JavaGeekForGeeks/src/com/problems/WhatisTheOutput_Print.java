package com.problems;

/*What will be the output of this program?
 * 
 * This will be confusing sometimes. Especially if someone is from JS background.
 * 
 * 1.Static block is the first to be called
 * 2.Then the empty print
 * 3.Constructor
 * 4.Go
*/
public class WhatisTheOutput_Print {
	static {
		System.out.println("Static Called");
	}

	public WhatisTheOutput_Print() {
		System.out.println("Constructor Called");
	}

	{
		System.out.println("Empty block");
	}

	public void go() {
		System.out.println("Go called");
	}

	public static void main(String[] args) {
		new WhatisTheOutput_Print().go();
	}
}
