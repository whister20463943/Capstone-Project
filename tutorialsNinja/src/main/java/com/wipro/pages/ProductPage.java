package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;
import com.wipro.utillity.SaveText;

public class ProductPage {

	public static By viewShoppingCart = By.xpath("//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']");

	public static By addToCart = By.xpath("//button[@id='button-cart']");

	public static By name = By.xpath("//h1[normalize-space()='HP LP3065']");

	public static By price = By.xpath("//h2[normalize-space()='$100.00']");

	public static void getPrice() {
		String message1 = PageActions.getText(price);
		SaveText.getPrice(message1);
	}

	public static void getname() {
		String message2 = PageActions.getText(name);
		SaveText.getName(message2);
	}

	public static void addToCartMethod() {
		PageActions.click(addToCart);
	}

	public static void viewShoppingCartMethod() {
		PageActions.click(viewShoppingCart);
	}

}
