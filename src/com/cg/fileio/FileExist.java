//FileExist class to accept path of file and check if it exists or not
package com.cg.fileio;
import java.io.IOException;
import java.io.File;

public class FileExist {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\gjohari\\Documents\\Armstrong.class");
		
		if(file.exists()) {
			System.out.println("File exists");
		}
		else
			System.out.println("File doesn't exists");

	}

}
