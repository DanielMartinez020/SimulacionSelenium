package cr.ac.ufidelitas.simulacion.tests;

import cr.ac.ufidelitas.simulacion.pages.HomePage;
import cr.ac.ufidelitas.simulacion.pages.ProductPage;
import cr.ac.ufidelitas.simulacion.utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CP05_EliminarProducto {

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

        producto.eliminarProducto();

        Thread.sleep(4000);

        if (producto.carritoVacio()) {

            System.out.println("CP05 APROBADO: El producto fue eliminado correctamente.");

        } else {

            System.out.println("CP05 FALLIDO: El producto continúa en el carrito.");

        }

        Thread.sleep(5000);

        driver.quit();

    }

}