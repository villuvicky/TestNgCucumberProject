package Runner;

import io.cucumber.testng.CucumberOptions;
import testCases.BaseClass;

@CucumberOptions(features="src/test/java/Features/Opportunity.feature"
                 ,glue = {"testCases","utilities"}, monochrome = false, dryRun = false, publish = true, 
                 plugin = {"pretty",
                		 })

public class TestRunner extends BaseClass{
	
}
