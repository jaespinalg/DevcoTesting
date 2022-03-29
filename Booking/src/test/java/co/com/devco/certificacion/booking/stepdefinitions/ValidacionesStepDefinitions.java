package co.com.devco.certificacion.booking.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.pt.Dado;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.devco.certificacion.booking.tasks.BuscarDestino.buscar;
import static co.com.devco.certificacion.booking.tasks.IntroducirDatosReserva.ingresar;


public class ValidacionesStepDefinitions {

    @Managed(driver = "chrome", options = "--start-maximized,--ignore-certificate-errors, --incognito")
    private WebDriver theirBrowser;

    @Before
    public void abrirNavegador(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(theirBrowser)));
        OnStage.theActorCalled("Alexander");
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://www.booking.com"));
    }

    @Dado("^que se busca el destino de (.*) disponible para tres dias cuatro adultos cero ninos$")
    public void queSeBuscaElDestinoDeDisponibleParaTresDiasCuatroAdultosCeroNinos(String destino) {
       OnStage.theActorInTheSpotlight().attemptsTo(buscar(destino));
    }

    @Cuando("^se ingresan los (.*) personales$")
    public void seIngresanLosPersonales(String datosCliente) {
        OnStage.theActorInTheSpotlight().attemptsTo(ingresar(datosCliente));
    }
}
