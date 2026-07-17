package cr.ac.ufidelitas.simulacion;

/*IMPORTANTE
La publicidad del sitio web es inestable, suele aparecer o aveces no, en caso
de que aparezca ya sea el banner desplegable o el popup en toda la pantalla al
ejecutar algún caso, por favor cerrar manualmente.
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimulacionSelenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://automationexercise.com/");

        System.out.println("Título:");
        System.out.println(driver.getTitle());

        System.out.println();

        System.out.println("URL:");
        System.out.println(driver.getCurrentUrl());

        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
        }

        driver.quit();

    }

}