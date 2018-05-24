package sputnik.tests;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/search.sputnik.feature",
        glue = "sputnik.steps")
public class SearchTest {
}
