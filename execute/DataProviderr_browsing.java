package org.execute;


import static org.testng.Assert.assertEquals;

import java.io.IOException;


import org.baseclass.BaseClas;
import org.dataprovider.Dataprovider2UsingBrowse;
import org.openqa.selenium.WebElement;
import org.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderr_browsing  {

	public static BaseClas base = new BaseClas();
	public static LoginPage l = new LoginPage();


	@Test(dataProvider = "loginTest",dataProviderClass = Dataprovider2UsingBrowse.class)
	private   void test1(String user ,String pass) {
//		System.out.println(user);
//		System.out.println(pass);

		base.browserLaunch("chrome");
		base.urlLaunch("https://www.saucedemo.com/");
	
		

			LoginPage l = new LoginPage();

			WebElement userName = l.getUserName();
			base.sendText(userName, user);

			WebElement passWord = l.getPassWord();
			base.sendText(passWord, pass);

			WebElement loginbutton = l.getLoginbutton();
			base.buttonClick(loginbutton);
			
			String ex = "https://www.saucedemo.com/inventory.html";
			String ac = "https://www.saucedemo.com/";
			
			assertEquals(ac, ex);

		}
	
	
	
	
	
}
	
	
	
	
	

	