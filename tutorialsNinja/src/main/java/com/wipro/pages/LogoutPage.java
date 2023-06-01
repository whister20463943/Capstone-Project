package com.wipro.pages;

import org.openqa.selenium.By;

import com.wipro.utillity.PageActions;
import com.wipro.utillity.SaveText;

public class LogoutPage {
	
	public static By logoutMessage = By.xpath("//div[@class='row' ] //h1[normalize-space( )='Account Logout']");
	
	public static void saveText() {
		
		String message = PageActions.getText(logoutMessage);
		
		SaveText.saveLogout(message);	
		
	}

}
