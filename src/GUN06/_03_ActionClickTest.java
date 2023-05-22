package GUN06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionClickTest extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/buttons");

        WebElement element= driver.findElement(By.xpath("//button[text()='Click Me']"));


        Actions aksiyonlar=new Actions(driver); // web sayfası aksiyonlara açıldı

        Action aksiyon=aksiyonlar.moveToElement(element).click().build();

        // elementin üzerine click için git orada bekle, aksiyonu hazırla

        System.out.println("aksiyon hazırlandı");

        MyFunc.Bekle(2);

        aksiyon.perform(); // aksiyonu gerçekleştir. , işleme al,uygula,icra et
        System.out.println("aksiyon gerçekleştir");

        BekleKapat();


    }
}
