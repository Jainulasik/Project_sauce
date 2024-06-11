package org.execute;

import java.io.IOException;
import java.util.List;

import org.baseclass.BaseClas;
import org.openqa.selenium.WebElement;
import org.pages.CheckOutPage;
import org.pages.LogOutPage;
import org.pages.LoginPage;
import org.pages.ProductPage;
import org.testng.annotations.Test;

public class TestNG_Execution_SauceDemo2 extends BaseClas {

	@Test(priority = -900)
	private void browser() {
		browserLaunch("chrome");
		urlLaunch("https://www.saucedemo.com/");
		maximize();
	}

	@Test(priority = -800)
	private void login() throws IOException {

		LoginPage l = new LoginPage();

		WebElement userName = l.getUserName();
		sendText(userName, readExcel(1, 0));

		WebElement passWord = l.getPassWord();
		sendText(passWord, readExcel(1, 1));

		WebElement loginbutton = l.getLoginbutton();
		buttonClick(loginbutton);

	}

	@Test(priority = -700)
	private void addtocarts() {

		ProductPage pro = new ProductPage();

		WebElement validate_login = pro.getValidate_login();
		if (validate_login.isDisplayed()) {
			System.out.println("LOGGED SUCCESSFULLY AND LANDED PRODUCTS PAGE");
		}

		else {
			System.out.println("Failed to land product page");
		}

		List<WebElement> addCarts = pro.getAddCarts();
		for (int i = 0; i < 6; i++) {
			addCarts.get(i).click();
		}

		WebElement validate_carts = pro.getValidate_carts();
		if (validate_carts.isDisplayed()) {
			System.out.println("6 ITEMS ADDED TO CART");
		} else {
			System.out.println("Failed to add carts");
		}

	}

	@Test(priority = -650)
	private void remove2carts() {

		ProductPage pro = new ProductPage();

		List<WebElement> removeCart = pro.getRemoveCart();

		for (int i = 0; i < 2; i++) {
			removeCart.get(i).click();
		}

		WebElement validate_4items = pro.getValidate_4items();
		if (validate_4items.isDisplayed()) {
			System.out.println("CART HAS 4 ITEMS");
		} else {
			System.out.println("Failed");
		}
	}

	@Test(priority = -600)
	private void cartClick() {
		ProductPage pro = new ProductPage();
		WebElement clickCart = pro.getClickCart();
		buttonClick(clickCart);
	}

	@Test(priority = -500)
	private void checkOutClick() {

		CheckOutPage out = new CheckOutPage();
		WebElement clickCheckout = out.getClickCheckout();
		buttonClick(clickCheckout);

		WebElement validate_checkoutpage = out.getValidate_checkoutpage();
		if (validate_checkoutpage.isDisplayed()) {
			System.out.println("CHECKOUT PAGE IS DISPALYED");
		} else {
			System.out.println("failed");
		}

	}

	@Test(priority = -400)
	private void firstName() throws IOException {
		CheckOutPage out = new CheckOutPage();
		WebElement firstName = out.getFirstName();
		sendText(firstName, readExcel(1, 5));

	}

	@Test(priority = -380)
	private void lastName() throws IOException {
		CheckOutPage out = new CheckOutPage();
		WebElement lastName = out.getLastName();
		sendText(lastName, readExcel(1, 6));
	}

	@Test(priority = -350)
	private void postalCOde() throws IOException {
		CheckOutPage out = new CheckOutPage();
		WebElement postalCode = out.getPostalCode();
		sendText(postalCode, readExcel(1, 7));
	}

	@Test(priority = -300)
	private void continueClick() {

		CheckOutPage out = new CheckOutPage();

		WebElement clickContinuee = out.getClickContinuee();
		clickk(clickContinuee);

		WebElement validate_chkoutoverview_page = out.getValidate_chkoutoverview_page();
		if (validate_chkoutoverview_page.isDisplayed()) {
			System.out.println("CHECKOUT OVERVIEW PAGE IS DISPALYED");
		} else {
			System.out.println("failed");
		}
	}

	@Test(priority = -250)
	private void clickFinish() {
		CheckOutPage out = new CheckOutPage();
		WebElement clickFinishElement = out.getClickFinishElement();
		buttonClick(clickFinishElement);

		WebElement validate_orderconformpageDispl = out.getValidate_orderconformpageDispl();
		if (validate_orderconformpageDispl.isDisplayed()) {
			System.out.println("ORDER CONFORMED AND DISPALYED");
		} else {
			System.out.println("failed");
		}
	}

	@Test(priority = -200)
	private void clickBckhome() {
		LogOutPage log = new LogOutPage();
		WebElement clickBackHome = log.getClickBackHome();
		clickk(clickBackHome);
	}

	@Test(priority = -150)
	private void clickOpenmenu() {
		LogOutPage log = new LogOutPage();
		WebElement openMenu = log.getOpenMenu();
		clickk(openMenu);

	}

	@Test(priority = -100)
	private void clickLogout() {
		LogOutPage log = new LogOutPage();
		WebElement logOut = log.getLogOut();
		buttonClick(logOut);

		WebElement validate_logout = log.getValidate_logout();
		if (validate_logout.isDisplayed()) {
			System.out.println("SUCCESSFULLY LOGOUT");
		} else {
			System.out.println("failed");
		}

	}

}
