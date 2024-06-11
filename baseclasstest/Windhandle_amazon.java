package org.baseclasstest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.baseclass.BaseClas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Windhandle_amazon extends BaseClas {

	public static void main(String[] args) throws InterruptedException, AWTException {


		BaseClas base = new BaseClas();
       base.browserLaunch("chrome");
		maximize();
       base.urlLaunch("https://www.amazon.in");
		
		
		

		WebElement mobiles = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		base.actionsMethods(mobiles, "contextclick");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);

		thread();
		
		
		
		Set<String> winhandles = driver.getWindowHandles();
		List<String> allWin = new LinkedList<>();
		allWin.addAll(winhandles);	
		
		driver.switchTo().window(allWin.get(1));
		WebElement audio = driver.findElement(By.xpath("//*[@id='nav-subnav']/a[5]/span[1]"));
		audio.click();


		thread();
		
		WebElement hometheater = driver.findElement(By.xpath("//*[@alt='Home theatres']"));
		base.actionsMethods(hometheater, "contextclick");
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_TAB);
		
		Set<String> winhandles1 = driver.getWindowHandles();
		List<String> allWin1 = new LinkedList<>();
		allWin1.addAll(winhandles1);	
		thread();
		driver.switchTo().window(allWin1.get(2));


		WebElement clickktmorow = driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']"));
		base.clickk(clickktmorow);
		
		
		
		
		
		
		
		
		
		
		
		
//		thread();
//
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_1);
//		
//		thread();
//
//
//		driver.findElement(By.xpath("//*[text()='Sell']")).click();
//		
//		thread();
//		
//		
		
		

		
		
//
//		WebElement sonys40 = driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/span/div/div/div[2]/div[1]/h2/a/span/text()"));
//        sonys40.click();
//        
//        
//



		//		base.maximize();
		//		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		//
		//		T
		//thread.sleep(3000);
		//		WebElement date = driver.findElement(By.id("day"));
		//        selectMethods(date, "index","str", 25);
		//        
		//
		//		WebElement month = driver.findElement(By.id("month"));
		//		selectMethods(month, "index","str", 5);
		//	
		//		

		//
		//
		//        
		//		WebElement year = driver.findElement(By.id("year"));
		//		selectbyvisibletext(year, "2026");






		//		WebElement actions = driver.findElement(By.xpath("//*[text()='Facebook helps you connect and share with the people in your life.']"));
		//		actionsMethods(actions, "conTEXTClick");
		//		actionsMethods(actions, "doubleCLICK");
		//
		//		javaScriptex("scroll dOWN", actions);
		//		javaScriptex("scroll up", actions);
		//		
		//		javaScriptex("scroll bottom", actions);
		//		
		//
		//
		//		javaScriptex("scroll up", actions);
		//	
		//
		//		WebElement movedesire = driver.findElement(By.xpath("//*[text()='Create Page']"));
		//
		//		javaScriptex("move desired position", movedesire);
		//		


		//		base.browserLaunch("chrome");
		//		base.urlLaunch("https://letcode.in/alert");
		//		driver.findElement(By.id("accept")).click();
		//		alertMethods("accept");











	}

}
