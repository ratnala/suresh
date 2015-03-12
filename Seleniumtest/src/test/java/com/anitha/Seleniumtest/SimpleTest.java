package com.anitha.Seleniumtest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleTest {
	@Test
	public void flipkartTest(){
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://flipkart.com");
		String s=driver.getTitle();
		System.out.println(s);
	}
	
	

}
