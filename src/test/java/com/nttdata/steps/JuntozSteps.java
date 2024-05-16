package com.nttdata.steps;

import com.nttdata.page.JPage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class JuntozSteps {

    private WebDriver driver;

    //constructor
    public JuntozSteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Escribir el usuario
     * @param user el usuario
     */
    public void typeUser(String user){
        WebElement userInputElement = driver.findElement(JPage.userInput);
        userInputElement.sendKeys(user);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(JPage.loginButton));
    }

    /**
     * Escribir el password
     * @param password el password del usuario
     */
    public void typePassword(String password){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver.findElement(JPage.passInput).sendKeys(password);
/*
        WebElement userInputElement = driver.findElement(JPage.passInput);
        userInputElement.sendKeys(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(444));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(JPage.loginButton));

 */
    }

    /**
     * Hacer click en el botón login
     */
    public void login(){

        this.driver.findElement(JPage.loginButton).click();
    }

    public void esperarElemento(By elemento){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
        wait.until( ExpectedConditions.elementToBeClickable(elemento));
    }

    public void popups() {
        esperarElemento(JPage.btnCerrar1);
        WebElement btnCerrar1 = driver.findElement(JPage.btnCerrar1);
        btnCerrar1.click();

        esperarElemento(JPage.btnCerrar2);
        WebElement btnCerrar2 = driver.findElement(JPage.btnCerrar2);
        btnCerrar2.click();
    }

    public void cuenta() {
        WebElement btnCuenta = driver.findElement(JPage.btnCuenta);
        btnCuenta.click();
    }

    public void ingresarIniciosesion() {
        esperarElemento(JPage.btnIniciarSesion);
        WebElement btnIniciarSesion = driver.findElement(JPage.btnIniciarSesion);
        btnIniciarSesion.click();
    }

    public void enviosGratis() {
        esperarElemento(JPage.btnEnvioGratis);
        WebElement btnEnvioGratis = driver.findElement(JPage.btnEnvioGratis);
        btnEnvioGratis.click();
    }

    public void primerProducto() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        esperarElemento(JPage.firstProduct);
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        WebElement firstProduct = driver.findElement(JPage.firstProduct);
        firstProduct.click();
    }

    public void agregarCarrito() {
        esperarElemento(JPage.addCart);
        WebElement addCart = driver.findElement(JPage.addCart);
        addCart.click();

        esperarElemento(JPage.addCartConfirm);
        WebElement addCartConfirm = driver.findElement(JPage.addCartConfirm);
        addCartConfirm.click();

    }
}
