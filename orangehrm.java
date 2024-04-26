package com.org.main.ProjectOrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException{
		
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//WebDriverWait wait = new WebDriverWait (driver, 15);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));
		element.sendKeys("Admin");
		
		WebElement element1= wait.until(ExpectedConditions.elementToBeClickable(By.name("password")));
		element1.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
