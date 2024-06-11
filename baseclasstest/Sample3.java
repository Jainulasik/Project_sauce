package org.baseclasstest;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.poi.wp.usermodel.Paragraph;
import org.baseclass.BaseClas;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sample3 extends BaseClas {

	public static void main(String[] args) throws InterruptedException {

		BaseClas base = new BaseClas();


		base.browserLaunch("cHRome");
		base.urlLaunch("https://www.snapdeal.com");
		maximize();

		String parentwin = driver.getWindowHandle();

		WebElement securepayment = driver.findElement(By.xpath("//*[text()='100% Secure Payments']"));
		base.buttonClick(securepayment);

		WebElement trustpay = driver.findElement(By.xpath("//*[text()='TrustPay']"));

		base.buttonClick(trustpay);
		
		String trustt = driver.getWindowHandle();

		WebElement helpcenter = driver.findElement(By.xpath("(//*[text()='Help Center'])[2]"));

		base.buttonClick(helpcenter);
		
		driver.findElement(By.xpath("//*[@id='sdFooter']/div[1]/div/a[4]/div/div[2]/p[1]")).click();
		


        Set<String> allwindows = driver.getWindowHandles();
        
        
        // SWITCH ALL
        
        for (String all : allwindows) {
        	driver.switchTo().window(all);
        	String title = driver.getTitle();
        	System.out.println(title);
        }
        
        // MOVE TAB
        
        for (String a : allwindows) {
        	driver.switchTo().window(a);
        	String ex = "Shop Online for Men, Women & Kids Clothing, Shoes, Home Decor Items";
        	String act = driver.getTitle();
        	if (ex.equals(act)) {
        		break;
        	}
        }
        
        thread();
        
		// CLOSE ALL EXCEPT PARENT 
        
		for (String allw : allwindows) {
			 if (!allw.equals(parentwin)) {
				 driver.switchTo().window(allw);
				 driver.close();
			 }
		}
		
		//CLOSE PARENT EXCEPT ALL
		for (String allw : allwindows) {
			 if (allw.equals(parentwin)) {
				 driver.switchTo().window(allw);
				 driver.close();
			 }
		}
		
		// CLOSE SPECIFIC
        for (String allwi : allwindows) {
        	driver.switchTo().window(allwi);
        	String expe = "Snapdeal : Help Center";
        	String act = driver.getTitle();
        	if (expe.equals(act)) {
        		driver.close();
        	}
        }
		
       
		
		
		
		
		
		
		

//		// WINDOW HANDLES AS I NEED (TAB) USING LIST
//
//		Set<String> allwindows = driver.getWindowHandles();
//		List<String> li = new LinkedList<String>();
//		li.addAll(allwindows);
//
//		driver.switchTo().window(li.get(1));
//
//		driver.findElement(By.xpath("//*[@id='login']")).click();
//
//
//
//
//	}




	}}
