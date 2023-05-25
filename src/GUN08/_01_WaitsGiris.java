package GUN08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*
    Selenium bekletme komutları

    Implicitly Wait:

    Tüm sayfadaki elemanlar için , elemanın locatorı sayfa içerisinde bulunabilir hale getirene kadar verilen bekletme süresi

    Bütün elemanlar için geçerli ve eleman bulunduğunda kalan süreyi beklemez.NoSuchElement hatası için verilen süre kadar bekler.

    Duration time=Duration.ofSeconds(15);
        driver.manage().timeouts().implicitlyWait(time);

        MyFunc.Bekle(30)  bu programı durduruyor.  sayfaylada bir ilgisi olmadığı için sonuna kadar bekler.

        testlerle ilgili güzel bir işlem değil, java ile alakalı olduğundan programı durdurur.


 */

public class _01_WaitsGiris extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn= driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration time=Duration.ofSeconds(15);
        driver.manage().timeouts().implicitlyWait(time);


        WebElement message= driver.findElement(By.xpath("//P[text()='WebDriver']"));

        // elementin html içerisinde locator olarak var olabilir hale gelmesinin süresine katkısı var yani var ya da yok



        BekleKapat();


    }
}
