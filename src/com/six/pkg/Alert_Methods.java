package com.six.pkg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Methods {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sures\\workspace7\\Selenium_Six_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Alert.html");

		driver.manage().window().maximize();
		
		WebElement simple_Alert = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		
		simple_Alert.click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		alert.accept();
		
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		
		
		Alert alert1 = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
//		alert1.dismiss();
		
		alert1.accept();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		Thread.sleep(3000);
		
		Alert alert2 = driver.switchTo().alert();
		
		alert2.sendKeys("Selenium Testing");
		
		String text = alert2.getText();
		
		System.out.println(text);
		
//		System.out.println(alert2.getText());
		
//		alert2.accept();
		
		alert2.dismiss();
		
		
	}

}
