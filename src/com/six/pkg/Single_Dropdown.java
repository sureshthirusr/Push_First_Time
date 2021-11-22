package com.six.pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sures\\workspace7\\Selenium_Six_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		WebElement new_button = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		
		new_button.click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		driver.findElement(By.name("lastname")).sendKeys("Testing");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("4567987346");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Djh@%r5");

		WebElement date = driver.findElement(By.id("day"));
		
		Select s = new Select(date);
		
		s.selectByValue("15");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select s1 = new Select(month);
		
		s1.selectByIndex(0);
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select s2 = new Select(year);
		
		s2.selectByVisibleText("2020");
		
		boolean multiple = s.isMultiple();
		
		System.out.println("Is Multiple or not: " +multiple);
		
		List<WebElement> opt = s1.getOptions();
		
		for (WebElement webElement : opt) {
			
			String text = webElement.getText();
			
			System.out.println(text);
			
		}
		
		WebElement fso = s.getFirstSelectedOption();
		
		System.out.println(fso.getText());
		
	}

}
