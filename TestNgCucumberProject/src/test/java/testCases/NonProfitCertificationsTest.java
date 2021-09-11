package testCases;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SalesForceCertificationsPage;
import pages.SalesForceHomePage;
import utilities.DriverFactory;
import utilities.Hooks;

public class NonProfitCertificationsTest{

	private SalesForceHomePage salesForceHomePage=new SalesForceHomePage(DriverFactory.getDriver(),Hooks.prop);
	private SalesForceCertificationsPage salesForceCertificationsPage=new SalesForceCertificationsPage(DriverFactory.getDriver(),Hooks.prop);
	
	@When("Click on the sliding icon until {string} is displayed")
	public void click_on_the_sliding_icon_until_is_displayed(String string) {
		salesForceHomePage.clickNext(3);
	    
	}
	@When("Click on Get Started link")
	public void click_on_get_started_link() {
		salesForceHomePage.clickSystemStatus();
	    
	}
	@When("Navigate to SalesForce Trust new Window")
	public void navigate_to_sales_force_trust_new_window() { 
	    
	}
	@When("Select Trust Compliance from the dropdown")
	public void select_trust_compliance_from_the_dropdown() {
		
		salesForceCertificationsPage.clickDropdown().clickcomplianceOption();
	    
	}
	@When("Click on Show Filters")
	public void click_on_show_filters() {
	    
		salesForceCertificationsPage.clickshowFilter();
	}
	@When("Select {string} under INDUSTRIES")
	public void select_under_industries(String string) {
	    
		salesForceCertificationsPage.clicknonProfit();
	}
	@Then("Verify the {int} Ceriticates that are Nonprofit only should be displayed")
	public void verify_the_ceriticates_that_are_nonprofit_only_should_be_displayed(Integer int1) {
		
		salesForceCertificationsPage.getCertificationsSize();
	    
	}
	@Then("Clear Filter option should be displayed")
	public void clear_filter_option_should_be_displayed() {
	    
		Assert.assertTrue(salesForceCertificationsPage.isClearFilterPresent());
	}
	@Then("{int} Nonprofit certifications only be displayed")
	public void nonprofit_certifications_only_be_displayed(Integer int1) {
	    
		DriverFactory.getDriver().close();
		DriverFactory.getDriver().switchTo().window(SalesForceHomePage.homeWindow);
	}
}