package com.kardmatch.base.homePage;

import com.kardmatch.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeKardmatch extends Base {

    public HomeKardmatch(WebDriver driver) {
        super(driver);
    }
    //Crear los localizadores
    By linkGetCardOnLine = By.xpath("/html/body/header/nav/div/ul/li[3]/a/span/span");
    By titutloBanner = By.id("titleBreadCrum");
    By messageBanner= By.tagName("Solicitar una Tarjeta de CrÃ©dito por Internet tiene muchas ventajas");
    By btnMoreInformation = By.xpath("/html/body/div[5]/div/div/div[2]/div/div/a");
    By inputMailText = By.xpath("//*[@id=\"email\"]");
    By ingresoMensual = By.xpath("//*[@id=\"ingreso\"]");



    //crear metodos acciones a realizar
    public  void surfToTheCardOnLine(){
        if (isDisplayed(linkGetCardOnLine)){
            click(linkGetCardOnLine);
            click(btnMoreInformation);
            click(inputMailText);
            type("lonny@gmail.com",inputMailText);
            click(ingresoMensual);
            type("50000",ingresoMensual);

        }
        else {
            System.out.println("Web element not found");
        }

    }
}
