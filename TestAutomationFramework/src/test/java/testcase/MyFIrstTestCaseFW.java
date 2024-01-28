package testcase;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
public class MyFIrstTestCaseFW extends BaseTest {

		@Test(dataProvider = "testdata")
		public static void LoginTest(String username, String password) throws InterruptedException
		{
			String currenturl = driver.getCurrentUrl();
			System.out.println("The url of the current webpage is: "+currenturl);
			String title = driver.getTitle();
			System.out.println("The title of the webpage is: "+title);
			driver.findElement(By.xpath("//button[@id = 'login']")).click();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,250)", "");
			driver.findElement(By.xpath("//input[@id = 'userName']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys(password);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			//Thread.sleep(2000);
			driver.findElement(By.xpath("//form[@id = 'userForm']/div[4]/div/button")).click();
			Thread.sleep(2000);
		}
@DataProvider(name = "testdata" )
public Object[][] tData()
{return new Object[][]
{
	{"Adnan","Games221998"},
	{"Adnan_22","Games@221998"},
	{"Adnan","Games221998"},
	{"Adnan","Games@221998"},

};
}



}


