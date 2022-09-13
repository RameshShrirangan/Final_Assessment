package com.leaftaps.pages;

import org.codehaus.groovy.control.messages.LocatedMessage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.framework.selenium.api.design.Element;
import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class SFIndividualPage extends ProjectSpecificMethods {

	public SFIndividualPage clickToggleMenn() {

		click(locateElement(Locators.CLASS_NAME, "slds-icon-waffle"));
		click(locateElement(Locators.XPATH, "//button[text()='View All']"));
		reportStep("Toggle Menu is clicked", "PASS");
		return this;

	}

	public SFIndividualPage searchAndClickInd(String indValue) {
		
		WebElement ele =locateElement(Locators.XPATH, "//input[@placeholder='Search apps or items...']");
		clearAndType(ele, indValue);
		click(locateElement(Locators.XPATH,"//mark[text()='"+indValue+"']"));
		reportStep("Individuals option is clicked", "PASS");
		return this;
	}

	public CreateIndividual clickNew() {
		
		click(locateElement(Locators.XPATH,"//div[@title='New']"));
		reportStep("New button is clicked", "PASS");
		return new CreateIndividual();
		
	}

}
