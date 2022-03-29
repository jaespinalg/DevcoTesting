package co.com.devco.certificacion.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certificacion.booking.userinterfaces.CompletarReserva.*;

public class ValidacionBotonCompletarReserva implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(BTN_COMPLETAR_RESERVA, WebElementStateMatchers.isEnabled()).forNoMoreThan(3).seconds();
        actor.attemptsTo(Scroll.to(TXT_CODIGO_CVC),
                Click.on(TXT_CODIGO_CVC));
        return BTN_COMPLETAR_RESERVA.resolveFor(actor).isEnabled();
    }


    public static ValidacionBotonCompletarReserva disponible(){
        return new ValidacionBotonCompletarReserva();
    }

}
