package com.wipro.utillity;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class SaveText {

	public static void saveLogin(String message) {

		File file = new File(
				"/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/registrationSuccessful");
		try {
			FileUtils.writeStringToFile(file, message, Charset.defaultCharset());
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}

	public static void saveLogout(String message) {

		File file = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/LogoutSuccessful");
		try {
			FileUtils.writeStringToFile(file, message, Charset.defaultCharset());
		} catch (IOException exc) {
			exc.printStackTrace();
		}

	}

	public static void saveProductsPrice(String message) {

		File file = new File(
				"/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/Prices");
		try {
			FileUtils.writeStringToFile(file, message, Charset.defaultCharset());
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}

	public static void saveProductsName(String message) {

		File file = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/ProductName");
		try {
			FileUtils.writeStringToFile(file, message, Charset.defaultCharset());
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}
	
	public static void getPrice(String message) {

		File file = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/Price");
		try {
			FileUtils.writeStringToFile(file, message, Charset.defaultCharset());
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}
	
	public static void getName(String message) {

		File file = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/Name");
		try {
			FileUtils.writeStringToFile(file, message, Charset.defaultCharset());
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}
	
	public static void getCountOfLinks(String message) {

		File file = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/NoOfLinks");
		try {
			FileUtils.writeStringToFile(file, message, Charset.defaultCharset());
		} catch (IOException exc) {
			exc.printStackTrace();
		}
	}

}
