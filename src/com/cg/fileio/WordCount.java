//class WordCount to accept path of file and count number of words in it and print
package com.cg.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) throws IOException, FileNotFoundException {

		int countword = 0;
		String line = null;
		File file = new File("C:\\Users\\gjohari\\Git Push\\Sample.txt");
		BufferedReader reader = new BufferedReader(new FileReader(file));

		try {
			while ((line = reader.readLine()) != null) {

				String words[] = line.split(" ");
				countword += words.length;
				System.out.println(words);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("the wordcount is: " + countword);
	}

}
