package testcase;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;
public class MyFIrstTestCaseFW extends BaseTest {

		@Test
		public static void LoginTest() throws InterruptedException
		{
			String currenturl = driver.getCurrentUrl();
			System.out.println("The url of the current webpage is: "+currenturl);
			String title = driver.getTitle();
			System.out.println("The title of the webpage is: "+title);
			driver.findElement(By.xpath("//button[@id = 'login']")).click();
			driver.findElement(By.xpath("//input[@id = 'userName']")).sendKeys("Adnan");
			driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("Games@221998");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//form[@id = 'userForm']/div[4]/div/button")).click();
		}
}
