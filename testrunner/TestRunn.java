package org.testrunner;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.baseclass.BaseClas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRunn  {

	//Saucedemo 

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();

		WebElement user = driver.findElement(By.id("user-name"));
		user.sendKeys("standard_user") ;       
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("secret_sauce") ;       
		WebElement login = driver.findElement(By.id("login-button"));
		login.click();	
		
		
		//ADD 6 ITEMS TO CART
		Thread.sleep(3000);
		List<WebElement> Addtocart = driver.findElements(By.xpath("//button[text()='Add to cart']"));
		for (int i=0; i<6; i++) {
			Addtocart.get(i).click();
			
		}
		

	

//		for (WebElement cartbutton : Addtocart ) {
                                                              //			cartbutton.click();
                                                              //		                 }
		
		// REMOVE 2 ITEMS FROM CART
		Thread.sleep(5000);

		List<WebElement> remove2cart = driver.findElements(By.xpath("//*[text()='Remove']"));
		for (int i=0; i<2; i++) {
			remove2cart.get(i).click();
		}
		
		Thread.sleep(1000);

		WebElement clickcart = driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
		clickcart.click();
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(1000);
		
		WebElement firstname = driver.findElement(By.id("first-name"));
		firstname.sendKeys("Asik");
		Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.id("last-name"));
		lastname.sendKeys("Jainul");
		
		Thread.sleep(1000);
		WebElement postalid = driver.findElement(By.id("postal-code"));
		postalid.sendKeys("609701");
		
		Thread.sleep(1000);
		WebElement continuebtn = driver.findElement(By.id("continue"));
		continuebtn.click();
		
		Thread.sleep(1000);
		WebElement finishbtn = driver.findElement(By.id("finish"));
		finishbtn.click();
		
		Thread.sleep(1000);
		WebElement backhomebtn = driver.findElement(By.xpath("//*[text()='Back Home']"));
		backhomebtn.click();
		
		Thread.sleep(1000);
		WebElement openmenu = driver.findElement(By.xpath("//*[text()='Open Menu']"));
		openmenu.click();
		
		Thread.sleep(1000);
		WebElement logout = driver.findElement(By.xpath("//*[text()='Logout']"));
		logout.click();
		
		
		
		
		
		
		}
}

		
		
		
		
		











