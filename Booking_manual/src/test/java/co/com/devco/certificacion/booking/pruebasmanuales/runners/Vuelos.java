package co.com.devco.certificacion.booking.pruebasmanuales.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\vuelos.feature",
        glue = "co.com.devco.certificacion.booking.pruebasmanuales.stepsdefinitions")

public class Vuelos {
}
