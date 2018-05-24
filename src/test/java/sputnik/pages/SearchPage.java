package sputnik.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

import static sputnik.model.SessionVariables.SELECTED_LISTING;

@DefaultUrl("https://www.sputnik.ru")
public class SearchPage extends PageObject {

    @FindBy(name = "q")
    WebElementFacade searchInput;

    public void clicksInput(){
        searchInput.click();
    }

    public void inputAndEnterToSearchField(String query){
        Serenity.setSessionVariable(SELECTED_LISTING).to(query);
        searchInput.typeAndEnter(query);
    }
}
