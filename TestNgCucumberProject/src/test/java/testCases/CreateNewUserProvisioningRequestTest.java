package testCases;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SalesForceHomePage;
import pages.SalesHomePage;
import pages.UserProvisioningRequestsPage;
import utilities.DriverFactory;
import utilities.Hooks;

public class CreateNewUserProvisioningRequestTest{

	private SalesForceHomePage salesForceHomePage=new SalesForceHomePage(DriverFactory.getDriver(),Hooks.prop);
	private SalesHomePage salesHomePage= new SalesHomePage(DriverFactory.getDriver(),Hooks.prop);
	private UserProvisioningRequestsPage userProvisioningRequestsPage=new UserProvisioningRequestsPage(DriverFactory.getDriver(),Hooks.prop);
	private String viewName;

	@When("Click on User Provisioning Request")
	public void click_on_user_provisioning_request() {

		salesForceHomePage.userProvisioningRequestsButtonClick();

	}
	@When("Click on the open in SalesForce Classic")
	public void click_on_the_open_in_sales_force_classic() {

		salesHomePage.clickClassicView();
	}
	@When("Click on Create New View")
	public void click_on_create_new_view() {

		userProvisioningRequestsPage.clickCreateNewView();
	}
	@When("Enter View Name as {string}")
	public void enter_view_name_as(String viewName) {

		this.viewName=viewName;
		userProvisioningRequestsPage.enterViewName(viewName);

	}
	@When("Enter View Unique Name as {string}")
	public void enter_view_unique_name_as(String viewUniqueName) {

		userProvisioningRequestsPage.enterUniqueName(viewUniqueName);

	}
	@When("Click on My User Provisioning Requests Under Step two")
	public void click_on_my_user_provisioning_requests_under_step_two() {

		userProvisioningRequestsPage.ownerCheckBox();
	}
	@When("Under Field Select First DropDown as {string}")
	public void under_field_select_first_drop_down_as(String Name) {

		userProvisioningRequestsPage.selectNameDropDown(Name);
	}
	@When("Under Operator Get the List of values availble from dropdown")
	public void under_operator_get_the_list_of_values_availble_from_dropdown() {

		userProvisioningRequestsPage.getOperatorDropdownValues();
	}
	@When("Get the size of DropDown")
	public void get_the_size_of_drop_down() {

	}
	@When("Under Field Select the First DropDown as {string}")
	public void under_field_select_the_first_drop_down_as(String CreatedDate) {

		userProvisioningRequestsPage.selectCreateDateDropDownInAdditional(CreatedDate);
	}

	@When("Under Step3 Get the List of Available Fields")
	public void under_step3_get_the_list_of_available_fields() {

		userProvisioningRequestsPage.getavailableFieldsDropDownValues();
	}
	@When("Under Step3 Get the List of Selected Fields")
	public void under_step3_get_the_list_of_selected_fields() {

		userProvisioningRequestsPage.getSelectedFieldsDropDownDropdownValues();

	}
	@When("Select an Option From Available Field  and Click Add Option")
	public void select_an_option_from_available_field_and_click_add_option() {

		userProvisioningRequestsPage.clickAddField();

	}
	@Then("Verify whether Field is added to Selected Fields")
	public void verify_whether_field_is_added_to_selected_fields() {

		Assert.assertTrue(userProvisioningRequestsPage.verifyFieldAdded());
	}
	@When("Under Step4  Click on Visible to All Users")
	public void under_step4_click_on_visible_to_all_users() {

		userProvisioningRequestsPage.clickRestricted();
	}
	@When("Click on Save request")
	public void click_on_save_request() {

		userProvisioningRequestsPage.clickSaveRequest();
	}
	@Then("Verify New User is Created")
	public void verify_new_user_is_created() {

		Assert.assertEquals(userProvisioningRequestsPage.verifyViewName(), viewName);

	}
	@Then("Get the Title of the Page")
	public void get_the_title_of_the_page() {

		userProvisioningRequestsPage.getTitleOfWindow();
	}
	@When("Close Other Browsers Than Current Browser")
	public void close_other_browsers_than_current_browser() {

		userProvisioningRequestsPage.closeOtherWindows();

	}
	@Then("other windows closed")
	public void other_windows_closed() {
		
		Assert.assertTrue(userProvisioningRequestsPage.getWindowSize());

	}
}