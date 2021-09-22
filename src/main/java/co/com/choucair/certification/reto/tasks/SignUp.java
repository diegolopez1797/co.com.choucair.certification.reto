package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.UtestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignUp implements Task {
    public static SignUp onThePage() {
        return Tasks.instrumented(SignUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestSignUpPage.SIGN_UP_BUTTON),
                Enter.theValue("Diego").into(UtestSignUpPage.FIRST_NAME_INPUT),
                Enter.theValue("Lopez").into(UtestSignUpPage.LAST_NAME_INPUT),
                Enter.theValue("diegolop1797@gmail.com").into(UtestSignUpPage.EMAIL_INPUT));

    }
}
