package testcase;


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
		}
}
