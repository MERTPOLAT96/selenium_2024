package GUN07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement element= driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
        MyFunc.Bekle(2);
        element.click();

        MyFunc.Bekle(2);

        // alert açılıyor
        driver.switchTo().alert().sendKeys("mert");
        driver.switchTo().alert().accept();

        WebElement element2= driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue("Bekleme yazı gözükdü mü" , element2.getText().contains("mert"));


        BekleKapat();



    }
}
