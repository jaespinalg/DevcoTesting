package co.com.devco.certificacion.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certificacion.booking.userinterfaces.CompletarReserva.*;

public class ValidacionBotonCompruebaDatos implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(BTN_COMPRUEBA_DATOS, WebElementStateMatchers.isEnabled()).forNoMoreThan(3).seconds();
        actor.attemptsTo(Scroll.to(BTN_COMPRUEBA_DATOS));
        return BTN_COMPRUEBA_DATOS.resolveFor(actor).isEnabled();
    }

    public static ValidacionBotonCompletarReserva disponible(){
        return new ValidacionBotonCompletarReserva();
    }
}
