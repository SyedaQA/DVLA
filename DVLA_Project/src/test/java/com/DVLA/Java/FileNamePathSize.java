package com.DVLA.Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileNamePathSize {

	public static void main(String[] args) throws Exception {
		
		File file=new File("JavaDirectory");
	if(!file.exists()){
		file.mkdir();
		System.out.println("Directory is created");
	}
	else
		{System.out.println("Directory is not created");}
	
	    File file1 =new File("JavaDirectory\\JavaSubDirectory");
	if(!file1.exists()){
		file1.mkdir();
		System.out.println("SubDirectory is created");
	}
	else
	    {System.out.println("SubDirectory is not created");}
	
		File file2= new File("JavaDirectory\\JavaSubDirectory\\JavaFile1.txt");
		if(!file2.exists()){
			file2.createNewFile();
			System.out.println("File is created");
		}
		else
		    {System.out.println("File is not created");}
        FileWriter fw=new FileWriter(file2);
        fw.write("This is the File created under Subdirectory - named as JavaSubDirectory");
        fw.flush();
        fw.close();
        System.out.println("Content has been written");
        
        // TO get the File name:
        
        String FileName=file2.getName();
        System.out.println("The file Name is "+ FileName);
        
        //To get the File Size
        double bytes=file2.length();
        System.out.println("The file size is "+ bytes);
        
        
        //To get the File size in kilo Bytes
        System.out.println("The file size is "+ bytes/1024);
        
        //To get the File extension
        String filename="JavaFile1.txt";
        String fileExtensionName = filename.substring(filename.indexOf("."));
		System.out.println("The extension of file name is " + fileExtensionName);
        
		
		
	    
	    
	}

}
