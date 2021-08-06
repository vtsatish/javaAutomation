package com.automation.practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleUI {
	WebDriver driver;
	
  @Test
  public void f() {
	     String baseUrl = "https://www.toolsqa.com/";
         System.out.println("Launching Google Chrome browser"); 
         System.setProperty("webdriver.chrome.driver", "/Users/svoleti/diskdrive/gitrepos/Drivers/chromedriver");
	  	 driver = new ChromeDriver();
         driver.get(baseUrl);
         String testTitle = "Free QA Automation Tools Tutorial for Beginners with Examples";
         String originalTitle = driver.getTitle();
         Assert.assertEquals(originalTitle, testTitle);
         driver.close();
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {

  }

  @AfterTest
  public void afterTest() {

  }

}
