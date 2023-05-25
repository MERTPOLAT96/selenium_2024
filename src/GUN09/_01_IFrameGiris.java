package GUN09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://chercher.tech/practice/frames");

        // id=frame1 name=iamframe index?: bulunduğu sayfadaki kod sırası

        driver.switchTo().frame(0);

        WebElement element1= driver.findElement(By.cssSelector("b[id='topic']+input"));
        element1.sendKeys("Türkiye");

        // iframe içindeki bir locatorda işlem yapılacaksa önce o iframe geçmem lazım
        // driver.switchTo().frame(0); // ilgili odaya (iframe) geç
        // driver.switchTo().parentFrame(): // bir önceki odaya geç, parente geç
        //driver.switchTo().defaultContent(); // ilk ana sayfaya direk geçer.

        BekleKapat();






    }
}
