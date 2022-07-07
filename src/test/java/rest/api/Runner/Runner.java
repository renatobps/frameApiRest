package rest.api.Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
//import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter


@RunWith(Cucumber.class)

    @CucumberOptions(
            features = {"src/test/java/rest/api/features"}
            ,glue = {"rest/api/Gherkin/StepsDefinitions"}
            ,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/output/report.html", "rerun:target/rerun.txt"}
            ,dryRun = true
            ,tags = {
  "@UserRegistration"
    }
    )
public class Runner {
}
