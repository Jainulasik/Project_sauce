package org.dataprovider;

import java.io.IOException;

import org.baseclass.BaseClas;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider2UsingBrowse2 extends BaseClas {


	public static BaseClas base = new BaseClas();
	
	@DataProvider(name = "login")
	private Object[][] login() throws IOException {

		return new Object[][] {
			
			{base.readExcel(1, 0),base.readExcel(0, 0)},
			{base.readExcel(1, 1),base.readExcel(1, 2)},
				
			};
			
			
			
			
		
			
				
				
				
			

	
		
	}
	
	
	
	
	
	
}
