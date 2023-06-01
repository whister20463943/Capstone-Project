package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;

public class RegistrationPage {

	// locators for webElement

	public static By firstName = By.xpath("//input[@id='input-firstname']");

	public static By lastName = By.xpath("//input[@id='input-lastname']");

	public static By email = By.xpath("//input[@id='input-email']");

	public static By telephone = By.xpath("//input[@id='input-telephone']");

	public static By password = By.xpath("//input[@id='input-password']");

	public static By confirmPassword = By.xpath("//input[@id='input-confirm']");

	public static By subscribeYes = By.xpath("//label[normalize-space()='Yes']//input[@name='newsletter']");

	public static By subscribeNo = By.xpath("//label[normalize-space()='No']//input[@name='newsletter']");

	public static By readPolicy = By.xpath("//a[normalize-space( ) = 'Privacy Policy']");

	public static By acceptPolicy = By.xpath("//input[@name='agree']");

	public static By continued = By.xpath("//input[@value='Continue']");

	// Actions

	public static void firstNameMethod(String[] data) {

		PageActions.sendKeys(firstName, data[0]);

	}

	public static void lastNameMethod(String[] data) {

		PageActions.sendKeys(lastName, data[1]);

	}

	public static void emailMethod(String[] data) {

		PageActions.sendKeys(email, data[2]);

	}

	public static void telephoneMethod(String[] data) {

		PageActions.sendKeys(telephone, data[3]);

	}

	public static void passowrdMethod(String[] data) throws Exception {

		PageActions.sendKeys(password, data[4]);

	}

	public static void passwordConfirmMethod(String[] data) throws Exception {

		Thread.sleep(2000);
		PageActions.sendKeys(confirmPassword, data[5]);
		Thread.sleep(2000);
	}

	public static void subscribeMethod(String[] data) {

		if ("yes".equals(data[6])) {

			PageActions.click(subscribeYes);
		} else {
			PageActions.click(subscribeNo);
		}

	}

	public static void continuedMethod() {

		PageActions.click(continued);

	}

	public static void acceptPolicyMethod() {

		PageActions.click(acceptPolicy);

	}

}
