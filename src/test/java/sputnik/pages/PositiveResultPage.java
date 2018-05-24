package sputnik.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static sputnik.model.SessionVariables.SELECTED_LISTING;

public class PositiveResultPage extends PageObject {

    @FindBy(xpath = "//div[@class='b-result js-metrics']")
    WebElementFacade resultBlocks;

    public String getExpetedTitle() {
        String myQuery = Serenity.sessionVariableCalled(SELECTED_LISTING);
        String expectedTitle = myQuery + " ― Спутник / Поиск";
        return expectedTitle;
    }

    public String getActualTitle(){
        String actualTitle = getTitle();
        return actualTitle;
    }

    public int actualNumberOfResults(){
        return resultBlocks.findElements(By.xpath("//div[@class='b-result js-metrics']")).size();
    }
}
