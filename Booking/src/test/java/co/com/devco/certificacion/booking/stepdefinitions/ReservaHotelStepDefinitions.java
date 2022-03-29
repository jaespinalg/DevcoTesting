package co.com.devco.certificacion.booking.stepdefinitions;

import co.com.devco.certificacion.booking.questions.ValidacionBotonCompletarReserva;
import co.com.devco.certificacion.booking.questions.ValidacionBotonCompruebaDatos;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class ReservaHotelStepDefinitions {

    @Entonces("^el boton completa la reserva esta disponible$")
    public void elBotonCompletaLaReservaEstaDisponible() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionBotonCompletarReserva.disponible()));
    }

    @Entonces("^el boton comprueba tus datos esta disponible$")
    public void elBotonCompruebaTusDatosEstaDisponible() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionBotonCompruebaDatos.disponible()));
    }
}