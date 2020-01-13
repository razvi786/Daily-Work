package com.cts.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) throws FileNotFoundException,IOException{
		// TODO Auto-generated method stub

		String source_path="C:\\\\Users\\\\Dell\\\\Desktop\\\\data.txt";
		String destination_path="copieddata.txt";
		
		FileInputStream fis=new FileInputStream(source_path);
		FileOutputStream fout=new FileOutputStream(destination_path);
		
		int i;
		
		while((i=fis.read()) != -1) {
			fout.write(i);;
		}
		
		fis.close();
	}

}
