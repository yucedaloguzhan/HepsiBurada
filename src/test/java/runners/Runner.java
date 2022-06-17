package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"},
        features = "C:\\Users\\omerf\\Desktop\\com.ApidemosCucumber\\src\\test\\resources\\features",
        glue = {"stepdefinition"},
        tags = "@HB",
        dryRun = false


)
public class Runner {
}
