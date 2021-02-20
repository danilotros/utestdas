package step_definitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.UtestRegisterData;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.*;

import java.util.List;

public class utestRegisterStepDefinitions {
    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than Daniel want register utest platform$")
    public void thanDanielWantUseUtestPlatform() {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(), Start.init());
    }


    @When("^he fill out the forms$")
    public void heFillOutTheForm(List<UtestRegisterData>utestRegisterData) {
       OnStage.theActorInTheSpotlight().attemptsTo(Step1.fill(utestRegisterData.get(0).getStrName(),utestRegisterData.get(0).getStrLastName(),utestRegisterData.get(0).getStrEmail()), Step2.fill(), Step3.fill(),Step4.fill(utestRegisterData.get(0).getStrPassword()));
    }

    @Then("^he finish the proccess$")
    public void heHasBeenRegistered() {
    }
}
