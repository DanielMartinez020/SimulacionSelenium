package cr.ac.ufidelitas.simulacion.tests;

import cr.ac.ufidelitas.simulacion.pages.HomePage;
import cr.ac.ufidelitas.simulacion.pages.ProductPage;
import cr.ac.ufidelitas.simulacion.utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CP03_AgregarCarrito {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = DriverFactory.getDriver();

        HomePage home = new HomePage(driver);

        ProductPage producto = new ProductPage(driver);

        home.abrirPagina();

        Thread.sleep(5000);

        home.irProductos();

        Thread.sleep(7000);

        producto.agregarPrimerProducto();

        Thread.sleep(5000);

        if(producto.validarProductoAgregado()){

            System.out.println("CP03 APROBADO");

        }else{

            System.out.println("CP03 FALLIDO");

        }

        Thread.sleep(5000);

        driver.quit();

    }

}