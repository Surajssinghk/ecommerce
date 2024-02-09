package cucumberopton;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue= {"stepdefination","mainclass"} , tags = "@Reg",
plugin ="json:target/jsonReports/report.json")

public class runner extends AbstractTestNGCucumberTests{

}
