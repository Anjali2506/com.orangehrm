package steps;

import helpers.CommonPage;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CommonSteps extends CommonPage {

    public CommonSteps() {
        super();
    }

    @Given("User navigates to OrangeHRM Application")
    public void open(){
        openURL();
    }



}
