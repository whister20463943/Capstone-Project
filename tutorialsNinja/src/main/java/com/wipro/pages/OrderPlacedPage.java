package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;

public class OrderPlacedPage {

	public static By orderConfirmedMessage = By.xpath("//h1[text()='Your order has been placed!']");

	public static By continued = By.xpath("//a[text()='Continue']");

	public static String getMessage() {

		return PageActions.getText(orderConfirmedMessage);

	}

	public static void ClickContinue() {

		PageActions.click(continued);

	}

}
