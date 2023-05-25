package GUN10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _01_ScrollIntro extends BaseDriver {

    @Test
    public void Test1()
    {

        driver.get("https://p-del.co/");

        MyFunc.Bekle(2);

        //Actions aksiyonlar=new Actions(driver); // driver üzerinden Aksiyon işlemleri için

        //Select webSelect=new Select(element); // bir tane element için

        //JavaScriot komutlarını çalıştırmak için önce js değişkeni tanımlandı


        JavascriptExecutor js=(JavascriptExecutor) driver; // cast yapıldı

        js.executeScript("window.scrollBy(0,3000)");


        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,-3000)");

        BekleKapat();
    }
}
