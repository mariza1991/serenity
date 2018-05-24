package sputnik.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class NegativeResultPage extends PageObject {

    @FindBy(xpath = "//div[@class='b-query']")
    WebElementFacade resultNotFoungMessage;

    public boolean thenResultPageContainsMessage(){
        return resultNotFoungMessage.containsText("По вашему запросу ничего не найдено. " +
                "Пожалуйста, уточните фразу и начните поиск снова. ");
    }
}
