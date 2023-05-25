package GUN09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

public class _03_IFrameSoru extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://chercher.tech/practice/frames");


        driver.switchTo().frame(0);

        WebElement element1= driver.findElement(By.cssSelector("b[id='topic']+input"));
        element1.sendKeys("Türkiye");

        driver.switchTo().frame(0); // 1. frame in içindeki tek frame dolayısıyla index i 0

        WebElement element2= driver.findElement(By.xpath("//input[@id='a']")); // select le başlıyor
        element2.click();

        driver.switchTo().defaultContent(); // direk olarak ana sayfaya gider.

        driver.switchTo().frame(1);
        WebElement element3= driver.findElement(By.id("Animals"));
        Select nesneSelect=new Select(element3);
        nesneSelect.selectByIndex(3); // 4. eleman


        BekleKapat();
    }
}
