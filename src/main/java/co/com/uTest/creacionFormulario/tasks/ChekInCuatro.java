package co.com.uTest.creacionFormulario.tasks;

import co.com.uTest.creacionFormulario.userinterface.UTestChekInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ChekInCuatro implements Task {

    public static ChekInCuatro onThePage() {
        return Tasks.instrumented(ChekInCuatro.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Javier1234*").into(UTestChekInPage.PASSWORD),
                Enter.theValue("Javier1234*").into(UTestChekInPage.PASSWORD_CONFIR),
                Click.on(UTestChekInPage.CLICK_INFO),
                Click.on(UTestChekInPage.CLICK_PRIVA),
                Click.on(UTestChekInPage.CLICK_UTESTCONF),
                Click.on(UTestChekInPage.BUTTON_FIN));
    }
}
