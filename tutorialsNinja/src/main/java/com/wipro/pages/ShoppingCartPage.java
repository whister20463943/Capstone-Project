package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;
import com.wipro.utillity.SaveText;

public class ShoppingCartPage {
	
	public static By product1Name = By.xpath("//a[normalize-space( )='HP LP3065']");

	public static By product1Price = By.xpath("//tbody/tr/td[6]");
	
	public static By checkout = By.xpath("//a[text()='Checkout']");
	
	
	public static void getProductName() {
		String message1 = PageActions.getText(product1Name);
		SaveText.saveProductsName(message1);
	}
	
	public static void getTotalPrice() {
		String message2 = PageActions.getText(product1Price);
		SaveText.saveProductsPrice(message2);
		
	}
	
	public static void clickCheckout() {
		PageActions.click(checkout);
		
	}
	
	

}

