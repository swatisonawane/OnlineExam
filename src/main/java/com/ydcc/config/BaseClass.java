package com.ydcc.config;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static RemoteWebDriver driver;
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://143.110.249.55");
		driver.findElement(By.cssSelector("input.text-muted")).sendKeys("24940");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("lqvxh04s");
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		//scroll down using javascript Executor 
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(arguments[0],arguments[1])", 0,800); 
		

	}
	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
