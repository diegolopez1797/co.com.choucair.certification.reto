package co.com.choucair.certification.reto.stepdefinitions;

import co.com.choucair.certification.reto.model.UtestData;
import co.com.choucair.certification.reto.tasks.OpenUp;
import co.com.choucair.certification.reto.tasks.SignUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^que Diego quiere ser un provador de aplicaciones en Utest$")
    public void queDiegoQuiereSerUnProvadorDeAplicacionesEnUtest() {
        OnStage.theActorCalled("Diego").wasAbleTo(OpenUp.thePage());
    }

    @When("^el diligencia el formulario de registro en la plataforma de pruebas Utes$")
    public void elDiligenciaElFormularioDeRegistroEnLaPlataformaDePruebasUtes(List<UtestData> utestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUp.onThePage(utestData.get(0).getStrName(), utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail()));
    }

    @Then("^el concluye su registro en la plataforma de pruebas Utes$")
    public void elConcluyeSuRegistroEnLaPlataformaDePruebasUtes() {
    }

}