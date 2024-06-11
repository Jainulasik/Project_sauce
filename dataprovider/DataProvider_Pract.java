package org.dataprovider;

import java.io.IOException;

import org.baseclass.BaseClas;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Pract {



	@DataProvider (name = "login")
	private Object[][] test1 () {

		return new Object[][] {

			{"asik","asi"},
			{"afi","ashfi"}

		};

	}






	@Test(dataProvider = "login")
	private void test2(String user,String pass) {

		System.out.println(user);
		System.out.println(pass);
	}

}










