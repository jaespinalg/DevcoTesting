package co.com.devco.certificacion.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletarReserva {

    public static final Target BTN_COMPLETAR_RESERVA = Target.the("Boton completar reserva").
            located(By.xpath("//*[@name='book']"));

    public static final Target TXT_TITULAR_TARJETA = Target.the("Texto titular tarjeta").
            located(By.id("cc_name"));

    public static final Target TXT_CODIGO_CVC = Target.the("Texto codigo cvc").
            located(By.xpath("//*[@name='cc_cvc']"));

    public static final Target SLC_TIPO_TARJETA_CREDITO = Target.the("Seleccionar tipo tarjeta credito").
            located(By.id("cc_type"));

    public static final Target BTN_COMPRUEBA_DATOS = Target.the("Boton comprueba tus datos").
            located(By.name("review"));
}
