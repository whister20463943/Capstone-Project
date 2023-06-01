//Everything in this clas will be static as we gonna use this again and again

package com.wipro.utillity;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base;

public class PageActions extends Base {
	
	public static void setdriver(WebDriver driver, WebDriverWait wait) {
		
		PageActions.driver=driver;
		PageActions.wait = wait;
	}

	public static void openURL(String url) {
		driver.get(url);
	}

	public static void sendKeys(By locator, String text) {
		WebElement element = driver.findElement(locator);
		element.clear();
		element.sendKeys(text);
	}

	public static void submit(By locator) {
		driver.findElement(locator).submit();
	}

	public static String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public static void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public static List getElements(By locator) {
		
		return driver.findElements(locator);
	}

	public static void clicked(WebElement webElement) {
		
		wait.until(ExpectedConditions.visibilityOf(webElement));
		webElement.click();
		
	}

	public static WebElement FindTheElement(By locator) {
		// TODO Auto-generated method stub
		return driver.findElement(locator);
	}
	

}
