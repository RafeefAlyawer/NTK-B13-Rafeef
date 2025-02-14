package com.noorteck.selenium.day1HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exercise1 extends Hooks {
	public static void main(String[] args) throws InterruptedException {
		
		setUp("edge");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys("admin");
		
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");
		
		Thread.sleep(5000);
		
		WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginButton.click();
				
		WebElement header = driver.findElement(By.cssSelector("h6"));
		String headerText = header.getText();
		System.out.println(headerText);
		
		if(headerText.equals("Dashboard")) {
			System.out.println("Login successful! Header text");
		}else {
			System.out.println("Login faild or header");
		}
		
		
				
	  tearDown();
	}

}
