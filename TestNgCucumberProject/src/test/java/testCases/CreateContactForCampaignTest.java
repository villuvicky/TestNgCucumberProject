package testCases;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CampaignsPage;
import pages.NewContactPage;
import pages.SalesHomePage;
import utilities.DriverFactory;
import utilities.Hooks;

public class CreateContactForCampaignTest{

	private CampaignsPage campaignsPage = new CampaignsPage(DriverFactory.getDriver(),Hooks.prop);
	private NewContactPage newContactPage = new NewContactPage(DriverFactory.getDriver(),Hooks.prop);
	private SalesHomePage salesHomePage= new SalesHomePage(DriverFactory.getDriver(),Hooks.prop);
	private String contactName;

	@When("Click on New Contact under Search field")
	public void click_on_new_contact_under_search_field() {
		campaignsPage.newContact();
	}

	@When("Pick Salutation as {string}")
	public void pick_salutation_as(String salutationValue) {

		newContactPage.salutation(salutationValue);
	}

	@When("Enter first name as {string}")
	public void enter_first_name_as(String contactFirstName) {

		newContactPage.firstName(contactFirstName);
	}

	@When("Enter last name as {string}")
	public void enter_last_name_as(String contactLastName) {

		newContactPage.lastName(contactLastName);
	}

	@When("Click Save")
	public void click_save() {

		try {
			newContactPage.saveNewContact();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Click on Add Contact from Campaign member")
	public void click_on_add_contact_from_campaign_member() {

		campaignsPage.campaignMembers().addContactForCampaignOption();
	}

	@When("Select the Created Contact {string}")
	public void select_the_created_contact(String fullName) {

		try {
			campaignsPage.searchContactForCampaign(fullName).selectContact();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("Click Next")
	public void click_next() {
		campaignsPage.clickNext();
	}

	@When("Click Submit on the Add to Campaign pop up")
	public void click_submit_on_the_add_to_campaign_pop_up() {
		campaignsPage.clickSumbit();
	}

	@Then("verify the created Contact under Campaign by clicking View All")
	public void verify_the_created_contact_under_campaign_by_clicking_view_all() {
		campaignsPage.clickViewAllContacts();
		Assert.assertTrue(campaignsPage.isAddedContactPresent());
	}

	@When("Navigate to Contacts tab")
	public void navigate_to_contacts_tab() {

		salesHomePage.clickContactTab();
	}

	@When("Search for Cantact with your Name {string}")
	public void search_for_cantact_with_your_name(String contactName) {
		this.contactName=contactName;
		salesHomePage.searchContact(contactName);
	}

	@Then("Contact should be created under Contacts tab and associated to campaign")
	public void contact_should_be_created_under_contacts_tab_and_associated_to_campaign() {
		Assert.assertTrue(salesHomePage.isContactPresent(contactName));
	}
}