package MyTestRunner;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\thelongDm\\IdeaProjects\\BDDCucumberFramework\\src\\test\\resources\\features",
        glue = {"Steps"}
)
public class TestRunner {

}
