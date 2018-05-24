package sputnik.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sputnik.pages.ResultPage;
import sputnik.pages.SearchPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SearchSteps {

    SearchPage searchPage;
    ResultPage resultPage;

    @Given("user opens the site")
    public void givenUserOpensTheSite(){
        searchPage.open();
    }

    @Given("user clicks input")
    public void givenUserClicksInput(){
        searchPage.clicksInput();
    }

    @When("user input and enter '(.*)'")
    public void whenUserInputAndEnter(String query){
        searchPage.inputAndEnterToSearchField(query);
    }

    @Then("user see the result page")
    public void thenUserSeeTheResultPage(){
        assertEquals(resultPage.getExpetedTitle(), resultPage.getActualTitle());
    }

    @Then("result page contains (.*) results")
    public void thenResultPagesContains(int number) {
        assertEquals(number, resultPage.actualNumberOfResults());
    }

    @Then("result page contains message about nothing was found")
    public void thenResultPageContainsMessage(){
        assertTrue(resultPage.resultPageContainsMessage());
    }
}
