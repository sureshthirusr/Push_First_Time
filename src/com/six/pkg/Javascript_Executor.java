package com.six.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sures\\workspace7\\Selenium_Six_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement amazon_logo = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;  //Narrowing
		
		js.executeScript("arguments[0].scrollIntoView();" , amazon_logo);
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-2000);");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1500);");
	}

}
