package org.sample;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Junit {
	static WebDriver driver;
	@BeforeClass
	public static void launch(){
		System.setProperty("webdriver.chrome.driver","E:\\Eclipse\\Browser\\lib\\chromedriver.exe ");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		
	}
	@Before
	public void start()
	{
		Date d=new Date();
		System.out.println(d);
		
	}
	@Test
	public void test1()
	{
	
		Assert.assertTrue(driver.getTitle().contains("Face"));	
		driver.findElement(By.id("email")).sendKeys("rubankumar48@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Bharathi95");
	}
	@After
	public  void end() {
		Date d =new Date();
		System.out.println(d);
	}
	@AfterClass
	public static void exit()
	{
		driver.quit();
	}
}
