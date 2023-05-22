package GUN07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement element= driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
        MyFunc.Bekle(2);
        element.click();

        MyFunc.Bekle(2);

        //alert açılıyor
        driver.switchTo().alert().accept(); // alert kutusunu OK yine bas, böylece kapandı


        BekleKapat();





    }
}
