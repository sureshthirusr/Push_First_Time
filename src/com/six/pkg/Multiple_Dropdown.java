package com.six.pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sures\\workspace7\\Selenium_Six_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		driver.manage().window().maximize();
		
		WebElement multidrop = driver.findElement(By.xpath("(//select)[6]"));
		
		Select s = new Select(multidrop);
		
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		
		s.selectByVisibleText("Selenium");
		
		Thread.sleep(3000);
		
		s.selectByValue("4");
		
//		s.deselectByVisibleText("Selenium");
		
		s.deselectAll();
		
		boolean mul = s.isMultiple();
		
		System.out.println("Multiple or not: "+mul);
		
		List<WebElement> opt = s.getOptions();
		
		for (WebElement dropdo : opt) {
			
			String text = dropdo.getText();
			
			System.out.println(text);
			
		}
		
		System.out.println("All selected Options");
		
		List<WebElement> aso = s.getAllSelectedOptions();
		
		for (WebElement select : aso) {
			
			System.out.println(select.getText());
			
		}
		
		WebElement fso = s.getFirstSelectedOption();
		
		System.out.println(fso.getText());
	}

}
