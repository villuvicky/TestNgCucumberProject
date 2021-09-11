package testCases;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewServiceTerritoryPage;
import pages.SalesForceHomePage;
import pages.ServiceTerritoryHomePage;
import utilities.DriverFactory;
import utilities.Hooks;

public class CreateserviceTerritoriesTest{

	private SalesForceHomePage salesForceHomePage = new SalesForceHomePage(DriverFactory.getDriver(),Hooks.prop);
	private ServiceTerritoryHomePage serviceTerritoryHomePage = new ServiceTerritoryHomePage(DriverFactory.getDriver(),Hooks.prop);
	private NewServiceTerritoryPage newServiceTerritoryPage = new NewServiceTerritoryPage(DriverFactory.getDriver(),Hooks.prop);

	@When("Click on Service Territories")
	public void click_on_service_territories() throws InterruptedException {
		salesForceHomePage.serviceTerritoriesButtonClick();
	}
	@When("Click on New")
	public void click_on_new() {

		serviceTerritoryHomePage.newTerritoryOption();
	}
	@When("Enter {string} in Name field")
	public void enter_in_name_field(String newTerritoryName) {

		newServiceTerritoryPage.enterTerritoryName(newTerritoryName);

	}
	@When("Click on Operating Hours and Choose the First option")
	public void click_on_operating_hours_and_choose_the_first_option() {

		newServiceTerritoryPage.enterOperatingHours();
	}
	@When("Check Active Field")
	public void check_active_field() {

		newServiceTerritoryPage.activeField();

	}
	@When("Enter the City as {string} in City Field")
	public void enter_the_city_as_in_city_field(String city) {

		newServiceTerritoryPage.enterCityName(city);

	}
	@When("Enter the State as {string} in State Field")
	public void enter_the_state_as_in_state_field(String address) {

		newServiceTerritoryPage.enterAddress(address);
	}
	@When("Enter the Country as {string} in Country Field")
	public void enter_the_country_as_in_country_field(String country) {

		newServiceTerritoryPage.enterCountry(country);
	}
	@When("Enter {string} as Postal Zip Code")
	public void enter_as_postal_zip_code(String postalCode) {

		newServiceTerritoryPage.enterPostal(postalCode);
	}
	@When("Click on Save service Territories")
	public void click_on_save_service_territories() {

		newServiceTerritoryPage.saveTerritory();
	}
	@Then("Service Territory is created Successfully and message displayed as {string}")
	public void service_territory_is_created_successfully_and_message_displayed_as(String expectedMessage) {

		Assert.assertEquals(serviceTerritoryHomePage.newTerritoryCreatedMessage(), expectedMessage);
		//Assert.assertTrue(newServiceTerritoryPage.isTerritoryCreated());
	}
}