package pipl.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pipl.pages.ResultPage;
import pipl.pages.SearchPage;

import static org.junit.Assert.assertTrue;

public class SearchPositiveSteps {

    SearchPage searchPage;
    ResultPage resultPage;

    @Given("user opens the site")
    public void givenUserOpensTheSite(){
        searchPage.open();
    }

    @Given("user clicks input")
    public void userClicksInput(){
        searchPage.clickOnInput();
    }

    @When("user search for '(.*)'")
    public void whenUserSearchFor(String text){
        searchPage.inputToSearchField(text);
    }

    @When("user clicks Search")
    public void userClicksSearch(){
        searchPage.clickOnSubmitButton();
    }

    @Then("user see list of results")
    public void userSeeListOfResults(){
        assertTrue(resultPage.resultsAreDisplayed());
    }

    @Then("'(.*)' should be contained")
    public void thePersonShouldBeDisplayed(String personName){
        assertTrue(resultPage.titleIsDisplayed());
    }
}
