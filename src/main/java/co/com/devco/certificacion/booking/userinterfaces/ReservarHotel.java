package co.com.devco.certificacion.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservarHotel {

    public static final Target BTN_RESERVAR_HOTEL = Target.the("Boton reservar hotel").
            located(By.id("hp_book_now_button"));

    public static final Target BTN_CONFIRMAR_RESERVA = Target.the("Confirmar reserva").
            located(By.xpath("//*[@class='hprt-reservation-cta']/button"));

    public static final Target BTN_RESERVARE = Target.the("Confirmar reservaré").
            located(By.xpath("//span[@class='bui-button__text js-reservation-button__text']"));
/*
    public static final Target BTN_SELECCIONAR_HABITACIONES = Target.the("Boton seleccionar habitaciones").
            located(By.xpath("//select[@name='nr_rooms_808937830_344122290_4_0_0']"));
    hprt-nos-select js-hprt-nos-select

 */
    public static final Target BTN_SELECCIONAR_HABITACIONES = Target.the("Boton seleccionar habitaciones").
        located(By.xpath("//select[@class='hprt-nos-select js-hprt-nos-select'][1]"));
}
