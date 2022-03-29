package co.com.devco.certificacion.booking.stepdefinitions;

import co.com.devco.certificacion.booking.questions.ValidacionBotonCompletarReserva;
import co.com.devco.certificacion.booking.questions.ValidacionNombreTitularIncorrecto;
import co.com.devco.certificacion.booking.questions.ValidacionNombreTitularTarjeta;
import co.com.devco.certificacion.booking.questions.ValidacionTarjetaCredito;
import com.google.inject.matcher.Matchers;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

public class MetodoPagoTarjetaStepDefinitions {

    @Entonces("^se valida el nombre del titular de la tarjeta$")
    public void seValidaElNombreDelTitularDeLaTarjeta() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionNombreTitularTarjeta.recuperar()));
    }

    @Entonces("^se compara nombre del titular de la tarjeta con uno erroneo$")
    public void seComparaNombreDelTitularDeLaTarjetaConUnoErroneo() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionNombreTitularIncorrecto.recuperar()));
    }

    @Entonces("^se valida tipo de tarjeta (.*)$")
    public void seValidaTipoDeTarjeta(String tipoTarjeta) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidacionTarjetaCredito.recuperar(tipoTarjeta)));
    }
}
