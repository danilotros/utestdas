package user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompletePage {
    public static final Target INPUT_PASSWORD= Target.the("user password").located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD= Target.the("user password confirm").located(By.id("confirmPassword"));
    public static  final  Target CHECK_TERMS=Target.the("term Of Use for user").located(By.id("termOfUse"));
    public static  final  Target CHECK_PRIVACY=Target.the("Privacy & Security Policy  for user").located(By.xpath("//span[@ng-class='{error: userForm.privacySetting.$error.required}']"));
    public static final Target NEXT_BUTTON =Target.the( "button that start the register").located(By.xpath("//span[contains(text(),'Complete Setup')]"));
}
