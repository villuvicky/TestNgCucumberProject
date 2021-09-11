package testCases;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CampaignsPage;
import pages.SalesForceHomePage;
import pages.SalesHomePage;
import utilities.DriverFactory;
import utilities.Hooks;

public class DeleteLeadCampaignTest extends BaseClass{

	private SalesForceHomePage salesForceHomePage=new SalesForceHomePage(DriverFactory.getDriver(),Hooks.prop);
	private SalesHomePage salesHomePage= new SalesHomePage(DriverFactory.getDriver(),Hooks.prop);
	private CampaignsPage campaignsPage= new CampaignsPage(DriverFactory.getDriver(),Hooks.prop);
	private String leadName;
	
	
	@When("Click on Leads tab")
	public void click_on_leads_tab() {

		salesForceHomePage.clickLead();
	}
	
	@When("Search for Lead with name as {string}")
	public void search_for_lead_with_name_as(String leadName) {

		try {
			salesHomePage.searchLead(leadName);
			this.leadName=leadName;

		} catch (InterruptedException e) {


			e.printStackTrace();
		}

	}
	
	@When("Click on dropdown icon for the Lead and Select Delete")
	public void click_on_dropdown_icon_for_the_lead_and_select_delete() {

		salesHomePage.leadDropdown(leadName).clickDelete();
	}
	
	@When("Confirm the Delete for Lead")
	public void confirm_the_delete_for_lead() {

		salesHomePage.confirmDelete();
	}
	
	@When("Verify the associated Lead")
	public void verify_the_associated_lead() {

		campaignsPage.clickCampaignMembers();
	}
	
	@Then("Lead should not be there as it is deleted")
	public void lead_should_not_be_there_as_it_is_deleted() {

		Assert.assertTrue(campaignsPage.isLeadPresent(leadName));
	}
}