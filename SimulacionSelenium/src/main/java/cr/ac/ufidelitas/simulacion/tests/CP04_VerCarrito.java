package cr.ac.ufidelitas.simulacion.tests;

import cr.ac.ufidelitas.simulacion.pages.HomePage;
import cr.ac.ufidelitas.simulacion.pages.ProductPage;
import cr.ac.ufidelitas.simulacion.utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CP04_VerCarrito {

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

        producto.irAlCarrito();

        Thread.sleep(5000);

        if (producto.validarProductoEnCarrito()) {

            System.out.println("CP04 APROBADO: Producto encontrado en el carrito.");

        } else {

            System.out.println("CP04 FALLIDO: El producto no aparece en el carrito.");

        }

        Thread.sleep(5000);

        driver.quit();

    }

}