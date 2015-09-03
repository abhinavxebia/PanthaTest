package com.autoIMDB.projectJbehave;

import java.util.concurrent.TimeUnit;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.autoIMDB.projectJbehave.Actions;

public class TestEngine {
	

	WebDriver driver;
	LocatorParser parser=new LocatorParser();
	String repoFilePath="src/test/resources/locator/IMDbRepo.xml";

	@Given("user is on url <url>")
	public void accessURL(@Named("url") String url) {

		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	@When("user searched for <searchText> on page")
	public void searchForKeyword(@Named("searchText") String searchText) throws Exception {
				
		By locator= parser.getByElementFromRepo("HomePage", repoFilePath, "SearchBox");
		Actions.searchInTextBox(driver, locator,searchText);
		By locator1=parser.getByElementFromRepo("HomePage", repoFilePath, "SearchBoxButton");
		Actions.ClickButton(driver, locator1);
	}
	
	@When("user click on <link1> on the page")
	public void clickLink1(@Named("link1") String link1) throws Exception {
		By locatorLink1= parser.getByElementFromRepo("ProductPage", repoFilePath, "StarWarsLink");
		Actions.clickLink(driver, locatorLink1);
	}
	
	@When("user click on <link2> on the page")
	public void clickLink2(@Named("link2") String link2) throws Exception {
		By locatorLink2= parser.getByElementFromRepo("ProductPage", repoFilePath, "SeeFullCastLink");
		Actions.clickLink(driver, locatorLink2);
	}

	@Then("user sees <message1> on the page")
	public void verifyCrewInfo1(@Named("message1") String message1) throws Exception {
		By locMess1= parser.getByElementFromRepo("ProductPage", repoFilePath, "ThanksCrewName");
		Actions.verifyText(driver, locMess1, message1);
	}
	
	@Then("user sees <message2> on the page")
	public void verifyCrewInfo2(@Named("message2") String message2) throws Exception {
		By locMess2= parser.getByElementFromRepo("ProductPage", repoFilePath, "ThanksCrewRole");
		Actions.verifyText(driver, locMess2, message2);
		driver.quit();
	}

}
