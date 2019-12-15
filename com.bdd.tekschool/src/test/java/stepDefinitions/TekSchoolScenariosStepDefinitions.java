package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TekSchoolScenariosPageObject;
import utilities.Utility;

public class TekSchoolScenariosStepDefinitions extends Base {
	
	TekSchoolScenariosPageObject tekSchoolScenariosPageObject = new TekSchoolScenariosPageObject();
	
	@When("^User click on myAccount menu on top of the page$")
	public void user_click_on_myAccount_menu_on_top_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnMyAccount();
		
		
		
		
	}

	// replace 'username' and 'password' with (.+)
	@And("^User enter username '(.+)' and password '(.+)' in returning menu$")
	public void user_enter_username_username_and_password_password_in_returning_menu(String userName, String passWord) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.enterEmailAddress(userName);
		tekSchoolScenariosPageObject.enterPassword(passWord);
	}

	@And("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnLoginButton();
	   
	}

	@Then("^User should be logined in$")
	public void user_should_be_logined_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(true, tekSchoolScenariosPageObject.verifyLoginToMyAccount());
	    Utility.screenshot(driver);
	    
	    
	}
	
	@And("^User click on login on myAccount menu$")
	public void user_click_on_login_myAccount_menu() {
		tekSchoolScenariosPageObject.clickonRegister();
		
	}
	@And("^User fill register form with below information$")
	public void user_fill_register_form_with_below_information(DataTable personalInfo) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		List<List<String>> dataValues =personalInfo.raw();
		tekSchoolScenariosPageObject.fillFirstName(dataValues.get(0).get(0));
		tekSchoolScenariosPageObject.fillLastName(dataValues.get(0).get(1));
		tekSchoolScenariosPageObject.fillEmail(dataValues.get(0).get(2));
		tekSchoolScenariosPageObject.fillPhone(dataValues.get(0).get(3));
		tekSchoolScenariosPageObject.fillPassword(dataValues.get(0).get(4));
		tekSchoolScenariosPageObject.fillPasswordConfirmation(dataValues.get(0).get(4));
		
		
		
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@And("^User click on '(.+)' radio button for subscribe$")
	public void user_click_on_yes_radio_button_for_subscribe(String radioButtonValue) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.subscribeRadioButton(radioButtonValue);
		Utility.screenshot(driver);
	    
	}

	@And("^User click on continue botton$")
	public void user_click_on_continue_botton() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.clickOnContinue();
	}

	@Then("^User should see 'Your Account Has Been Created!'$")
	public void user_should_see_Your_Account_Has_Been_Created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(tekSchoolScenariosPageObject.confirmationMessage(), true);
	}
	
	@When("^User click on register on myAccount menu$")
	public void user_click_on_register_on_myAccount_menu() throws Throwable {
		tekSchoolScenariosPageObject.clickonRegister();
	}

	
}