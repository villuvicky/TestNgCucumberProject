package testCases;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditWorkTypePage;
import pages.SalesForceHomePage;
import pages.SalesHomePage;
import utilities.DriverFactory;
import utilities.Hooks;

public class EditWorkTypeTest{

	private String workTypeName;

	private SalesForceHomePage salesForceHomePage=new SalesForceHomePage(DriverFactory.getDriver(),Hooks.prop);
	private SalesHomePage salesHomePage= new SalesHomePage(DriverFactory.getDriver(),Hooks.prop);
	private EditWorkTypePage editWorkTypePage= new EditWorkTypePage(DriverFactory.getDriver(),Hooks.prop);


	@When("Click on Work Types")
	public void click_on_work_types() {

		salesForceHomePage.clickworkTypes();
	}
	@When("Click on the Arrow button at the end of the first result")
	public void click_on_the_arrow_button_at_the_end_of_the_first_result() {

		workTypeName=salesHomePage.getFirstworkTypeName();
		salesHomePage.clickWorkTypeDropDown();
	}
	@When("Click on Edit")
	public void click_on_edit() {
		salesHomePage.clickEditWorkType();

	}
	@When("Enter Time Frame Start as {string}")
	public void enter_time_frame_start_as(String startTime) {
		editWorkTypePage.enterStartTime(startTime);

	}
	@When("Enter Time Frame End as {string}")
	public void enter_time_frame_end_as(String endTime) {

		editWorkTypePage.enterEndTime(endTime);
	}
	@When("Click on Save workType")
	public void click_on_save_work_type() {

		editWorkTypePage.saveWorkType();
	}
	@Then("Verify the success message")
	public void verify_the_success_message() {

		String expectedMessage=String.format("Work Type \"%s\" was saved.",workTypeName);

		Assert.assertEquals(salesHomePage.getWorkTypeEditedMessage(), expectedMessage);

	}
}