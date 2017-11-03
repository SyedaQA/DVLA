package com.DVLA.TestArtifacts;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import junit.framework.TestCase;

 
	
	public class LogicTests extends TestCase {
		public static WebDriver driver ;	
		
		@BeforeMethod
		public void setUp() throws Exception {
					
			driver = new FirefoxDriver();
	    	driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
			
		}
		
		@AfterMethod
		public void tearDown() throws Exception {
			Thread.sleep(2000);
			driver.close();
	         
	    
	    }


}
