package StepDefinitions;

import Pages.Epic_07_08_Elements;
import Pages.commonElements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;


public class Epic_08_Steps {

    Epic_07_08_Elements ln=new Epic_07_08_Elements();
    commonElements ce=new commonElements();


    @And("Navigate to Departments Page")
    public void navigateToDepartmentsPage() {

        ln.clickFunction(ln.setup);
        ln.clickFunction(ln.schoolSetup);
        ln.clickFunction(ln.departments);
    }
    @And("Creat a Departments")
    public void creatADepartments(DataTable dt) {
        List<List<String>> items= dt.asLists(String.class);

        for (int i = 0; i < items.size(); i++) {
            WebElement element= ln.getWebElement(items.get(i).get(0));
            ln.sendKeysFunction(element, items.get(i).get(1));
        }

    }

    @And("Verify department saved successfully")
    public void verifyDepartmentSavedSuccessfully() {
        ln.verifyContainsTextFunction(ln.successMessage, "success");
    }


    @And("Verify department is updated")
    public void verifyDepartmentIsUpdated() {
        ln.verifyContainsTextFunction(ln.successMessage, "success");
    }


    @And("Verify department is deleted")
    public void verifyDepartmentIsDeleted() {
        ln.verifyContainsTextFunction(ln.successMessage, "success");
    }
}
