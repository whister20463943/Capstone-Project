package com.wipro.utillity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.Base;

public class MouseActions extends Base {

	@SuppressWarnings("unused")
	private static void performMouseClick(By locator) {
		
		WebElement element = driver.findElement(By.id("elementId"));
		actions.click(element).build().perform();
	}
	@SuppressWarnings("unused")
	private static void performMouseDoubleClick(By locator) {
		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(By.id("elementId"));
		actions.doubleClick(element).build().perform();
	}
	@SuppressWarnings("unused")
	private static void performMouseRightClick(By locator) {

		WebElement element = driver.findElement(By.id("elementId"));
		actions.contextClick(element).build().perform();
	}
	@SuppressWarnings("unused")
	private static void performMouseMoveToElement(By locator) {
		
		WebElement element = driver.findElement(By.id("elementId"));
		actions.moveToElement(element).build().perform();
	}
	@SuppressWarnings("unused")
	private static void performDragAndDrop(By sourceLocator, By targetLocator) {
		
		WebElement sourceElement = driver.findElement(By.id("sourceElementId"));
		WebElement targetElement = driver.findElement(By.id("targetElementId"));
		actions.dragAndDrop(sourceElement, targetElement).build().perform();
	}

}
