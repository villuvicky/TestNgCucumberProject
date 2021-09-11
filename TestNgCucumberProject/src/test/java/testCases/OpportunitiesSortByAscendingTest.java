package testCases;

import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SalesHomePage;
import utilities.DriverFactory;
import utilities.Hooks;

public class OpportunitiesSortByAscendingTest{

	private SalesHomePage salesHomePage= new SalesHomePage(DriverFactory.getDriver(),Hooks.prop);

	@When("Select the Table view")
	public void select_the_table_view() {

		salesHomePage.clickdisplayOption().clicktableView();

	}
	@When("Sort the Opportunities by Close Date in ascending order")
	public void sort_the_opportunities_by_close_date_in_ascending_order() {

		try {
			salesHomePage.loadAllOpportunities();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
	@Then("Verify the Opportunities displayed in ascending order by Close date")
	public void verify_the_opportunities_displayed_in_ascending_order_by_close_date() {

		Assert.assertTrue(salesHomePage.isDatesSorted());

	}

}
