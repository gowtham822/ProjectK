package com.tcs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
	
	public Reader() throws IOException {
		
		System.out.println("Reader");
		
        File f = new File("C:\\Users\\gowtham\\OneDrive\\Desktop\\Practice\\gowtham.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader bf = new BufferedReader(fr);
		
		System.out.println(bf.readLine());
		
		bf.close();
	}

}
