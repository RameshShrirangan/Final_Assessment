package com.leaftaps.pages;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	
	/*
	 * public LoginPage enterUsername(String data) {
	 * clearAndType(locateElement(Locators.ID, "username"), data);
	 * reportStep(data+" entered successfully","pass"); return this; }
	 */
	
	/*
	 * public LoginPage enterUsername(String data) {
	 * 
	 * WebElement ele = locateElement("username");
	 * 
	 * clearAndType(ele, data);
	 * 
	 * reportStep("Username is entered successfully","pass"); return this; }
	 */

	public LoginPage enterUsername(String data) {

		WebElement ele = locateElement("username");

		clearAndType(ele, data);

		reportStep("Username is entered successfully","pass");
		return this;
	}
	
	/*
	 * public LoginPage enterPassword(String data) {
	 * clearAndType(locateElement(Locators.ID, "password"), data);
	 * reportStep(data+" entered successfully","pass"); return this; }
	 */
	
	public LoginPage enterPassword(String data) {
		
		WebElement ele = locateElement(Locators.XPATH, "//input[@type='password']");
		
		clearAndType(ele, data);
		
		reportStep("Password is entered successfully","pass");
		
		return this;
	}
	
	/*
	 * public HomePage clickLogin() { click(locateElement(Locators.CLASS_NAME,
	 * "decorativeSubmit")); reportStep("Login button clicked successfully",
	 * "pass"); return new HomePage(); }
	 */
	
	
	  public HomePage clickLogin() {
	  
	  click(locateElement(Locators.NAME, "Login"));
	  reportStep("Login button is clicked successfully", "pass");
	  
	  return new HomePage(); }
	 
	
	}
