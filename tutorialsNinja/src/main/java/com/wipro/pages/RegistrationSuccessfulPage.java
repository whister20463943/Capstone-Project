package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;
import com.wipro.utillity.SaveText;

public class RegistrationSuccessfulPage {

	// locators to confirm registration

	public static By accountCreated = By.xpath("//h1[normalize-space( )='Your Account Has Been Created!']");

	public static By continueTo = By.xpath("//a[normalize-space( )='Continue']");

	public static void saveText() {

		String message = PageActions.getText(accountCreated);

		SaveText.saveLogin(message);

	}

	public static void continueToMethod() {
		PageActions.click(continueTo);
	}

}
