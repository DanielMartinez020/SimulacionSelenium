package cr.ac.ufidelitas.simulacion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
//import org.openqa.selenium.JavascriptExecutor;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void abrirPagina() {

        driver.get("https://automationexercise.com");

    }

    public void irProductos() {

        WebElement botonProductos = driver.findElement(
                By.cssSelector("a[href='/products']"));

        botonProductos.click();

    }

    public void buscarProducto(String producto) {

        WebElement barraBusqueda = driver.findElement(
                By.id("search_product"));

        barraBusqueda.clear();

        barraBusqueda.sendKeys(producto);

        WebElement botonBuscar = driver.findElement(
                By.id("submit_search"));

        botonBuscar.click();

    }

    public boolean validarResultadosBusqueda() {

        List<WebElement> productos = driver.findElements(
                By.className("single-products"));

        return productos.size() > 0;

    }


}
