package com.wipro.testCases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.base.Base;
import com.wipro.pages.CheckOutPage;
import com.wipro.pages.HomePage;
import com.wipro.pages.LoginPage;
import com.wipro.pages.OrderPlacedPage;
import com.wipro.pages.ProductPage;
import com.wipro.pages.ShoppingCartPage;
import com.wipro.pages.ShowAllDesktopPage;
import com.wipro.utillity.LoginDataProvider;
import com.wipro.utillity.Screenshot;

public class TC03 extends Base {

	@Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void addProductsToCartAndPaymentFunctionality(String[] input) throws Exception {

		// TestStep1: openUrl

		// TestStep2: click on log in

		HomePage.clickOnAccountDropDown();
		HomePage.clickOnLogin();

		// TestStep 3: login details from excel
		LoginPage.emailMethod(input);
		LoginPage.passwordMethod(input);
		LoginPage.loginMethod();

		// testStep4: screenshot login
		HomePage.clickOnAccountDropDown();
		Screenshot.shot2();

		// testStep5: click on desktop
		HomePage.clickOnDesktop();
		HomePage.clickOnshowAllDesktop();
		Screenshot.shot4();

		// TestStep6: add product to cart and take price and name of product to txt file

		ShowAllDesktopPage.clickOnProduct1();
		ProductPage.getname();
		ProductPage.getPrice();
		Thread.sleep(3000);
		ProductPage.addToCartMethod();
		Thread.sleep(5000);
		ProductPage.viewShoppingCartMethod();

		// TestStep7: go to cart and collect name and pricre of the product and save in
		// the prices.txt
		ShoppingCartPage.getProductName();
		ShoppingCartPage.getTotalPrice();

		// TestStep8: checkout
		Thread.sleep(3000);
		ShoppingCartPage.clickCheckout();
		Thread.sleep(1000);
		
		CheckOutPage.clickContinueBilling();
		Thread.sleep(1000);
		CheckOutPage.clickContinueShipping();
		Thread.sleep(1000);
		CheckOutPage.clickContinueShippingMethod();
		Thread.sleep(1000);
		CheckOutPage.clickPolicies();
		Thread.sleep(1000);
		CheckOutPage.clickContinueTerms();
		Thread.sleep(1000);
		CheckOutPage.clickConfirmOrder();

		// testStep9: validate the order confirmed message
		Thread.sleep(3000);
		assertEquals(OrderPlacedPage.getMessage(), "Your order has been placed!");

		// TestStep10: Take Screenshot

		Screenshot.orderPlaced();

		// TestStep11: Logout
		OrderPlacedPage.ClickContinue();
		HomePage.clickOnAccountDropDown();
		HomePage.logOutMethod();

		Screenshot.LogoutSS();

	}

}
