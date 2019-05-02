package com.lp.logics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISTest {

	public static void main(String[] args) {
		FileInputStream file = null;
		int data;
		char ch;
		try {
			// create FileinputStream obj.
			file = new FileInputStream("src/com/lp/logics/Lalit.txt");
			// read data from file
			while ((data = file.read()) != -1) {
               //printing reading data
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close file obj.
			try {
				if (file != null)
					file.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} // finally

	}// main

}// class
