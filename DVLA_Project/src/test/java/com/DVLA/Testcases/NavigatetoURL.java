package com.DVLA.Testcases;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.DVLA.TestArtifacts.ExcelDataConfig;
import com.DVLA.TestArtifacts.LogicTests;

import junit.framework.TestCase;

public class NavigatetoURL {
	//String vehicleDetails=ExcelDataConfig.readdata
@Test
	public void getVehicleInformation(){
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.navigate().to("https://www.gov.uk/get-vehicle-information-from-dvla");
		/*driver.findElement(By.xpath(".//*[@id='get-started']/a")).click();
		driver.findElement(By.xpath(".//*[@id='Vrm']")).sendKeys("sm57weo");
			
		ExcelDataConfig read = new ExcelDataConfig("C:\\Users\\Abdul\\workspace\\DDT\\TestData.xlsx");
		String data=read.getData(0,13,1);
		System.out.println(read.getData(0, 13, 1));}*/

	}
	
	
	

}
