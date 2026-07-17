package cr.ac.ufidelitas.simulacion.tests;

import cr.ac.ufidelitas.simulacion.pages.HomePage;
import cr.ac.ufidelitas.simulacion.pages.LoginPage;
import cr.ac.ufidelitas.simulacion.utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CP06_Login {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverFactory.getDriver();

        HomePage home = new HomePage(driver);

        LoginPage login = new LoginPage(driver);

        home.abrirPagina();

        Thread.sleep(5000);

        login.irLogin();

        Thread.sleep(7000);

        login.iniciarSesion(
                "dm528043@gmail.com",
                "12345");

        Thread.sleep(5000);

        if (login.loginCorrecto()) {

            System.out.println("CP06 APROBADO: Inicio de sesión exitoso.");

        } else {

            System.out.println("CP06 FALLIDO: No fue posible iniciar sesión.");

        }

        Thread.sleep(5000);

        driver.quit();

    }

}