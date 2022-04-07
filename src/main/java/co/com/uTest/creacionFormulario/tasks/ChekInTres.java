package co.com.uTest.creacionFormulario.tasks;

import co.com.uTest.creacionFormulario.userinterface.UTestChekInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ChekInTres implements Task {

    public static ChekInTres onThePage() {
        return Tasks.instrumented(ChekInTres.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestChekInPage.YOUR_COMPUTER),
                Click.on(UTestChekInPage.YOUR_COMPUTER_OPTION),
                Click.on(UTestChekInPage.COMPUTER_VERSION),
                Click.on(UTestChekInPage.VERSION_OPTION),
                Click.on(UTestChekInPage.SELECT_LANGUAGE),
                Click.on(UTestChekInPage.LANGUAGE_OPTION),
                Click.on(UTestChekInPage.SELECT_MOVIL),
                Click.on(UTestChekInPage.MOVIL_OPTION),
                Click.on(UTestChekInPage.SELECT_MODEL),
                Click.on(UTestChekInPage.MODEL_OPTION),
                Click.on(UTestChekInPage.SELECT_OPERATING),
                Click.on(UTestChekInPage.OPERATING_OPTION),
                Click.on(UTestChekInPage.NEXTDOS_BUTTONDOS));

    }
}
