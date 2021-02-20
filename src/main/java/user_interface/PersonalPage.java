package user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PersonalPage {
    private static WebDriver driver= new ChromeDriver();
    public static final Target INPUT_FIRSTNAME=Target.the("first name of user").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME=Target.the("last name of user").located(By.id("lastName"));
    public static final Target INPUT_EMAIL=Target.the("email  of user").located(By.id("email"));
    public static final Target SELECT_MONTH=Target.the("day of birth").located(By.id("birthMonth"));
    public static final Target SELECT_DAY=Target.the("day of birth").located(By.id("birthDay"));
    public static final Target SELECT_YEAR=Target.the("year of birth").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON =Target.the( "button that start the register").located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
