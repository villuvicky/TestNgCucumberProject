package testCases;

import java.awt.AWTException;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SalesHomePage;
import utilities.CommonActions;
import utilities.DriverFactory;
import utilities.LoadProperties;
import pages.CampaignsPage;
import pages.SalesForceHomePage;

public class CreateCampaignAttachDocTest{

	private SalesForceHomePage salesForceHomePage = new SalesForceHomePage(DriverFactory.getDriver(),LoadProperties.initProperties());
	private SalesHomePage SalesHomePage = new SalesHomePage(DriverFactory.getDriver(),LoadProperties.initProperties());
	private CampaignsPage campaignsPage= new CampaignsPage(DriverFactory.getDriver(),LoadProperties.initProperties());

	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {

		salesForceHomePage.toggleButtonClick();
	}
	
	@When("Click view All")
	public void click_view_all() {
		salesForceHomePage.viewAllButtonClick();
	}
	@When("click Sales from App Launcher")
	public void click_sales_from_app_launcher() {
		salesForceHomePage.salesButtonClick();
	}

	@When("Click on Campaigns tab")
	public void click_on_campaigns_tab() {

		SalesHomePage.campaignTab();
	}


	@When("Click {string} link")
	public void click_link(String campaign) {
		try {
			SalesHomePage.searchCampaign(campaign).openCampaign(campaign); 
			} 
		
		catch(InterruptedException e) 
		{ 
			e.printStackTrace(); }
	}

	@When("Click on Upload button")
	public void click_on_upload_button() {
		
		try {
			campaignsPage.clickUploadButton();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	@When("Select a file from local and upload  a pdf file")
	public void select_a_file_from_local_and_upload_a_pdf_file() {
		
		try {
			CommonActions.uploadFileRobot("C:\\Users\\villu\\TestLeaf\\myProject\\data\\Sample.pdf");
		} catch (AWTException | InterruptedException e) {
			
			e.printStackTrace();
		}
		
		campaignsPage.clickDoneButton();
	}

	@Then("Verify the file name displayed as link")
	public void verify_the_file_name_displayed_as_link() {
		
		Assert.assertTrue(campaignsPage.isFileUploaded("Sample"));
	}

	@Then("{string} should be displayed")
	public void should_be_displayed(String SuccessMessage) {
		
		Assert.assertEquals(campaignsPage.getActualSuccessMessage(), SuccessMessage);
	}
}