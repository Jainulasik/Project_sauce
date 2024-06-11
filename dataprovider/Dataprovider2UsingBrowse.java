package org.dataprovider;

import java.io.IOException;

import org.baseclass.BaseClas;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider2UsingBrowse {

	public static BaseClas base = new BaseClas();

	@DataProvider(name = "loginTest")
	private Object[][] login() throws IOException {
		
		
		return new Object[][] {
			
		{base.readExcel(1, 0),base.readExcel(1, 1)},
		{base.readExcel(2, 0),base.readExcel(2, 1)},
		{base.readExcel(3, 0),base.readExcel(3, 1)},
		{base.readExcel(4, 0),base.readExcel(4, 1)}


			
			
		};
	}
	
	
	
	
	
	
	
}
