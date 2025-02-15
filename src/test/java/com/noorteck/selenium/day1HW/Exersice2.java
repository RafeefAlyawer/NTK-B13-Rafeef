package com.noorteck.selenium.day1HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exersice2 extends Hooks {
	
	public static void main(String[] args) throws InterruptedException {
		setUp("edg");
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		Thread.sleep(2000);
		
	//click register link
		
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();
   // verify the title is Mercury Tours
		
		//String title = "Mercury Tours";
		//WebElement title = driver.findElement(By.xpath(/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img""));
		String actaulTitle = driver.getTitle();
		String expectTitle="Mercury Tours";
		if(!actaulTitle.equals("expectTitle")) {
			System.out.println("faild : page title does not match:" + expectTitle);
		}
		
	//firstName field
	WebElement firstName = driver.findElement(By.name("firstName"));
	firstName.sendKeys("Rafeef");
	Thread.sleep(2000);
	
	//lastName field
	WebElement lastName = driver.findElement(By.name("lastName"));
	lastName.sendKeys("Alyawer");
	
	Thread.sleep(2000);
	
	//phone no
	
	WebElement phoneNo = driver.findElement(By.name("phone"));
	phoneNo.sendKeys("1234567");
	
	Thread.sleep(2000);
	
	//Email field
	WebElement email = driver.findElement(By.id("userName"));
	email.sendKeys("Lofa@yahoo.com");
	
	Thread.sleep(2000);
	
	//address field
	WebElement address = driver.findElement(By.name("address1"));
	address.sendKeys("123street");
	
	Thread.sleep(2000);
	
	// city field
	WebElement city = driver.findElement(By.name("city"));
	city.sendKeys("Ashburn");
	Thread.sleep(2000);
	
	//state field
	WebElement state = driver.findElement(By.name("state"));
	state.sendKeys("VA");
	Thread.sleep(2000);
	
	//zip code field
	WebElement zipCode = driver.findElement(By.name("postalCode"));
	address.sendKeys("20122");
	
	//user name field
	WebElement userName = driver.findElement(By.name("email"));
	userName.sendKeys("Rafeef Alyawer");
	Thread.sleep(2000);
	
	//password field
	
	WebElement password = driver.findElement(By.name("password"));
	password.sendKeys("1234");
	Thread.sleep(2000);
	
	//re-enter password
	WebElement confirmPassword = driver.findElement(By.name("confirmPassword"));
	confirmPassword.sendKeys("1234");
	Thread.sleep(2000);
	
	//click sumbit
	
	WebElement sumbit = driver.findElement(By.name("submit"));
	sumbit.click();
	Thread.sleep(2000);
	
	WebElement confirmationMessage = driver.findElement(By.tagName("body"));
	String textMessage = confirmationMessage.getText();
	if (confirmationMessage.equals("Thank you for registering")) {
		System.out.println("Test Case passed");
	}else {
		System.out.println("TestCase Faild");
	}
	
	
		
		
		
		tearDown();
	}

}
