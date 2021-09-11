package testCases;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePlayStorePage;
import pages.SalesForceHomePage;
import utilities.DriverFactory;
import utilities.Hooks;

public class VerifyGooglePlayStoreloadedToDownloadSalesForceTest{

	static String expectedText="SalesforceA";	
	private SalesForceHomePage salesForceHomePage = new SalesForceHomePage(DriverFactory.getDriver(),Hooks.prop);
	private GooglePlayStorePage googlePlayStorePage = new GooglePlayStorePage(DriverFactory.getDriver(),Hooks.prop);
	
	@When("Click on the sliding icon until Download SalesForceA is displayed")
	public void click_on_the_sliding_icon_until_download_sales_force_a_is_displayed() {
		salesForceHomePage.clickNext(2);
	    
	}
	@When("Click on Google Play link")
	public void click_on_google_play_link() {
	    
		salesForceHomePage.clicksalesForceGooglePlayStore();
	}
	@When("A confirmation page is displayed.Click on Confirm button")
	public void a_confirmation_page_is_displayed_click_on_confirm_button() {
	    
		googlePlayStorePage.clickConfirm();
	}
	@When("Navigate to the Google Play window")
	public void navigate_to_the_google_play_window() {
	    
		Assert.assertEquals(googlePlayStorePage.getTextValue(),expectedText);
	}
	@Then("Verify that SalesForceA is displayed with enabled Install button")
	public void verify_that_sales_force_a_is_displayed_with_enabled_install_button() {
	    
		Assert.assertTrue(googlePlayStorePage.isInstallButtonPresent());
		DriverFactory.getDriver().close();
		DriverFactory.getDriver().switchTo().window(SalesForceHomePage.homeWindow);
	}
}