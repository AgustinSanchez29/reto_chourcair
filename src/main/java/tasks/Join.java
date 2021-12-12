package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import net.serenitybdd.screenplay.rest.interactions.Ensure;
import org.joda.time.Seconds;
import userinterface.UiJoin;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import javax.swing.event.CaretListener;


public class Join implements Task {


    public static Join credentials() {return Tasks.instrumented(Join.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UiJoin.JOIN_BUTTON),
                Enter.theValue("Agustin").into(UiJoin.FIRST_NAME),
                Enter.theValue("Sanchez").into(UiJoin.LAST_NAME),
                Enter.theValue("agustin@test.com").into(UiJoin.EMAIL),
                SelectFromOptions.byVisibleText("June").from(UiJoin.BIRTH_MONTH),
                SelectFromOptions.byVisibleText("29").from(UiJoin.BIRTH_DAY),
                SelectFromOptions.byVisibleText("1997").from(UiJoin.BIRTH_YEAR),
                Click.on(UiJoin.NEXT_BUTTON),
                //Enter.theValue("Panama city").into(UiJoin.CITY),
                Enter.theValue("07120").into(UiJoin.ZIP_CODE),
                //Click.on(UiJoin.COUNTRY),
                //Enter.theValue("Panama").into(UiJoin.COUNTRY),
                Click.on(UiJoin.NEXT2_BUTTON),
                Click.on(UiJoin.LAST_NEXT),
                Enter.theValue("Choucair2021*").into(UiJoin.PASS),
                Enter.theValue("Choucair2021*").into(UiJoin.CONFIRM_PASS),
                //Choucair2021*
                Click.on(UiJoin.FIRST_CHECK),
                Click.on(UiJoin.SECOND_CHECK),
                Click.on(UiJoin.COMPLETE)

                );
    }
}
