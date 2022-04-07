package co.com.uTest.creacionFormulario.tasks;

import co.com.uTest.creacionFormulario.userinterface.UTestChekInPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


public class ChekIn implements Task {


    public static ChekIn onThePage() {
        return Tasks.instrumented(ChekIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestChekInPage.CHEKIN_BUTTON),
                Enter.theValue("Javier").into(UTestChekInPage.INPUT_FIRSTNAME),
                Enter.theValue("Rodriguez Jaramillo").into(UTestChekInPage.INPUT_LASTNAME),
                Enter.theValue("JavierRodriguez1@gmail.com").into(UTestChekInPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("October").from(UTestChekInPage.INPUT_MONTH),
                SelectFromOptions.byValue("number:3").from(UTestChekInPage.INPUT_DAY),
                SelectFromOptions.byVisibleText("1985").from(UTestChekInPage.INPUT_YEAR),
                Click.on(UTestChekInPage.NEXT_BUTTON));

    }
}
