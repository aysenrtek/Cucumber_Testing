package Pages;

import Utilities.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Epic_07_08_Elements extends Parent{
    commonElements ce=new commonElements();

    public Epic_07_08_Elements() {
        PageFactory.initElements(PageDriver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement schoolSetup;

    @FindBy (xpath = "(//span[text()='Locations'])[1]")
    public WebElement locations;

    @FindBy (xpath = "//input[@data-placeholder='Capacity']")
    public WebElement capacityInput;

    @FindBy(xpath="//mat-slide-toggle[@formcontrolname='active']")
    public WebElement toggleBar;

    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;

    @FindBy(xpath = "(//td[text()='Hgfune']//following::div//ms-edit-button)[1]")
    public WebElement gradeEdit;

    @FindBy(xpath = "(//td[text()='Hgayse']//following::div//ms-delete-button)[1]")
    public WebElement gradeDelete;

    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement departments;

    @FindBy(xpath = "//input[@data-placeholder='Code']")
    public  WebElement code;

    @FindBy(xpath = "(//td[text()='AyseTest']//following::div//ms-edit-button)[1]")
    public WebElement gradeEdit2;

    @FindBy(xpath = "(//td[text()='AaurTest']//following::div//ms-delete-button)[1]")
    public WebElement gradeDelete2;


    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "setup" : return setup;
            case "schoolSetup" : return schoolSetup;
            case "locations" : return locations;
            case "addButton" : return ce.addButton;
            case "nameInput" : return ce.nameInput;
            case "shortName" : return ce.shortName;
            case "capacityInput" : return capacityInput;
            case "toggleBar" : return toggleBar;
            case "saveButton" : return ce.saveButton;
            case "successMessage" : return successMessage;
            case "gradeEdit" : return gradeEdit;
            case "gradeDelete" : return gradeDelete;
            case "deleteDialogBtn" : return ce.deleteDialogBtn;
            case "departments" : return departments;
            case "code" : return code;
            case "gradeEdit2" : return gradeEdit2;
            case "gradeDelete2" : return gradeDelete2;

        }

        return null;
    }

}
