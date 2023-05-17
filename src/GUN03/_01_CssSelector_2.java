package GUN03;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

public class _01_CssSelector_2 extends BaseDriver {

    public static void main(String[] args) {


        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        String mesajim="mert";


        WebElement entermessage= driver.findElement(By.cssSelector("input[id='user-message']"));
        entermessage.sendKeys("mert");

        WebElement showmessage= driver.findElement(By.cssSelector("button[onclick='showInput();']"));
        showmessage.click();

        WebElement msg= driver.findElement(By.cssSelector("[id='display']"));

        Assert.assertTrue(msg.getText().equals(mesajim));




        BekleKapat();
    }
}
