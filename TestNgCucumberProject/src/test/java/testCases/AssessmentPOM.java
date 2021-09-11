package testCases;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddInviteePage;
import pages.AppManagerPage;
import pages.AttachFilePage;
import pages.ClassicPage;
import pages.CreateEventPage;
import pages.SalesForceHomePage;
import pages.UserMenuPage;
import utilities.DriverFactory;
import utilities.Hooks;

public class AssessmentPOM{

	private SalesForceHomePage salesForceHomePage = new SalesForceHomePage(DriverFactory.getDriver(),Hooks.prop);
	private AppManagerPage appManagerPage = new AppManagerPage(DriverFactory.getDriver(),Hooks.prop);
	private UserMenuPage userMenuPage= new UserMenuPage(DriverFactory.getDriver(),Hooks.prop);
	private ClassicPage classicPage = new ClassicPage(DriverFactory.getDriver(),Hooks.prop);
	private CreateEventPage createEventPage = new CreateEventPage(DriverFactory.getDriver(),Hooks.prop);
	private AddInviteePage addInviteePage= new AddInviteePage(DriverFactory.getDriver(),Hooks.prop);
	private AttachFilePage attachFilePage= new AttachFilePage(DriverFactory.getDriver(),Hooks.prop); 

	@When("Click on Community under Most Recently Used")
	public void click_on_community_under_most_recently_used() {

		salesForceHomePage.clickCommunity();
	}

	@When("Print the Application Name and Developer Name for the App Type as {string}")
	public void print_the_application_name_and_developer_name_for_the_app_type_as(String string) {

		appManagerPage.loadElementsNew().getApplicationNames().getDeveloperNames();
	}

	@When("Click on View Profile icon")
	public void click_on_view_profile_icon() {

		userMenuPage.clickUserMenu();
	}

	@When("Click on Switch to Salesforce Classic")
	public void click_on_switch_to_salesforce_classic() {

		userMenuPage.clickClassicView();
	}

	@When("Click on Create New and Select Event")
	public void click_on_create_new_and_select_event() {

		classicPage.clickCreateNew().clickCreateNewEvent();
	}

	@When("Enter the Subject as {string}")
	public void enter_the_subject_as(String subject) {

		createEventPage.enterSubject(subject);
	}

	@When("Enter Start date as tomorrow")
	public void enter_start_date_as_tomorrow() {

		createEventPage.enterStartDate();
	}


	@When("Enter End date as day after tomorrow")
	public void enter_end_date_as_day_after_tomorrow() {

		createEventPage.enterEndDate();
	}

	@When("Add invitees as Contact Click on the LookUp icon")
	public void add_invitees_as_contact_click_on_the_look_up_icon() {

		createEventPage.clickAddToInvitees();
	}

	@When("Search for name {string} and select first result")
	public void search_for_name_and_select_first_result(String name) {

		addInviteePage.searchInvitee(name).addInvitee();
	}

	@When("click choose File")
	public void click_choose_file() {

		createEventPage.clickAttachFile();
		attachFilePage.chooseFile("C:\\Users\\villu\\TestLeaf\\TestNgCucumberProject\\src\\test\\resources\\testData\\LoginData2.xlsx");
	}

	@When("click attach File")
	public void click_attach_file() {

		attachFilePage.attachFile();

	}

	@When("click done")
	public void click_done() {

		attachFilePage.uploadFileDone();
	}

	@Then("Verify that the file is attached to the file")
	public void verify_that_the_file_is_attached_to_the_file() {

		Assert.assertTrue(createEventPage.isFileUploaded("LoginData2.xlsx"));
	}

	@When("Click on Save")
	public void click_on_save() {

		createEventPage.clickSaveButton();
	}

}
