package co.com.devco.certificacion.booking.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaInicio {

    public static final Target TXT_DESTINO = Target.the("Campo de texto para seleccionar el destino").
            located(By.id("ss"));

    public static final Target BTN_FECHA_ENTRADA = Target.the("Boton fecha entrada").
            located(By.xpath("//*[@class='xp__dates-inner xp__dates__checkin']"));

    public static final Target BTN_DIA_INGRESO = Target.the("Boton día de ingreso").
            located(By.xpath("//td[@data-date='2022-04-26']"));

    public static final Target BTN_FECHA_SALIDA = Target.the("Boton fecha salida").
            located(By.xpath("//*[@class='xp__dates-inner xp__dates__checkout']"));

    public static final Target BTN_DIA_SALIDA = Target.the("Boton día de salida").
            located(By.xpath("//td[@data-date='2022-04-29']"));

    public static final Target BTN_PERSONAS_HABITACIONES = Target.the("Boton personas y habitaciones").
            located(By.id("xp__guests__toggle"));

    public static final Target BTN_MENOS_ADULTOS = Target.the("Boton menos adultos").
            located(By.xpath("//*[@class='sb-group__field sb-group__field-adults']/div/div[2]/button"));

    public static final Target BTN_MAS_ADULTOS = Target.the("Boton mas adultos").
            located(By.xpath("//*[@class='sb-group__field sb-group__field-adults']/div/div[2]/button[2]"));

    public static final Target BTN_MENOS_NINOS = Target.the("Boton menos niños").
            located(By.xpath("//button[@aria-label = 'Reduce el número de Niños']"));

    public static final Target BTN_MAS_NINOS = Target.the("Boton mas niños").
            located(By.xpath("//button[@aria-label = 'Aumenta el número de Niños']"));

    public static final Target BTN_MENOS_HABITACIONES = Target.the("Boton menos habitaciones").
            located(By.xpath("//button[@aria-label = 'Reduce el número de Habitaciones']"));

    public static final Target BTN_MAS_HABITACIONES = Target.the("Boton mas habitaciones").
            located(By.xpath("//button[@aria-label = 'Aumenta el número de Habitaciones']"));

    public static final Target BTN_BUSCAR = Target.the("Boton buscar").
            located(By.xpath("//button[@class = 'sb-searchbox__button ']"));
}