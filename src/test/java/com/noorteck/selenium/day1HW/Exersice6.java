package com.noorteck.selenium.day1HW;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.Hooks;

public class Exersice6 extends Hooks{
	public static void main(String[] args) throws InterruptedException {
		setUp("edge");
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//verify page title
        String  titlePage=driver.getTitle();
		
		if(titlePage.equals("Alerts")) {
			System.out.println("page title is correct:" +titlePage);
			
		}else {System.out.println("page title not alert");
		
		}
		
		WebElement AlertText=driver.findElement(By.xpath("//a[@href='#Textbox']")); 
		AlertText.click();
		
		WebElement promptBox=driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		promptBox.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
	
		alert.sendKeys("Rafeef");
		alert.accept();
		Thread.sleep(2000);
		
		WebElement textMeassage = driver.findElement(By.id("demo1"));
		
		
		String Text = textMeassage.getText();
		
		
		if(Text.contains("How are you today")) {
			
			System.out.println("message verified:contains: 'How are you today'");
		}else {
			System.out.println("Message verification failed");
					
		}
		
		driver.navigate().refresh();
		
		
		WebElement alertWithOkCancel= driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		alertWithOkCancel.click();
		Thread.sleep(2000);

		WebElement displayBtn = driver.findElement(By.xpath("//button[@class='btn btn-primary']")); 
        displayBtn.click();
		
        
		Alert alertBtn =  driver.switchTo().alert();
		String alertText = alertBtn.getText();
		
		
		if (alertText.contains("Press a Button")) {
			
		    System.out.println("Message verified: contains 'you pressed'");
		    alertBtn.dismiss(); 
		} else {
		    System.out.println("Message verificatio failed'");
		    alertBtn.accept(); 
		}
		
		
		tearDown();
	}

}
