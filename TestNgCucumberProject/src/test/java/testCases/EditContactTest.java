package testCases;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditContactPage;
import pages.SalesForceHomePage;
import pages.SalesHomePage;
import utilities.DriverFactory;
import utilities.Hooks;

public class EditContactTest{

	private SalesForceHomePage salesForceHomePage=new SalesForceHomePage(DriverFactory.getDriver(),Hooks.prop);
	private SalesHomePage salesHomePage= new SalesHomePage(DriverFactory.getDriver(),Hooks.prop);
	private EditContactPage editContactPage= new EditContactPage(DriverFactory.getDriver(),Hooks.prop);
	private String phoneNumber;

	@When("click contacts from App Launcher")
	public void click_contacts_from_app_launcher() {

		salesForceHomePage.clickContact();

	}
	@When("Get the size of conatcts available and print the list")
	public void get_the_size_of_conatcts_available_and_print_the_list() {

		salesHomePage.loadAllContacts();
	}
	@When("search for the contact using unique name")
	public void search_for_the_contact_using_unique_name() {

		salesHomePage.searchUniqueContactAndClickDropDown();
	}
	@When("Click on the dropdown icon available in the unique contact and select edit")
	public void click_on_the_dropdown_icon_available_in_the_unique_contact_and_select_edit() {

		salesHomePage.clickEditContact();
	}
	@When("Edit Title as {string}")
	public void edit_title_as(String titleValue) {

		editContactPage.enterTitle(titleValue);
	}
	@When("select {string} in the birthday field")
	public void select_in_the_birthday_field(String birthDay) {

		editContactPage.enterBirthDay(birthDay);
	}
	@When("edit Lead Source as Purchased list")
	public void edit_lead_source_as_purchased_list() {

		editContactPage.selectSource();
	}
	@When("Edit Phone number with {string}")
	public void edit_phone_number_with(String phoneNumber) {

		this.phoneNumber=phoneNumber;
		editContactPage.enterPhoneNumber(phoneNumber);
	}
	@When("Click Save and Verify and Print Phone number")
	public void click_save_and_verify_and_print_phone_number() {

		try {
			editContactPage.saveContact();

		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	@Then("phone number should be verified and printed")
	public void phone_number_should_be_verified_and_printed() {

		Assert.assertEquals(salesHomePage.getPhoneNumber(), phoneNumber);
	}
}