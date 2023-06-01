package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;

public class AddAddress {

	public static By firstName = By.xpath("//input[@id='input-firstname']");

	public static By lastName = By.id("input-lastname");

	public static By company = By.id("input-company");

	public static By address1 = By.id("input-address-1");

	public static By address2 = By.id("input-address-2");;

	public static By city = By.id("input-city");;

	public static By postCode = By.id("input-postcode");

	public static By country = By.xpath("//select[@id='input-country']/option[@value='99']");

	public static By state = By.xpath("//select[@id='input-zone']/option[@value='1505']");

	public static By defaultAddressYes = By.xpath("//input[@name='default'][@value='1']");

	public static By defaultAddressNo = By.xpath("//input[@name='default'][@value='2']");

	public static By continued = By.xpath("//input[@value='Continue']");

	

	// actions

	public static void firstNameEnter(String[] data) {
		PageActions.sendKeys(firstName, data[0]);
	}

	public static void lastNameEnter(String[] data) {
		PageActions.sendKeys(lastName, data[1]);
	}

	public static void comapanyNameEnter(String[] data) {
		PageActions.sendKeys(company, data[2]);
	}

	public static void address1Enter(String[] data) {
		PageActions.sendKeys(address1, data[3]);
	}

	public static void address2Enter(String[] data) {
		PageActions.sendKeys(address2, data[4]);
	}

	public static void cityNameEnter(String[] data) {
		PageActions.sendKeys(city, data[5]);
	}

	public static void psotcodeNameEnter(String[] data) {
		PageActions.sendKeys(postCode, data[6]);
	}

	public static void countryEnter() {
		//Select sel = new Select()
		PageActions.click(country);
	}

	public static void stateEnter() {
		PageActions.click(state);
	}

	public static void defaultAdd(String[] data) {

		if (data[7].equals("yes")) {
			PageActions.click(defaultAddressYes);

		} else {
			PageActions.click(defaultAddressNo);
		}

	}

	public static void continued() {
		PageActions.click(continued);
	}

}
