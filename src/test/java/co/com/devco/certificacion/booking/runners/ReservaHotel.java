package co.com.devco.certificacion.booking.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\reserva_hotel.feature",
glue = "co.com.devco.certificacion.booking.stepdefinitions")

public class ReservaHotel {
}