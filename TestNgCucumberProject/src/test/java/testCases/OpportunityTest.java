package testCases;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewOpportunityPage;
import pages.SalesHomePage;
import utilities.DriverFactory;
import utilities.Hooks;

public class OpportunityTest{

	private SalesHomePage salesHomePage= new SalesHomePage(DriverFactory.getDriver(),Hooks.prop);
	private NewOpportunityPage newOpportunityPage = new NewOpportunityPage(DriverFactory.getDriver(),Hooks.prop);
	private String opportunityName;
	private String stage;
	
	@When("Click on Opportunity tab")
	public void click_on_opportunity_tab() {

		salesHomePage.opportunityTab();
	}

	@When("Click on New button")
	public void click_on_new_button() {

		salesHomePage.newOpportunityButton();
	}

	@When("Enter Opportunity name as {string}")
	public void enter_opportunity_name_as(String opportunityName) {
		this.opportunityName=opportunityName;
		newOpportunityPage.opportunityName(opportunityName);
	}

	@When("Choose close date as Today")
	public void choose_close_date_as_today() {

		newOpportunityPage.selectTodayDate();
	}

	@When("Select Stage as {string}")
	public void select_stage_as(String stage) {
		newOpportunityPage.stage(stage);
	}

	@When("Click on save")
	public void click_on_save() {
		newOpportunityPage.saveButton();
	}

	@Then("New Opportunity should be created with name as {string}")
	public void new_opportunity_should_be_created_with_name_as(String successMessage) {

		Assert.assertEquals(salesHomePage.opportunityCreatedMessage(), successMessage);
	}
	@When("Search the Opportunity {string}")
	public void search_the_opportunity(String opportunityName) throws InterruptedException {

		this.opportunityName=opportunityName;
		salesHomePage.searchOpportunity(opportunityName);
	}
	@When("Click on the Dropdown icon and Select Edit")
	public void click_on_the_dropdown_icon_and_select_edit() {

		salesHomePage.opportunityDropDown(opportunityName).OpenExistingOpportunity();
	}
	@When("Choose close date as Tomorrow date")
	public void choose_close_date_as_tomorrow_date() {

		newOpportunityPage.selectTomorrowDate();
	}
	@When("Select Deliver Status as {string}")
	public void select_deliver_status_as(String deliveryStatus) {

		newOpportunityPage.deliveryStatus(deliveryStatus);
	}
	@When("Enter Description as {string}")
	public void enter_description_as(String descriptionValue) {

		newOpportunityPage.description(descriptionValue);
	}
	@When("Click on Save and Verify Stage as {string}")
	public void click_on_save_and_verify_stage_as(String Stage) {
		
		this.stage=Stage;
		newOpportunityPage.saveButton();

	}
	@Then("Opportunity is Edited Successfully")
	public void opportunity_is_edited_successfully() {

		Assert.assertEquals(salesHomePage.editOpportunityMessage(opportunityName, stage), stage);
	}

	@When("Click on  the Dropdown icon and Select Delete")
	public void click_on_the_dropdown_icon_and_select_delete() {

		salesHomePage.opportunityDropDown(opportunityName).clickDelete().confirmDelete();
	}
	@Then("Opportunity deleted message is displayed as {string}")
	public void opportunity_deleted_message_is_displayed_as(String deleteMessage) {

		if(salesHomePage.deleteOpportunityMessage().contains(deleteMessage))
		
		{
			
			Assert.assertTrue(true);
		}
		
		else {
			
			Assert.assertTrue(false);
		}
	}
	
	@Then("Verify the Alert message as {string} and {string} and {string}")
	public void verify_the_alert_message_as_and_and(String message1, String message2, String message3) {
	
		List<String> expectedMessages= new ArrayList<String>();
		expectedMessages.add(message1);
		expectedMessages.add(message2);
		expectedMessages.add(message3);
		Assert.assertEquals(newOpportunityPage.opportunityAlertMessage(), expectedMessages);
		
	}
	@Then("{string} message should be displayed for Name and Stage fields")
	public void message_should_be_displayed_for_name_and_stage_fields(String string) {
		
		Assert.assertEquals(newOpportunityPage.mandatoryFieldErrorForName(), string);
		Assert.assertEquals(newOpportunityPage.mandatoryFieldErrorForStage(), string);
	}
	@When("user clicks on cancel")
	public void user_clicks_on_cancel() {
		
		newOpportunityPage.cancelButton();
	}

}
