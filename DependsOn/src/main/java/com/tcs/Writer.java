package com.tcs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
	
	public Writer() throws IOException {
		
		System.out.println("Writer");
		
        File f = new File("C:\\Users\\gowtham\\OneDrive\\Desktop\\Practice\\gowtham.txt");
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("SeniorAssociateProgramming");
		
		fw.close();
		
		System.out.println("Done");
	}
	
	

}
