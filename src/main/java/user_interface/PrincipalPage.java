package user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrincipalPage {
    public static final Target JOIN_BUTTON =Target.the( "button that start the register").located(By.xpath("//a[contains(text(),'Join Today')]"));
}
