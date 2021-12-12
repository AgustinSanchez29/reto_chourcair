package reto.autom.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Join;
import tasks.OpenUp;

public class retoStepDefinitions {
    @Before
    public void setStage () { OnStage.setTheStage(new OnlineCast());}

    @Given("^A user wants to create an account on Utest\\.com$")
    public void aUserWantsToCreateAnAccountOnUtestCom() {
        OnStage.theActorCalled("usuario").wasAbleTo(OpenUp.thePage());

    }

    @When("^he click on the button Join today an fill the form$")
    public void heClickOnTheButtonJoinTodayAnFillTheForm() {
        OnStage.theActorCalled("usuario").wasAbleTo(Join.credentials());
    }

    @Then("^Him user will be succesfully created$")
    public void himUserWillBeSuccesfullyCreated() {

    }
}

