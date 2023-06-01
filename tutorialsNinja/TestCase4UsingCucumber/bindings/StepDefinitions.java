package bindings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.wipro.pages.HomePage;
import com.wipro.pages.LoginPage;
import com.wipro.utillity.PageActions;
import com.wipro.utillity.SaveText;
import com.wipro.utillity.Screenshot;

import Hooks.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	@Given("I am on Login page")
	public void i_am_on_login_page() {

		PageActions.setdriver(hooks.driver,hooks.wait);

		HomePage.clickOnAccountDropDown();
		HomePage.clickOnLogin();

	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {
		
		
		LoginPage.emailMethod(new String[] { string,string2 });
		LoginPage.passwordMethod(new String[] { string,string2 });

	}

	@Then("I click login button")
	public void i_click_login_button() {
		LoginPage.loginMethod();

	}

	@Then("I count number of menu links available")
	public void i_count_number_of_menu_links_available() {
		
		HomePage.getMenuLinkElements(HomePage.menulinks);
		
		int menulink_count = HomePage.getTotalMenuLinks();

		
		SaveText.getCountOfLinks(Integer.toString(menulink_count));

	}

	@Then("I click each link one by one")
	public void i_click_each_link_one_by_one() throws Exception {

		
		
		for (int i = 0; i < HomePage.menulinkele.size(); i++) {
			
			By HeaderMenuLink = By.xpath("(//nav[@id='menu']/div[2]/ul/li/a)"+"["+(i+1)+"]");
			
			WebElement currentmenu = PageActions.FindTheElement(HeaderMenuLink);
			
			currentmenu.click();
			
			Screenshot.menuLinksSS(i);

		}
		
	}

	@Then("I click on logout")
	public void i_click_on_logout() {
		HomePage.clickOnAccountDropDown();
		HomePage.logOutMethod();

	}

}
