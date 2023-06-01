package com.wipro.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wipro.utillity.PageActions;

public class HomePage {

	// locators for homepage WebElement !!!

	public static By myAccountDropDown = By.xpath("//span[normalize-space()='My Account']");

	public static By register = By.xpath("//a[normalize-space()='Register']");

	public static By logout = By.xpath("//a[normalize-space( )='Logout']");

	public static By login = By.xpath("//a[normalize-space( )='Login']");

	public static By desktops = By.xpath("//a[normalize-space(  )='Desktops']");

	public static By showAlldesktops = By.xpath("//a[normalize-space(  )='Show AllDesktops']");

	public static By ShoppingCart = By.xpath("//span[@id='cart-total']");

	public static By viewCart = By.xpath("//strong[normalize-space()='View Cart']");

	public static By myAccount = By
			.xpath("//ul[@class='dropdown-menu dropdown-menu-right']/a[normalize-space()='My Account']");

	public static By menuOptions = By
			.xpath("//div[@class='navbar-header']/following-sibling::div/descendant::a[text()='Desktops']");

	public static By productMenu = By.xpath("//div[@class='navbar-header");

	public static By menulinks = By.xpath("//div[@class='navbar-header']/following-sibling::div/ul/li/a");

	public static List<WebElement> menulinkele;

	// Actions

	public static void clickOnAccountDropDown() {

		PageActions.click(myAccountDropDown);

	}

	public static void clickOnRegister() {

		PageActions.click(register);

	}

	public static void clickOnLogin() {

		PageActions.click(login);

	}

	public static void logOutMethod() {

		PageActions.click(logout);

	}

	public static void clickOnMyAccount() {

		PageActions.click(myAccount);

	}

	public static void clickOnDesktop() {

		PageActions.click(desktops);

	}

	public static void clickOnshowAllDesktop() {

		PageActions.click(showAlldesktops);

	}

	public static void clickOnShoppingCart() {

		PageActions.click(ShoppingCart);
	}

	public static void clickOnViewCart() {

		PageActions.click(viewCart);
	}

	public static void selectProduct() {

		PageActions.click(menuOptions);

		PageActions.click(productMenu);

	}

	public static int getTotalMenuLinks() {

		return menulinkele.size();

	}

	public static void getMenuLinkElements(By locator) {

		menulinkele = PageActions.getElements(locator);

	}

}
