package com.wipro.testCases;

import org.testng.annotations.Test;

import com.base.Base;
import com.wipro.pages.AddAddress;
import com.wipro.pages.HomePage;
import com.wipro.pages.LoginPage;
import com.wipro.pages.MyAccountPage;
import com.wipro.utillity.LoginDataProvider;
import com.wipro.utillity.Screenshot;
import com.wipro.utillity.addressDataProvider;

public class TC02 extends Base {

	@Test(dataProvider = "loginData", dataProviderClass = LoginDataProvider.class)
	public void login(String[] input) throws Exception {

		// TestStep1: open url
		
		// TestStep2: click on login button
		HomePage.clickOnAccountDropDown();
		HomePage.clickOnLogin();

		// TestStep3: enter email and pass from data provider
		LoginPage.emailMethod(input);
		LoginPage.passwordMethod(input);
		LoginPage.loginMethod();

		// TestStep4: homepage Screenshot
		Screenshot.shot2();

		// TestStep5: click on myaccount and go to myaccount page
		HomePage.clickOnAccountDropDown();
		HomePage.clickOnMyAccount();

		// TestStep6: add address and details
		MyAccountPage.addAddressMethod();
		MyAccountPage.addNewAddressMethod();
		

	}
	
	// imp: we are using depends on method as here we are using two @test
		// annotations, so this will
		// cause problem for second test method to find elements , using depends on
		// method
		// so that way there is already a valid web page opened up in the browser before
		// the search happens.
	
	
	
	@Test(dataProvider = "addressData", dataProviderClass = addressDataProvider.class,dependsOnMethods = "login" )
	public void AddAddressFunctionality(String[] input) throws Exception {
		AddAddress.firstNameEnter(input);
		AddAddress.lastNameEnter(input);
		AddAddress.comapanyNameEnter(input);
		AddAddress.address1Enter(input);
		AddAddress.address2Enter(input);
		AddAddress.cityNameEnter(input);
		AddAddress.psotcodeNameEnter(input);
		AddAddress.countryEnter();
		Thread.sleep(3000);
		AddAddress.stateEnter();
		AddAddress.defaultAdd(input);
		
		AddAddress.continued();
		
		
		//TestStep7: take ss of saved address
		Screenshot.shot3();
		
		//TestStep8: logout
		HomePage.clickOnAccountDropDown();
		HomePage.logOutMethod();
		
	}
	
	

}
