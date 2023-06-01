package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;

public class CheckOutPage {
	
	public static By continueBilling = By.xpath("//input[@id='button-payment-address']");
	public static By continueShipping =  By.xpath("//input[@id='button-shipping-address']");
	public static By continueShippingMethod = By.xpath("//input[@id='button-shipping-method']");
	public static By policies = By.xpath("//input[@name='agree']");
	public static By continueTerms  = By.xpath("//input[@id='button-payment-method']");
	public static By confirmOrder =  By.xpath("//input[@id='button-confirm']");
	
	
	public static void clickContinueBilling() {
		PageActions.click(continueBilling);
	}
	
	public static void clickContinueShipping() {
		PageActions.click(continueShipping);
	}
	
	public static void clickContinueShippingMethod() {
		PageActions.click(continueShippingMethod);;
	}
	public static void clickPolicies() {
		PageActions.click(policies);
	}
	public static void clickContinueTerms() {
		PageActions.click(continueTerms);
		}
	public static void clickConfirmOrder() {
		PageActions.click(confirmOrder);;
}
}
