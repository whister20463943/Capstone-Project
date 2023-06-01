package com.wipro.testCases;

import org.testng.annotations.Test;

import com.base.Base;
import com.wipro.pages.HomePage;
import com.wipro.pages.LogoutPage;
import com.wipro.pages.RegistrationPage;
import com.wipro.pages.RegistrationSuccessfulPage;
import com.wipro.utillity.RegisterDataProvider;
import com.wipro.utillity.Screenshot;

public class TC01 extends Base {

	@Test(dataProvider = "registerData", dataProviderClass = RegisterDataProvider.class)
	public static void registration(String[] input) throws Exception {

		// TestStep1: opening url

		// TestStep2: click on the Myaccount DropDown
		HomePage.clickOnAccountDropDown();

		// TestStep3: click on register button
		HomePage.clickOnRegister();

		// TestStep4: Filling user details
		RegistrationPage.firstNameMethod(input);
		RegistrationPage.lastNameMethod(input);
		RegistrationPage.emailMethod(input);
		RegistrationPage.telephoneMethod(input);
		RegistrationPage.passowrdMethod(input);
		RegistrationPage.passwordConfirmMethod(input);
		RegistrationPage.subscribeMethod(input);
		RegistrationPage.acceptPolicyMethod();
		RegistrationPage.continuedMethod();
		
		
		//	TestStep4: Taking copy of successful registration message in a text file
		RegistrationSuccessfulPage.saveText();
		
		//TestStep5: Taking screenshot
		HomePage.clickOnAccountDropDown();
		Screenshot.shot();
		
		//TestStep6:logging out
		RegistrationSuccessfulPage.continueToMethod();
		HomePage.clickOnAccountDropDown();
		HomePage.logOutMethod();
		
		//TestStep7: Taking copy of successful logout message in a text file
		LogoutPage.saveText();

	}

}
