package org.execute;


import static org.testng.Assert.assertEquals;

import java.io.IOException;

import javax.xml.crypto.Data;

import org.baseclass.BaseClas;
import org.dataprovider.Dataprovider2UsingBrowse;
import org.dataprovider.Dataprovider2UsingBrowse2;
import org.openqa.selenium.WebElement;
import org.pages.LoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderr_browsing2 extends BaseClas  {


	
	@Test(dataProvider = "login",dataProviderClass = Dataprovider2UsingBrowse2.class)
	private void loginn(String user ,String pass) {
		browserLaunch("chrome");
		urlLaunch("https://www.saucedemo.com/");
		maximize();
		
		LoginPage l = new LoginPage();
		WebElement userName = l.getUserName();
		sendText(userName, user);
		
		WebElement passWord = l.getPassWord();
		sendText(passWord, pass);
		
		WebElement loginbutton = l.getLoginbutton();
		buttonClick(loginbutton);

		
		
	}
	
	
}
	
	
	
	
	

	