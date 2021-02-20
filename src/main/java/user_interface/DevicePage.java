package user_interface;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class DevicePage {

    public static final Target NEXT_BUTTON =Target.the( "button that start the register").located(By.xpath("//span[contains(text(),'Next: Last Step')]"));
}
