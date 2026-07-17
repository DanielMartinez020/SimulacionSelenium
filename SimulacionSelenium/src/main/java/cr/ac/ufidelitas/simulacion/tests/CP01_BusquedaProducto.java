package cr.ac.ufidelitas.simulacion.tests;

import cr.ac.ufidelitas.simulacion.pages.HomePage;
import cr.ac.ufidelitas.simulacion.utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CP01_BusquedaProducto {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverFactory.getDriver();

        HomePage home = new HomePage(driver);

        home.abrirPagina();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

        home.irProductos();

        Thread.sleep(5000);

        home.buscarProducto("Tshirt");

        Thread.sleep(5000);

        if (home.validarResultadosBusqueda()) {

            System.out.println("CP01 APROBADO: Se encontraron productos.");

        } else {

            System.out.println("CP01 FALLIDO: No se encontraron productos.");

        }

        driver.quit();

    }

}
