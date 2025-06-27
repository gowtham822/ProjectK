package com.tcs;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) throws IOException {
		 
		ClassPathXmlApplicationContext ctx  = new ClassPathXmlApplicationContext("Beans.xml");
	
	}

}
