package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import user_interface.CompletePage;

public class Step4 implements Task {
    private String strPassword;

    public Step4(String strPassword) {
        this.strPassword = strPassword;
    }

    public static Performable fill(String strPassword) {
        return Tasks.instrumented(Step4.class,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strPassword).into(CompletePage.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(CompletePage.INPUT_CONFIRMPASSWORD),
                Click.on(CompletePage.CHECK_TERMS),
                Click.on(CompletePage.CHECK_PRIVACY),
                Click.on(CompletePage.NEXT_BUTTON)
        );
    }
}
