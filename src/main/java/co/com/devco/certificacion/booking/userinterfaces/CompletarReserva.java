package co.com.devco.certificacion.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletarReserva {

    public static final Target BTN_COMPLETAR_RESERVA = Target.the("Boton completar reserva").
            located(By.xpath("//*[@name='book']"));

    public static final Target TXT_TITULO = Target.the("Texto titulo").
            located(By.xpath("//*[@class='bui-group__item bui-f-font-emphasized']"));

    public static final Target TXT_CODIGO_CVC = Target.the("Texto codigo cvc").
            located(By.xpath("//*[@name='cc_cvc']"));
}
