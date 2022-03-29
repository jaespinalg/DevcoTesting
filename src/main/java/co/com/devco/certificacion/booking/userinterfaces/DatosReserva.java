package co.com.devco.certificacion.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosReserva {

    public static final Target TXT_NOMBRE = Target.the("Campo nombre").
            located(By.id("firstname"));

    public static final Target TXT_APELLIDO = Target.the("Campo apellido").
            located(By.id("lastname"));

    public static final Target TXT_EMAIL = Target.the("Campo email").
            located(By.id("email"));

    public static final Target TXT_EMAIL_CONFIRMACION = Target.the("Campo email confirmacion").
            located(By.id("email_confirm"));

    public static final Target SLT_HUESPED_PRINCIPAL = Target.the("Seleccion huésped principal").
            located(By.id("notstayer_false"));

    public static final Target TXT_PETICION_ESPECIAL = Target.the("Campo peticion especial").
            located(By.id("remarks"));

    public static final Target BTN_SIGUIENTE = Target.the("Boton siguiente").
            located(By.xpath("//button[@name='book']"));
}
