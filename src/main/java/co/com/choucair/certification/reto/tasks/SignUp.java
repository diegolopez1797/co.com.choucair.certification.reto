package co.com.choucair.certification.reto.tasks;

import co.com.choucair.certification.reto.userinterface.UtestSignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class SignUp implements Task {
    private String strName;
    private String strLastName;
    private String strEmail;
    public SignUp(String strName, String strLastName, String strEmail) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }

    public static SignUp onThePage(String strName, String strLastName, String strEmail) {
        return Tasks.instrumented(SignUp.class, strName, strLastName, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestSignUpPage.SIGN_UP_BUTTON),
                Enter.theValue(strName).into(UtestSignUpPage.FIRST_NAME_INPUT),
                Enter.theValue(strLastName).into(UtestSignUpPage.LAST_NAME_INPUT),
                Enter.theValue(strEmail).into(UtestSignUpPage.EMAIL_INPUT));

    }
}
