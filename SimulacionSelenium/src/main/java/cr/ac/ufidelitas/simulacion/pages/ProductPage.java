package cr.ac.ufidelitas.simulacion.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    private WebDriver driver;


    public ProductPage(WebDriver driver) {

        this.driver = driver;

    }


    public void seleccionarPrimerProducto() {

        WebElement botonViewProduct = driver.findElement(
                By.cssSelector("a[href='/product_details/2']"));

        botonViewProduct.click();

    }


    public boolean validarDetalleProducto() {


    WebElement nombreProducto = driver.findElement(
            By.xpath("//div[@class='product-information']//h2"));


    WebElement precioProducto = driver.findElement(
            By.xpath("//div[@class='product-information']//span"));


    return nombreProducto.isDisplayed()
            && precioProducto.isDisplayed();


}
    
    public void agregarPrimerProducto() {

    driver.findElement(
        By.cssSelector("a[data-product-id='1']")
    ).click();

}
    
    public boolean validarProductoAgregado() {

    return driver.findElement(
            By.className("modal-content"))
            .getText()
            .contains("Your product has been added to cart");

}

    public void irAlCarrito() {

    driver.findElement(
            By.linkText("View Cart"))
            .click();

}
    
    public boolean validarProductoEnCarrito() {

    return driver.findElements(
            By.className("cart_description"))
            .size() > 0;

}
    
    public void eliminarProducto() {

    driver.findElement(
            By.className("cart_quantity_delete"))
            .click();

}
    public boolean carritoVacio() {

    return driver.findElements(
            By.className("cart_description"))
            .size() == 0;

}
}