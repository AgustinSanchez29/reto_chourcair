package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.awt.*;

public class UiJoin extends PageObject {
    public static final Target JOIN_BUTTON= Target.the("presionando boton Join")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));
    public static final Target FIRST_NAME = Target.the("llenando con un nombre")
            .located(By.id("firstName"));
    public static final Target LAST_NAME= Target.the("llenando con un apellido")
            .located(By.id("lastName"));
    public static final Target EMAIL= Target.the("llenando con un correo")
            .located(By.id("email"));
    public static final Target BIRTH_MONTH= Target.the("Ingresando mes")
            .located(By.id("birthMonth"));
    public static final Target BIRTH_DAY= Target.the("Ingresando day")
            .located(By.id("birthDay"));
    public static final Target BIRTH_YEAR= Target.the("Ingresando año")
            .located(By.id("birthYear"));
    public static final Target NEXT_BUTTON= Target.the("siguiente")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    /*public static final Target CITY= Target.the("Ingresando ciudad")
            .located(By.id("city"));*/
    public static final Target ZIP_CODE= Target.the("ingresando zip code")
            .located(By.id("zip"));
    /*public static final Target COUNTRY= Target.the("ingresando pais")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));*/
    public static final Target NEXT2_BUTTON= Target.the("Next: devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));
    public static final Target LAST_NEXT= Target.the("Boton hacia el ultimo paso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a/span"));
    public static final Target PASS= Target.the("ingresando contraseña")
            .located(By.id("password"));
    public static final Target CONFIRM_PASS= Target.the("confirmando contraseña")
            .located(By.id("confirmPassword"));
    public static final Target FIRST_CHECK= Target.the("confirmado 1")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target SECOND_CHECK= Target.the("confirmado 2")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE= Target.the("Completando formulario")
            .located(By.id("laddaBtn"));

}
