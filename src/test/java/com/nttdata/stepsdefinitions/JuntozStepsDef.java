package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.nttdata.steps.JuntozSteps;

public class JuntozStepsDef {

    private WebDriver driver;

    private Scenario scenario;

    private JuntozSteps jlogin;

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }


    @Given("que me encuentro en la página de Juntoz")
    public void queMeEncuentroEnLaPaginaDeJuntoz() {
        driver.get("https://juntoz.com/");
        jlogin = new JuntozSteps(driver);
        screenShot();
    }

    @And("cierro pop ups")
    public void cierroPopUps() {
        jlogin.popups();
    }

    @And("clic en el boton cuenta")
    public void clicEnElBotonCuenta() {
        jlogin.cuenta();
    }

    @And("clic en el boton iniciar sesion")
    public void clicEnElBotonIniciarSesion() {
        jlogin.ingresarIniciosesion();

    }

    @When("inicio sesión con las credenciales email: {string} y contraseña: {string}")
    public void inicioSesionConLasCredencialesEmailYContrasena(String user, String password) {

        JuntozSteps juntozSteps = new JuntozSteps(driver);
        juntozSteps.typeUser(user);
        juntozSteps.typePassword(password);
        //juntozSteps.login();
        //screenShot();
    }

    @And("clic en el boton ingresar")
    public void clicEnElBotonIngresar() {
        jlogin.login();
    }

    @And("ingresar a la categoria envio gratis")
    public void ingresarALaCategoriaEnvioGratis() {
        jlogin.enviosGratis();
    }

    @And("seleccionar el primer producto")
    public void seleccionarElPrimerProducto() {
        jlogin.primerProducto();
    }

    @And("agregar al carrito")
    public void agregarAlCarrito() {
        jlogin.agregarCarrito();
    }

    @Then("validar que se haya agregado exitosamente al carrito")
    public void validarQueSeHayaAgregadoExitosamenteAlCarrito() {
    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }


}
