package testCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AdministratorOverviewPage;
import pages.LoginPage;
import pages.MobileAppsPage;
import pages.SalesForceHomePage;
import pages.UserMenuPage;
import utilities.DriverFactory;
import utilities.Hooks;
import utilities.LoadProperties;

public class ArchitectCertificationsTest{
	
	private LoginPage lp =new LoginPage(DriverFactory.getDriver(),Hooks.prop);
	private SalesForceHomePage salesForceHomePage = new SalesForceHomePage(DriverFactory.getDriver(),Hooks.prop);
	private MobileAppsPage mobileAppsPage = new MobileAppsPage(DriverFactory.getDriver(),Hooks.prop);
	private AdministratorOverviewPage administratorOverviewPage=new AdministratorOverviewPage(DriverFactory.getDriver(),Hooks.prop);
	private UserMenuPage userMenuPage = new UserMenuPage(DriverFactory.getDriver(),Hooks.prop); 

	@Given("Admin login to salesForce")
	public void admin_login_to_sales_force() {

		DriverFactory.getDriver().get(LoadProperties.initProperties().getProperty("url"));

		lp.enterUserName().enterPassword().clickLogin();

		DriverFactory.getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);


	}
	@When("Click on Learn More link in Mobile Publisher")
	public void click_on_learn_more_link_in_mobile_publisher() {

		salesForceHomePage.mobilePublisher();
	}

	@When("MouseHover On Resources")
	public void mouse_hover_on_resources() {

		try {
			mobileAppsPage.resources();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@When("Select SalesForce Certification Under Learnings")
	public void select_sales_force_certification_under_learnings() {
		try {
			mobileAppsPage.salesForceCertification();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	@When("Choose Your Role as Salesforce Architect")
	public void choose_your_role_as_salesforce_architect() {

		administratorOverviewPage.salesForceArchitect();
	}

	@When("Get the Text Summary of Salesforce Architect")
	public void get_the_text_summary_of_salesforce_architect() {

		administratorOverviewPage.salesForceArchitectDescription();
	}

	@When("Download the Image of Technical Architect")
	public void download_the_image_of_technical_architect() {

		try {
			administratorOverviewPage.getSolutionArchitectLogo();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@When("Download the Image of Solution Architect")
	public void download_the_image_of_solution_architect() {

		try {
			administratorOverviewPage.geTtechnicalArchitectLogo();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Then("Get the List of Salesforce Architect Certifications Available")
	public void get_the_list_of_salesforce_architect_certifications_available() {

		administratorOverviewPage.listOfSalesforceArchitectCertifications();
	}

	@When("Click on Application Architect")
	public void click_on_application_architect() {

		administratorOverviewPage.clickApplicationArchitect();
	}

	@Then("Get the List of Certifications available")
	public void get_the_list_of_certifications_available() {

		administratorOverviewPage.listOfApplicationArchitectCertifications();
	}

	@Then("Admin logsOut")
	public void admin_logs_out() {
		
		userMenuPage.switchToLightning().clickUserMenu().logOut();
	}
}