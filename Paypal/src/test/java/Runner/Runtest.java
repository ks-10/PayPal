package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/Features/EditLead.feature"},glue= {"Testcase","pages"},monochrome=true)
public class Runtest {

	

}
