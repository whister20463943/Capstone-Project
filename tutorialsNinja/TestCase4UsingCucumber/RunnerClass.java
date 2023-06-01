import org.junit.runner.RunWith;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/SA20463943/Desktop/CapStone Project/tutorialsNinja/TestCase4UsingCucumber/features/features.feature", glue = "bindings")

public class RunnerClass extends AbstractTestNGCucumberTests {

}
