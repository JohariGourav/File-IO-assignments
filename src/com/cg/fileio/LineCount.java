//class LineCount to accept path of file and and count number of lines in it and print
package com.cg.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineCount {

	public static void main(String args[]) throws IOException, FileNotFoundException {
		int count = 0;
		String line = null;
		File file = new File("C:\\Users\\gjohari\\Git Push\\HI.java");
		FileInputStream fs = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fs);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		BufferedReader reader1 = new BufferedReader(input);

		try {
			while ((line = reader1.readLine()) != null) {
				count++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("total line: " + count);
	}
}
