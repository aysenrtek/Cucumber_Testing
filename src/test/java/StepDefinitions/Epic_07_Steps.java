package StepDefinitions;

import Pages.Epic_07_08_Elements;
import Pages.commonElements;
import Utilities.PageDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Epic_07_Steps {

    Epic_07_08_Elements ln=new Epic_07_08_Elements();
    commonElements ce=new commonElements();

    WebDriverWait wait = new WebDriverWait(PageDriver.getDriver(), Duration.ofSeconds(20));

    @And("Navigate to Locations Page")
    public void navigateToLocationsPage() {
    ln.clickFunction(ln.setup);
    ln.clickFunction(ln.schoolSetup);
    ln.clickFunction(ln.locations);

    }

    @And("Creat a Location")
    public void creatALocation(DataTable dt) {

        List< List<String> > items= dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element= ln.getWebElement(items.get(i).get(0));
            ln.sendKeysFunction(element, items.get(i).get(1));
        }

    }

    @And("Verify location saved successfully")
    public void verifyLocationSavedSuccessfully() {

        ln.verifyContainsTextFunction(ln.successMessage, "success");
    }



    @And("Click on the element")
    public void clickOnTheElement(DataTable dt) {
        List<String> strButtons=dt.asList(String.class);

        for (String strButton: strButtons) {
            WebElement element=ln.getWebElement(strButton); // webelemnti bul
            ce.clickFunctionNormal(element); // webelemente tıklat
        }
    }



    @And("Update information")
    public void updateInformation(DataTable dt) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ms-edit-button[class='ng-star-inserted']")));
        List< List<String> > items= dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element= ln.getWebElement(items.get(i).get(0));
            ln.sendKeysFunction(element, items.get(i).get(1));
        }

    }

    @And("Verify location is updated")
    public void verifyLocationIsUpdated() {

        ln.verifyContainsTextFunction(ln.successMessage, "success");

    }

    @And("Find and edit entered information")
    public void findAndEditEnteredInformation(DataTable dt) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ms-edit-button[class='ng-star-inserted']")));
        List<String> strButtons=dt.asList(String.class);

        for (String strButton: strButtons) {
            WebElement element=ln.getWebElement(strButton); // webelemnti bul

            ce.clickFunctionNormal(element); // webelemente tıklat
        }
    }

    @And("Find and delete entered information")
    public void findAndDeleteEnteredInformation(DataTable dt) {

        List<String> strButtons=dt.asList(String.class);

        for (String strButton: strButtons) {
            WebElement element=ln.getWebElement(strButton); // webelemnti bul
            ce.clickFunctionNormal(element); // webelemente tıklat
        }

    }

    @And("Verify location is deleted")
    public void verifyLocationIsDeleted() {
        ln.verifyContainsTextFunction(ln.successMessage, "success");
    }
}
