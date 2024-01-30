package Cucumber_TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue= {"Cucumber_Pac"},
monochrome=true,
plugin= {"pretty","html:target/HtmlReports"})


public class Login_testrunner2 {

}
