package org.baseclasstest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.baseclass.BaseClas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample2WinHandling extends BaseClas {

	public static void main(String[] args) throws InterruptedException, AWTException {


		BaseClas base = new BaseClas();
		base.browserLaunch("chrome");
		base.urlLaunch("https://www.amazon.in");
		maximize();

		String parentwin = driver.getWindowHandle();

		base.thread();

		WebElement mobiles = driver.findElement(By.xpath("//*[text()='Mobiles']"));
		base.actionsMethods(mobiles, "contextclick");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		
		String mobileswin = driver.getWindowHandle();

		base.thread();

		WebElement Bestseller = driver.findElement(By.xpath("//*[text()='Best Sellers']"));
		base.actionsMethods(Bestseller, "contextclick");
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);


		base.thread();

		WebElement fashion = driver.findElement(By.xpath("//*[text()='Fashion']"));
		base.actionsMethods(fashion, "contextclick");
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);


		base.thread();


		WebElement sell = driver.findElement(By.xpath("//*[text()='Sell']"));
		base.actionsMethods(sell, "contextclick");
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);



		// SWITCH TO ALL WINDOWS
		
		base.thread();


		Set<String> windowHandles = driver.getWindowHandles();

		for (String ab : windowHandles) {
			driver.switchTo().window(ab);
			String title = driver.getTitle();
			System.out.println(title);
		}

		// MOVE SPECIFIC TAB
		base.thread();


		for (String ab : windowHandles) {
			driver.switchTo().window(ab);
			String exp = "Amazon.in Bestsellers: The most popular items on Amazon";
			String Act = driver.getTitle();

			if (exp.equals(Act)) {
				break;
			}

		}

		//CLOSE ALL TABS EXCEPT PARENT 
		
		Thread.sleep(2000);
		
		for (String allwindows : windowHandles) {
			if (!allwindows.equals(parentwin)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}


		}
		
		//CLOSE PARENT TAB ONLY EXCEPT ALL
		
		for (String allwinn : windowHandles) {
			if (allwinn.equals(parentwin)) {
				driver.switchTo().window(allwinn);
				driver.close();
			}
		}
		
		// CLOSE SPECIFIC TAB
		
		Thread.sleep(2000);
		
		for (String allwindows :  windowHandles) {
			if (allwindows.equals(mobileswin)) {
				driver.switchTo().window(allwindows);
				driver.close();
			}
		}

	}



}
