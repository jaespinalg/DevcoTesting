package co.com.devco.certificacion.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certificacion.booking.userinterfaces.CompletarReserva.BTN_COMPLETAR_RESERVA;
import static co.com.devco.certificacion.booking.userinterfaces.CompletarReserva.TXT_TITULAR_TARJETA;

public class ValidacionNombreTitularIncorrecto implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(BTN_COMPLETAR_RESERVA, WebElementStateMatchers.isEnabled()).forNoMoreThan(3).seconds();
        actor.attemptsTo(Scroll.to(TXT_TITULAR_TARJETA),
                Click.on(TXT_TITULAR_TARJETA));
        WaitUntil.the(BTN_COMPLETAR_RESERVA, WebElementStateMatchers.containsText("datos Espinal")).forNoMoreThan(3).seconds();

        if (TXT_TITULAR_TARJETA.resolveFor(actor).getValue().equals("Prueba datos") == false){
            return true;
        }else {
            return false;
        }
    }

    public static ValidacionNombreTitularIncorrecto recuperar(){
        return new ValidacionNombreTitularIncorrecto();
    }
}
