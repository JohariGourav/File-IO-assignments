//class grep to find a Word in a file
package com.cg.fileio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class grep {
	public static void main(String args[]) throws IOException {
		File file = new File("C:\\Users\\gjohari\\Git Push\\HI.java");
		Scanner src = new Scanner(file);
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter file");
		String str = sr.nextLine();

		System.out.println("Enter word to be searched");
		String word = sr.next();

		int c = 0, nf = 0;
		while (src.hasNextLine()) {
			String line = src.nextLine();
			if (line.contains(word)) {
				c++;
				System.out.println("Found" + c);
			} else {
				c++;
				nf++;
			}
		}
		if (c == nf) {
			System.out.println("Not found");
		}

	}
}