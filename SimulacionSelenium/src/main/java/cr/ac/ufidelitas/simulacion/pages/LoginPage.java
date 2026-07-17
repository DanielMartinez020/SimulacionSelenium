package cr.ac.ufidelitas.simulacion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void irLogin() {

        driver.findElement(
                By.linkText("Signup / Login"))
                .click();

    }

    public void iniciarSesion(String correo, String password) {

        WebElement email = driver.findElement(
                By.cssSelector("input[data-qa='login-email']"));

        email.clear();
        email.sendKeys(correo);

        WebElement clave = driver.findElement(
                By.cssSelector("input[data-qa='login-password']"));

        clave.clear();
        clave.sendKeys(password);

        driver.findElement(
                By.cssSelector("button[data-qa='login-button']"))
                .click();

    }

    public boolean loginCorrecto() {

        return driver.getPageSource().contains("Logged in as");

    }

}
