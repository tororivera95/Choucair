package co.com.uTest.creacionFormulario.stepdefinitions;

import co.com.uTest.creacionFormulario.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class uTestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^What Brandon wants to create a user in Utest$")
    public void whatBrandonWantsToCreateAUserInUtest() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), (ChekIn.onThePage()), (ChekInDos.onThePage()), (ChekInTres.onThePage()), (ChekInCuatro.onThePage()));
    }


    @When("^Look for the resources of creating user on the UTEST page$")
    public void lookForTheResourcesOfCreatingUserOnTheUTESTPage() {
    }

    @Then("^Create the user in Utest$")
    public void createTheUserInUtest() {
    }
}
