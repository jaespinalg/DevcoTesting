package co.com.devco.certificacion.booking.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.devco.certificacion.booking.userinterfaces.DatosReserva.*;


public class IntroducirDatosReserva implements Task {



    private String nombre;

    public IntroducirDatosReserva(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(TXT_NOMBRE),Click.on(TXT_NOMBRE),
                Enter.theValue(nombre).into(TXT_NOMBRE),
                Enter.theValue("Espinal").into(TXT_APELLIDO),
                Enter.theValue("correo@gmail.com").into(TXT_EMAIL),
                Enter.theValue("correo@gmail.com").into(TXT_EMAIL_CONFIRMACION),
                Enter.theValue("prueba de campo").into(TXT_PETICION_ESPECIAL),
                Click.on(BTN_SIGUIENTE));
    }

    public static IntroducirDatosReserva ingresar(String  datosClientes){
        return Tasks.instrumented(IntroducirDatosReserva.class,datosClientes);
    }
}
