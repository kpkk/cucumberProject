package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue="stepDefinitions",features="src/test/java/features/SignUp.feature",monochrome=true)
public class SignUpRunner {

}
