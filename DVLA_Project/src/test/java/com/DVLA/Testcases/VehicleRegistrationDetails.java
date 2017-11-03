package com.DVLA.Testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class VehicleRegistrationDetails {
	
	
	public static void main(String[] args) throws IOException {
		File src=new File("C:\\Users\\Abdul\\workspace\\DVLA_Project\\TestData\\Test Data.xlsx");
		FileInputStream fis= new FileInputStream(src);
		
		
		String fileName="TestData.xlsx";

	    //Find the file extension by splitting file name in substring  and getting only extension name

	    String fileExtensionName = fileName.substring(fileName.indexOf("."));
	    		System.out.println("The extension of file name is " + fileExtensionName);
	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx")){

	    //If it is xlsx file then create object of XSSFWorkbook class

	  XSSFWorkbook TestData = new XSSFWorkbook(fis);
	  XSSFSheet sheet1=TestData.getSheetAt(0);
	 
	 int rowcount= sheet1.getLastRowNum();
	 System.out.println("total rowcount is " + rowcount);
	
	  for (int i = 0;i<rowcount;i++) {

	       String data=sheet1.getRow(i).getCell(0).getStringCellValue();
	       System.out.println("print data "+ data);
	  }
		
	}

}}



