package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;
import com.wipro.utillity.SaveText;

public class ShowAllDesktopPage {

	public static By product1 = By.xpath("//a[normalize-space()='HP LP3065']");

	public static void clickOnProduct1() {
		PageActions.click(product1);
	}

}
