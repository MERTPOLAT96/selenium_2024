package GUN09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */

public class _02_İFramelerGecis extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://chercher.tech/practice/frames");


        driver.switchTo().frame(0);

        WebElement element1= driver.findElement(By.cssSelector("b[id='topic']+input"));
        element1.sendKeys("Türkiye");

        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);

        WebElement element2= driver.findElement(By.id("animals")); // select le başlıyor
        Select menu=new Select(element2);
        menu.selectByVisibleText("Avatar");




        BekleKapat();


    }
}
