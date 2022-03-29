package co.com.devco.certificacion.booking.stepdefinitions;

import io.cucumber.java.ast.Cuando;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.devco.certificacion.booking.tasks.IntroducirDatosReserva.ingresar;

public class ReservaHotelStepDefinitions {

    @Cuando("^se ingresan los datos personales (.*)$")
    public void seIngresanLosDatosPersonales(String datosCliente) {
        OnStage.theActorInTheSpotlight().attemptsTo(ingresar(datosCliente));

    }
}