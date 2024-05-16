package com.nttdata.page;

import org.openqa.selenium.By;

public class JPage {
    //Localizadores de elementos
    public static By btnCuenta = By.xpath("//div/div/a[@class='navbar-link dropdown-toggle']");
    public static By btnIniciarSesion = By.xpath("//a[@class='btn header__my-account__link']");
    public static By userInput = By.id("UserName");
    public static By passInput = By.xpath("//input[@placeholder='Contraseña']");
    public static By loginButton = By.xpath("//input[@value='Ingresar']");


    public static By btnCerrar1 = By.xpath("//w-div/w-div/span");
    public static By btnCerrar2 = By.xpath("//button[@class='align-right secondary slidedown-button']");
    public static By btnEnvioGratis = By.xpath("//div[@jztm-entity-type='home-link-envíogratis']");

    public static By firstProduct = By.xpath("/html/body/section/div/div[7]/div/div/div/div[2]/div/div[3]/div[1]/div[1]/div");
    public static By addCart = By.xpath("//button[contains(text(), 'Añadir al carrito')]");

    public static By addCartConfirm = By.xpath("//a[contains(text(), 'Ir al carrito')]");


}
