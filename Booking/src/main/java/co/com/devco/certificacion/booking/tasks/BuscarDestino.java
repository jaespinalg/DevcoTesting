package co.com.devco.certificacion.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.devco.certificacion.booking.userinterfaces.PaginaInicio.*;
import static co.com.devco.certificacion.booking.userinterfaces.BuscarHotel.*;
import static co.com.devco.certificacion.booking.userinterfaces.ReservarHotel.*;

public class BuscarDestino implements Task {

    private String destino;

    public BuscarDestino(String destino) {
        this.destino = destino;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        WaitUntil.the(TXT_DESTINO, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds();
        actor.attemptsTo((Performable) Click.on(TXT_DESTINO),
                Enter.theValue(destino).into(TXT_DESTINO),
                Click.on(BTN_FECHA_ENTRADA), Click.on(BTN_DIA_INGRESO),
                Click.on(BTN_FECHA_SALIDA),Click.on(BTN_FECHA_SALIDA),Click.on(BTN_DIA_SALIDA),
                WaitUntil.the(BTN_PERSONAS_HABITACIONES,WebElementStateMatchers.isClickable()).forNoMoreThan(2).seconds(),
                Click.on(BTN_PERSONAS_HABITACIONES),
                Click.on(BTN_MAS_ADULTOS),Click.on(BTN_MAS_ADULTOS),
                Click.on(BTN_BUSCAR),
                WaitUntil.the(BTN_ELEGIR_HOTEL, WebElementStateMatchers.isVisible()).forNoMoreThan(5).seconds(),
                Click.on(BTN_ELEGIR_HOTEL),
                Switch.toNewWindow(),
                Click.on(BTN_RESERVAR_HOTEL),
                Click.on(BTN_CONFIRMAR_RESERVA),
                SelectFromOptions.byValue("1").from(BTN_SELECCIONAR_HABITACIONES),
                Click.on(BTN_RESERVARE));
    }

    public static BuscarDestino buscar(String destino){
        return Tasks.instrumented(BuscarDestino.class,destino);
    }
}
