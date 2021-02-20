package user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage {
    public static final Target INPUT_CITY = Target.the("location city").located(By.id("city"));
    public static final Target INPUT_ZIP = Target.the("location zip").located(By.id("zip"));
    public static final Target NEXT_BUTTON =Target.the( "button that start the register").located(By.xpath("//span[contains(text(),'Next: Devices')]"));
}
