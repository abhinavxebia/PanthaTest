package com.autoIMDB.projectJbehave;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Actions 
{
    // Function to access any URL pass to it
    public static void accessURL(WebDriver driverObj, String url)
    {
    	driverObj.manage().window().maximize();
    	driverObj.get(url);
    }

    public static void searchInTextBox(WebDriver driverObj,By locator,String text) throws Exception
    {
    	
    	driverObj.findElement(locator).sendKeys(text);
    	
    }
    
    public static void ClickButton(WebDriver driverObj, By locator) throws Exception
    {
    	driverObj.findElement(locator).submit();
    }
    
    //Function to click a link
    public static void clickLink(WebDriver driverObj, By locator) throws Exception
    {
    	driverObj.findElement(locator).click();
    }
    
    //Function to Assert text on the page
    public static void verifyText(WebDriver driverObj, By locator, String message) throws Exception {

		Assert.assertTrue(
				"Text is different from - "+message,
				driverObj.findElement(locator).getText()
						.equalsIgnoreCase(message));
	}
    
}