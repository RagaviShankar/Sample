package com.tester;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
//		String currentUrl = d.getCurrentUrl();
//		System.out.println(currentUrl);
//		String title = d.getTitle();
//		System.out.println(title);
//		String pageSource = d.getPageSource();
//		System.out.println(pageSource);
		d.manage().window().maximize();
//		d.manage().window().minimize();
		
//NAVIGATION
//		d.navigate().to("https://www.instagram.com/");
//		d.navigate().back();
//		d.navigate().forward();
//		d.navigate().refresh();
		WebElement email= d.findElement(By.id("email"));
		email.sendKeys("ragav@gmail.com");
		WebElement pass = d.findElement(By.id("passContainer"));
		pass.sendKeys("1234");
		WebElement click = d.findElement(By.name("login"));
		click.click();
	
     
		
		
		
		
	}

}
