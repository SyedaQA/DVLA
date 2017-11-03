package com.DVLA.TestArtifacts;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;

	public class ExcelDataConfig {
	XSSFWorkbook TestData;
	XSSFSheet sheet1;

			public ExcelDataConfig(String excelpath){
				try {
					File src=new File(excelpath);
					FileInputStream fis= new FileInputStream(src);
					TestData = new XSSFWorkbook(fis);
					sheet1 =TestData.getSheetAt(0);
				
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			

		}			public String getData (int sheetnumber, int row, int column){
				sheet1=TestData.getSheetAt(sheetnumber);
			String data=sheet1.getRow(row).getCell(column).getStringCellValue();
			return data;	
			}
	}



