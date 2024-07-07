//package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {

	public static void main(String[] args) {

		try {
			// Reading file from path in local directory
			FileReader file = new FileReader("E:\\CoreJava\\Exception\\myfolder\\a.txt");

			// Creating object as one of ways of taking input
			BufferedReader fileInput = new BufferedReader(file);

			for (int counter = 0; counter < 3; counter++)

				System.out.println(fileInput.readLine());

			// Closing file connections
			// using close() method
			fileInput.close();
		} catch (IOException e) {
			System.out.println("File not found");
		}

		System.out.println("Doing further processing");

	}

}
