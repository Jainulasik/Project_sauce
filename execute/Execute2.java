package org.execute;


import java.io.IOException;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.baseclass.BaseClas;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.pages.CheckOutPage;
import org.pages.LogOutPage;
import org.pages.LoginPage;
import org.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Execute2 extends BaseClas {
	public static LoginPage login;
	public static ProductPage pro;
	public static CheckOutPage check ;
	public static LogOutPage log ;

	@Parameters({"browser"}) 
	@Test(priority = -500)
	public void browserLaunchh(String browsers) {
		browserLaunch(browsers);
	}
	
	@Test(priority = -400)
	public void urlLaunchh( ) throws IOException {
		urlLaunch(readExcel(1, 2));
	}

	// LOGIN PAGE

	@Parameters({"user","passw"})                                                                                               //@
	@Test(priority = -300)                                                                                         //args(String username,String pasword)
	private void userName_Password_Login(String user,String pass) throws IOException {                                                    //userName.sendKeys(username); 

		 login  = new LoginPage();                                                                  // passWord.sendKeys(pasword);

		WebElement userName = login.getUserName();
		userName.sendKeys(user);                                                          

		WebElement passWord = login.getPassWord();
		passWord.sendKeys(pass);


		WebElement loginbutton = login.getLoginbutton();
		buttonClick(loginbutton);

	}

	// PRODUCT PAGE

	@Test(priority = -290)
	private void addCart6() throws InterruptedException {
		pro = new ProductPage();
		
		List<WebElement> addCarts = pro.getAddCarts();
		System.out.println(addCarts.size());
		for (int i = 0;i<addCarts.size();i++) {
			WebElement element = addCarts.get(i);
			org.openqa.selenium.interactions.Actions action = new org.openqa.selenium.interactions.Actions(driver);
			action.click(element).perform();
		}
		
	}

	@Test(priority = -280)
	private void removeCarts2() throws InterruptedException {
		pro = new ProductPage();
		List<WebElement> removeCart = pro.getRemoveCart();
		for (int i=0; i<2; i++) {
			removeCart.get(i).click();

		}
	}

	@Test(priority = -250)
	private void clickCart() {
		implicitwait(10);
		pro = new ProductPage();
		WebElement clickCart = pro.getClickCart();
		buttonClick(clickCart);
	}


	//CHECKOUT PAGE

	@Test(priority = -240)
	private void checkOut() {
		check = new CheckOutPage();
		WebElement clickCheckout = check.getClickCheckout();
		buttonClick(clickCheckout);
	}

	@Test(priority = -230)
	private void firstNamee() throws IOException {
		check = new CheckOutPage();
		WebElement firstName = check.getFirstName();
		firstName.sendKeys(readExcel(1, 5));

	}

	@Test(priority = -220)
	private void lastName() throws IOException {
		check = new CheckOutPage();
		WebElement lastName = check.getLastName();
		lastName.sendKeys(readExcel(1, 6));
	}

	@Test(priority = -210)
	private void postalCode() throws IOException {
		check = new CheckOutPage();
		WebElement postalCode = check.getPostalCode();
		postalCode.sendKeys(readExcel(1, 7));
	}

	@Test(priority = -200)
	private void continueClick() {
		check = new CheckOutPage();
		WebElement clickContinuee = check.getClickContinuee();
		buttonClick(clickContinuee);
		
	}
	
	@Test(priority = -200)
	private void validateCart() {
		check = new CheckOutPage();
		List<WebElement> cartProductList = check.getCartProductList();
		int actulSize = cartProductList.size();
		int expected= 4;
		Assert.assertEquals(actulSize, expected);
		
	}

	@Test(priority = -190)
	private void finish() {
		check = new CheckOutPage();
		WebElement clickFinishElement = check.getClickFinishElement();
		buttonClick(clickFinishElement);
	}

	//LOGOUT PAGE

	@Test(priority = -180)
	private void logOutPagee() {
		log = new LogOutPage();
		WebElement clickBackHome = log.getClickBackHome();
		buttonClick(clickBackHome);
	}

	@Test(priority = -150)
	private void openMenuu() {
		log = new LogOutPage();
		WebElement openMenu = log.getOpenMenu();
		buttonClick(openMenu);
	}

	@AfterSuite
	private void logOutt() {
		log = new LogOutPage();
		WebElement logOut = log.getLogOut();
		buttonClick(logOut);
	}
}


