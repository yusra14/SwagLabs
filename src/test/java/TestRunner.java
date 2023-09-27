import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/Features/",
        glue = "/src/test/java/StepDefinition/AddRemoveProductsSteps"
)
public class TestRunner extends AbstractTestNGCucumberTests {



}
