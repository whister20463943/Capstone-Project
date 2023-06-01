package com.wipro.utillity;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Base;

public class Screenshot extends Base {

	public static void shot() throws Exception {

		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File DestFile = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/success.png");

		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public static void shot2() throws Exception {

		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File DestFile = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/login.png");

		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

	public static void shot3() throws Exception {

		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File DestFile = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/addressSaved.png");

		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public static void shot4() throws Exception {

		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File DestFile = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/desktops.png");

		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public static void LogoutSS() throws Exception {

		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File DestFile = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/LogoutSuccessfully.png");

		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public static void orderPlaced() throws Exception {

		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File DestFile = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/orderPlacedSuccessfully.png");

		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public static void menuLinksSS(int i) throws Exception {

		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		// Move image file to new destination
		File DestFile = new File("/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/Outputs/menulink_"+i+".png");

		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
	}

}
