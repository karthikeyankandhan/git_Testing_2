package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelDay2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\pr soft\\eclipse-workspace\\karthikeyankandhan\\SelDay2\\selday2Driver\\IEDriverServer.exe");
		
		WebDriver d = new InternetExplorerDriver();
	
		d.get("https://www.facebook.com");

		String title = d.getTitle();
		
		System.out.println(title);
		
		WebElement findElement = d.findElement(By.id("email"));
		findElement.sendKeys("poovitha");
		
		WebElement findElement1 = d.findElement(By.id("pass"));
		findElement1.sendKeys("1234");
		
		WebElement findElement3 = d.findElement(By.xpath("//input(@value='Log In')"));
		findElement3.click();
	}
}
