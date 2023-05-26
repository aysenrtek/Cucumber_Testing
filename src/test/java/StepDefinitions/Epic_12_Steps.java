package StepDefinitions;

import Pages.Epic_11_12_Elements;
import Pages.commonElements;
import Utilities.PageDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Epic_12_Steps {
    Epic_11_12_Elements yt = new Epic_11_12_Elements();
    commonElements g = new commonElements();
    WebDriverWait wait = new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(5));

    @Given("Navigate to Nationalities page")
    public void navigateToNationalitiesPage() {
        yt.clickFunction(yt.setup);
        yt.clickFunction(yt.parameters);
        yt.clickFunction(yt.nationalities);
    }

    @When("create add Nationalities")
    public void createAddNationalities() {
        g.clickFunction(g.addButton);
        g.sendKeysFunction(g.nameInput, "aza1");
        g.clickFunction(g.saveButton);

    }

    @When("create edit Nationalities")
    public void createEditNationalities() {
        g.sendKeysFunction(g.searchInputName, "aza1");
        g.clickFunction(g.searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        g.clickFunction(g.editButton);
        g.clickFunction(g.saveButton);
    }

    @When("create delete Nationalities")
    public void createDeleteNationalities() {
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        g.sendKeysFunction(g.searchInputName, "aza1");
        g.clickFunction(g.searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//fuse-progress-bar/*"), 0));
        g.clickFunction(g.deleteButton);
        g.clickFunction(g.deleteDialogBtn);


    }
}
