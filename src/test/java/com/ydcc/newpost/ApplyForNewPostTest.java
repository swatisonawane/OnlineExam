package com.ydcc.newpost;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ydcc.config.BaseClass;
import com.ydcc.util.TestListener;

@Listeners(TestListener.class)
public class ApplyForNewPostTest extends BaseClass {

	@Test
	public void toVeifyIfUserClickOnTheApplyForNewPost() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[@id=\"idApplyForNewPost\"]")).click();
		
		WebElement department = driver.findElement(By.cssSelector("select#detailsMainPost"));
		Select select = new Select(department);
		select.selectByVisibleText("Yavatmal District Central Co-Operative Bank");
		
		WebElement post = driver.findElement(By.cssSelector("select#detailsPost"));
		Select select1 = new Select(post);
		select1.selectByIndex(1);
		Thread.sleep(5000);


	}
	
	@Test
	public void toVerifyIfAfterClickingOnTheDateOfBirthSectionDropdownShouldBeAvailableForSelection() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id=\"idApplyForNewPost\"]")).click();
		
		WebElement department = driver.findElement(By.cssSelector("select#detailsMainPost"));
		Select select = new Select(department);
		select.selectByVisibleText("Yavatmal District Central Co-Operative Bank");
		
		WebElement post = driver.findElement(By.cssSelector("select#detailsPost"));
		Select select1 = new Select(post);
		select1.selectByIndex(1);
		Thread.sleep(5000);
		
		WebElement day = driver.findElement(By.cssSelector("select#detailsbday"));
		Select select2 = new Select(day);
		
		select2.selectByValue("2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement month = driver.findElement(By.cssSelector("select#detailsmonth"));
		Select select3 = new Select(month);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		select3.selectByValue("1");
		
		WebElement year = driver.findElement(By.cssSelector("select#detailsYear"));
		Select select4 = new Select(year);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		select4.selectByValue("1973");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@value='male']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		

	}
	@Test
	public void m3() {
		throw new AssertionError();
	}
}
