package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import user_interface.DevicePage;

public class Step3  implements Task {
    public static Performable fill() {
        return Tasks.instrumented(Step3.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DevicePage.NEXT_BUTTON));
        
    }
}
