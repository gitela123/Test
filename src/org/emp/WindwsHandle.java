package org.emp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindwsHandle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gokulraj\\eclipse-workspace\\Textoptions\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");		
		driver.manage().window().maximize();
		WebElement txtSearch = driver.findElement(By.id("twotabsearchtextbox"));
		txtSearch.sendKeys("Iphone", Keys.ENTER);
		WebElement lnkIphone = driver.findElement(By.xpath("(//span[text()='New Apple iPhone 11 (64GB) - White'])[1]"));
		lnkIphone.click();
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		for (String eachWindowId : handles) {
			if (handle.equals(eachWindowId)) {
				driver.switchTo().window(eachWindowId);			
				}
			WebElement lnkYellow = driver.findElement(By.xpath("//span[text()='New Apple iPhone 11 (64GB) - Yellow']"));
			lnkYellow.click();
			
		}
	}
}