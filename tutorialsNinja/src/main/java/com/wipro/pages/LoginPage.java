package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;

public class LoginPage {

	public static By email = By.xpath("//input[@name='email']");

	public static By password = By.xpath("//input[@name='password']");

	public static By login = By.xpath("//input[@value='Login']");

	public static void emailMethod(String[] data) {

		PageActions.sendKeys(email, data[0]);

	}

	public static void passwordMethod(String[] data) {

		PageActions.sendKeys(password, data[1]);

	}
	
	
	public static void loginMethod() {

		PageActions.click(login);

	}
	

}
