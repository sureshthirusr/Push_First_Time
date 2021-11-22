package com.six.pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_MEthods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sures\\workspace7\\Selenium_Six_Testing\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		WebElement email = driver.findElement(By.id("email"));

		email.sendKeys("dhanushamiriyam@gmail.com");
		
//		email.clear();
		
		String attribute = email.getAttribute("value");
		
		System.out.println(attribute);

		WebElement password = driver.findElement(By.name("pass"));

		password.sendKeys("Dhanu@56r");
		
		password.clear();

		boolean displayed = email.isDisplayed();

		System.out.println("Is displayed or not: " + displayed);

		boolean enabled = password.isEnabled();

		System.out.println("Is enabled or not :" + enabled);

		WebElement login_button = driver.findElement(By.name("login"));

		login_button.click();
//		
		boolean selected = login_button.isSelected();
		
		System.out.println("Is selected or not: "+selected);

	}

}
