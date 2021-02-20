package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import user_interface.PrincipalPage;

public class Start implements Task {

    public static Performable init() { return Tasks.instrumented(Start.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PrincipalPage.JOIN_BUTTON));
    }
}
