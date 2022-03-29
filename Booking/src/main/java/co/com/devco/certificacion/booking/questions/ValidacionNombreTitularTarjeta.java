package co.com.devco.certificacion.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certificacion.booking.userinterfaces.CompletarReserva.*;

public class ValidacionNombreTitularTarjeta implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(BTN_COMPLETAR_RESERVA, WebElementStateMatchers.isEnabled()).forNoMoreThan(3).seconds();
        actor.attemptsTo(Scroll.to(TXT_TITULAR_TARJETA),
                Click.on(TXT_TITULAR_TARJETA));
        WaitUntil.the(BTN_COMPLETAR_RESERVA, WebElementStateMatchers.containsText("datos Espinal")).forNoMoreThan(3).seconds();
        return TXT_TITULAR_TARJETA.resolveFor(actor).getValue().equals("datos Espinal");
    }

    public static ValidacionNombreTitularTarjeta recuperar(){
        return new ValidacionNombreTitularTarjeta();
    }
}
