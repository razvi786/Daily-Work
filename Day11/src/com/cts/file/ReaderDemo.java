package com.cts.file;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("copieddata.txt");
		FileInputStream fis=new FileInputStream("copieddata.txt");
		BufferedReader br=new BufferedReader(fr);
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		int input;
		
		while((input=bis.read())!=-1) {
			System.out.print((char)input);
		}
		
	}

}
