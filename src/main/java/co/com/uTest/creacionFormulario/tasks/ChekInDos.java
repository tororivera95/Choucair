package co.com.uTest.creacionFormulario.tasks;

import co.com.uTest.creacionFormulario.userinterface.UTestChekInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromElement;
import org.openqa.selenium.remote.server.handler.ClickElement;


public class ChekInDos implements Task {

    public static ChekInDos onThePage() {
        return Tasks.instrumented(ChekInDos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Enter.theValue("").into(UTestChekInPage.INPUT_CITY),
                //Enter.theValue("Manizales").into(UTestChekInPage.INPUT_CITY),
                Enter.theValue("170008").into(UTestChekInPage.INPUT_CODPOSTAL),
                Click.on(UTestChekInPage.NEXTDOS_BUTTON));
    }
}
