package Hooks;

import java.io.FileInputStream;

import java.time.Duration;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

import com.wipro.pages.HomePage;

import com.wipro.pages.LoginPage;

import com.wipro.pages.RegistrationPage;

import io.cucumber.java.After;

import io.cucumber.java.Before;

public class hooks {

	public static String web_url;

	public static WebDriver driver;

	public static Actions action;

	public static WebDriverWait wait;

	public static FileInputStream fin;

	public static Properties prop;
	
	protected static String URL = "http://tutorialsninja.com/demo/";

	@Before

	public void setup() throws Exception {

		System.out.println("hooks***");

		System.setProperty("chromedriver", "/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/driverFiles/chromedriver_mac64");

		driver = new ChromeDriver();

		action = new Actions(driver);

		driver.manage().window().maximize();

		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get(URL);

	}

//	@After
//
//	public void end() {
//
//		driver.quit();
//
//	}

}
