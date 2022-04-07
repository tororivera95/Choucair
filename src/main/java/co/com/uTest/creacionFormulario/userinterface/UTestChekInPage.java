package co.com.uTest.creacionFormulario.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestChekInPage extends PageObject {

    public static final Target CHEKIN_BUTTON = Target.the("We click on the register button")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target INPUT_FIRSTNAME = Target.the("We enter name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME = Target.the("Let's enter surnames")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL  = Target.the("We enter Email")
            .located(By.id("email"));

    public static final Target INPUT_MONTH = Target.the("We select the month")
            .located(By.id("birthMonth"));

    public static final Target INPUT_DAY = Target.the("We select the day")
            .located(By.id("birthDay"));

    public static final Target INPUT_YEAR = Target.the("We select the year")
            .located(By.id("birthYear"));

    public static final Target NEXT_BUTTON = Target.the("We click on next")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a/span"));

    public static final Target INPUT_CITY = Target.the("We select the city")
            .located(By.id("city"));

    public static final Target INPUT_CODPOSTAL = Target.the("We select the postal code")
            .located(By.id("zip"));

    public static final Target NEXTDOS_BUTTON = Target.the("Select next button")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a/span"));

    public static final Target YOUR_COMPUTER = Target.the("We display the computer menu")
            .located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/span[2]"));

    public static final Target YOUR_COMPUTER_OPTION = Target.the("We select type of computer")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/ul/li/div[7]/span"));

    public static final Target COMPUTER_VERSION = Target.the("We display the computer version menu")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span"));

    public static final Target VERSION_OPTION = Target.the("We select version option")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/ul/li/div[4]/span"));

    public static final Target SELECT_LANGUAGE = Target.the("We display the language menu")
            .located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]/span"));

    public static final Target LANGUAGE_OPTION = Target.the("select the language option")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/ul/li/div[40]/span"));

    public static final Target SELECT_MOVIL = Target.the("We select the drop-down menu of the mobile")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));

    public static final Target MOVIL_OPTION = Target.the("We select the mobile option")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[5]/span"));

    public static final Target SELECT_MODEL = Target.the("We select the drop-down menu of the model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span"));

    public static final Target MODEL_OPTION = Target.the("We select the option of the model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[7]/span"));

    public static final Target SELECT_OPERATING = Target.the("We select the drop-down menu of the operating")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));

    public static final Target OPERATING_OPTION = Target.the("select the operating option")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[6]/span"));

    public static final Target NEXTDOS_BUTTONDOS = Target.the("Select next button")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));

    public static final Target PASSWORD = Target.the("we enter password")
            .located(By.id("password"));

    public static final Target PASSWORD_CONFIR = Target.the("password confirmation")
            .located(By.id("confirmPassword"));

    public static final Target CLICK_INFO = Target.the("we accept info")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target CLICK_UTESTCONF = Target.the("accept UTestConf")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CLICK_PRIVA = Target.the("accept privacy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_FIN = Target.the("end button")
            .located(By.id("laddaBtn"));
}
