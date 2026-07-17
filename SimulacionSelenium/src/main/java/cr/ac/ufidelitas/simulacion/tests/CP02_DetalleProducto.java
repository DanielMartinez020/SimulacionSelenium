package cr.ac.ufidelitas.simulacion.tests;


import cr.ac.ufidelitas.simulacion.pages.HomePage;
import cr.ac.ufidelitas.simulacion.pages.ProductPage;
import cr.ac.ufidelitas.simulacion.utils.DriverFactory;
import org.openqa.selenium.WebDriver;


public class CP02_DetalleProducto {


    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = DriverFactory.getDriver();


        HomePage home = new HomePage(driver);

        ProductPage product = new ProductPage(driver);



        home.abrirPagina();


        Thread.sleep(3000);


        home.irProductos();


        Thread.sleep(5000);


        home.buscarProducto("Tshirt");


        Thread.sleep(5000);



        product.seleccionarPrimerProducto();


        Thread.sleep(5000);



        if(product.validarDetalleProducto()){


            System.out.println(
              "CP02 APROBADO: El detalle del producto se muestra correctamente."
            );


        }else{


            System.out.println(
              "CP02 FALLIDO: No se encontró la información del producto."
            );


        }



        driver.quit();


    }

}