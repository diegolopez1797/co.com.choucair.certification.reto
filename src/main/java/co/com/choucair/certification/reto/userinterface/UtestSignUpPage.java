package co.com.choucair.certification.reto.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestSignUpPage extends PageObject {
    public static final Target SIGN_UP_BUTTON = Target.the("Boton para ir a formulario de registro").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target FIRST_NAME_INPUT = Target.the("Campo para escribir el nombre").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("Campo para escribir el apellido").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Campo para escribir el correo").located(By.id("email"));
}
