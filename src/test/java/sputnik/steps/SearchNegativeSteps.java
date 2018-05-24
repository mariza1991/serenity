package sputnik.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sputnik.pages.NegativeResultPage;
import sputnik.pages.SearchPage;

import static org.junit.Assert.assertTrue;

public class SearchNegativeSteps {

    SearchPage searchPage;
    NegativeResultPage resultPage;

    @Given("user opens the site negative")
    public void givenUserOpensTheSiteNegative(){
        searchPage.open();
    }

    @Given("user clicks input negative")
    public void givenUserClicksInputNegative(){
        searchPage.clicksInput();
    }

    @When("user input and enter '(.*)' negative")
    public void whenUserInputAndEnterNegative(String query){
        searchPage.inputAndEnterToSearchField(query);
    }

    @Then("result page contains message about nothing was found")
    public void thenResultPageContainsMessage(){
        assertTrue(resultPage.thenResultPageContainsMessage());
    }
}
