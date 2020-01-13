package com.cts.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String path="C:\\Users\\Dell\\Desktop\\data.txt";
		
		
		File file=new File(path);
		System.out.println("Can Execute? : "+file.canExecute());
		System.out.println("Can Read? : "+file.canRead());
		System.out.println("Can Write? : "+file.canWrite());
		System.out.println("File Exist? : "+file.exists());
		System.out.println("Absolute Path: "+file.getAbsolutePath());
		System.out.println("File Name: "+file.getName());
		
		FileOutputStream fout=new FileOutputStream(file,true);
		
		System.out.print("Enter Data: ");
		Scanner sc=new Scanner(System.in);
		String msg=sc.nextLine();
		
		byte[] b=msg.getBytes();
		
		fout.write(b);
		
		System.out.println("Written to file");
		
		fout.close();
		
	}

}