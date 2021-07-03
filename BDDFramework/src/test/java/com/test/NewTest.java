package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
WebDriver driver;	
  @Test(priority = 1)
  public void validTtile() {
	  String title = driver.getTitle();
	 Assert.assertEquals("Google", title);
	 
  }
	 @Test(priority = 2)
	 public void navigatetoWebsite() {
		// driver.navigate().to("https://google.com");
	WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys("horizonnjhealth");
		searchBox.submit();
	//WebElement clickLink =driver.findElement(By.xpath("//a[text()= 'Horizon NJ Health: Home https://www.horizonnjhealth.com']"));
		//clickLink.click();
		//String expectedTitle = "Horizon NJ Health";
		//String actualTitle = driver.getTitle();
		//Assert.assertEquals(actualTitle,expectedTitle);
		 
		 
		 
	 }
  
  @BeforeMethod(description = "initilize the browser")
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://google.com");
	  
	  
  }

  @AfterMethod(description = "close the browser")
  public void afterMethod() {
	  driver.close();
  }

}
