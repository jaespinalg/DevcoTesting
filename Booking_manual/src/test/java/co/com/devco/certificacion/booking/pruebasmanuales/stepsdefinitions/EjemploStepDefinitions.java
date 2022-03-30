package co.com.devco.certificacion.booking.pruebasmanuales.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class EjemploStepDefinitions {

    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }


}
