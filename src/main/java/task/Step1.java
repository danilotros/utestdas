package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import user_interface.PersonalPage;
import org.openqa.selenium.support.ui.Select;
public class Step1 implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;

    public Step1(String strName, String strLastName, String strEmail) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }

    public static Performable fill(String strName,String strLastName,String strEmail) {
        return Tasks.instrumented(Step1.class,strName,strLastName,strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(strName).into(PersonalPage.INPUT_FIRSTNAME),
                Enter.theValue("Garcia").into(PersonalPage.INPUT_LASTNAME),
                Enter.theValue("danielgarcia10211222@gmail.com").into(PersonalPage.INPUT_EMAIL),
                SelectFromOptions.byValue("number:10").from(PersonalPage.SELECT_MONTH),
                SelectFromOptions.byValue("number:20").from(PersonalPage.SELECT_DAY),
                SelectFromOptions.byValue("number:1996").from(PersonalPage.SELECT_YEAR),
                Click.on(PersonalPage.NEXT_BUTTON)


                );
    }
}
