package com.six.pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sures\\workspace7\\Selenium_Six_Testing\\Driver\\chromedriver.exe");
		
		//Map Concept
		
		WebDriver driver = new ChromeDriver();  // Upcasting
		
		//Interface refname = keyword class
		
		driver.get("https://www.facebook.com/"); 
		
		//To give the url
		
//		driver.get("https://www.youtube.com/"); //Overloading
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("Title of the webpage: " +title); //concordination
		
		String cu = driver.getCurrentUrl();
		
		System.out.println("Current url of page: " +cu);
		
		driver.navigate().to("https://www.youtube.com/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		Thread.sleep(3000); //wait concept
		
		driver.navigate().refresh();
		
		driver.close();
	
	}

}
