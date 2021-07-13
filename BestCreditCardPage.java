package com.kardmatch.base.homePage;

import com.kardmatch.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BestCreditCardPage extends Base {
    By inputMailText = By.xpath("//*[@id=\"email\"]");

    public BestCreditCardPage(By inputMailText) {
        this.inputMailText = inputMailText;
    }
    //Metodo para llenar formulario

    public  void fillForm(){
        if (isDisplayed(inputMailText)){
            click(inputMailText);
            type("lony@gmail.com",inputMailText);
        }
        else {
            System.out.println("Web element not found");
        }


    }


}
