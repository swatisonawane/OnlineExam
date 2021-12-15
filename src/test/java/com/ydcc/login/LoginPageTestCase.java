package com.ydcc.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.ydcc.config.BaseClass;

public class LoginPageTestCase extends BaseClass {
	
	@Test
	public void toVerifyValidUsernameAndValidPassword() throws InterruptedException {
		driver.findElement(By.cssSelector("input.text-muted")).sendKeys("24940");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("lqvxh04s");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		
		
		
	}
	
	@Test
	public void toVerifyInvalidUsernameAndInvalidPassword() throws InterruptedException {
		driver.findElement(By.cssSelector("input.text-muted")).sendKeys("swati");
		driver.findElement(By.cssSelector("input[type=\"password\"]")).sendKeys("12345678");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		
				
	}
	
}
