package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;

public class MyAccountPage {

	public static By address = By.xpath("//a[normalize-space()='Modify your address book entries']");

	public static By newAddress = By.xpath("//a[@class='btn btn-primary']");

	public static void addAddressMethod() {

		PageActions.click(address);

	}

	public static void addNewAddressMethod() {

		PageActions.click(newAddress);

	}

}
