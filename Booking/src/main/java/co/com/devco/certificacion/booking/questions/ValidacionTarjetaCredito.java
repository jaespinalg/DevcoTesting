package co.com.devco.certificacion.booking.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certificacion.booking.userinterfaces.CompletarReserva.*;
import static co.com.devco.certificacion.booking.userinterfaces.ReservarHotel.BTN_SELECCIONAR_HABITACIONES;

public class ValidacionTarjetaCredito implements Question<String> {

    private String tipoTarjeta;

    public ValidacionTarjetaCredito(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(SLC_TIPO_TARJETA_CREDITO, WebElementStateMatchers.isEnabled()).forNoMoreThan(3).seconds();
        actor.attemptsTo(Scroll.to(SLC_TIPO_TARJETA_CREDITO),
                SelectFromOptions.byValue(tipoTarjeta).from(SLC_TIPO_TARJETA_CREDITO));
        return SLC_TIPO_TARJETA_CREDITO.resolveFor(actor).getValue();
    }

    public static ValidacionTarjetaCredito recuperar(String tipoTarjeta){
        return new ValidacionTarjetaCredito(tipoTarjeta);
    }
}
