package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base {

	// create methods for launching and closing browser in selenium

	public static WebDriver driver;

	public static Actions actions;

	public static WebDriverWait wait;

	protected static String URL = "http://tutorialsninja.com/demo/";

	@BeforeSuite
	public void launchChromeBrowser() {

		// set the path for Chrome driver executable

		System.setProperty("chromedriver", "/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/driverFiles/chromedriver_mac64");

		// Launch Chrome Browser
		driver = new ChromeDriver();
		actions = new Actions(driver);
		// creating object for action class
		
		driver.get(URL);

		// Opening the application

	}

	@BeforeClass
	public void openWebsite() {
		
	}

}
