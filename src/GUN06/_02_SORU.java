package GUN06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _02_SORU extends BaseDriver {

    //        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.

    @Test
    public void Test1(){

        driver.get("https://tr-tr.facebook.com/");

        MyFunc.Bekle(1);

        WebElement createnewaccount= driver.findElement(By.linkText("Yeni hesap oluştur"));
        createnewaccount.click();

        MyFunc.Bekle(1);

        WebElement name= driver.findElement(By.name("firstname"));
        name.sendKeys("mert");

        MyFunc.Bekle(1);

        WebElement surname= driver.findElement(By.name("lastname"));
        surname.sendKeys("polat");

        MyFunc.Bekle(1);

        WebElement reEmail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(reEmail.isDisplayed()); // beklenen görünmemesi false

        MyFunc.Bekle(1);

        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("repokay@hotmail.com");

        MyFunc.Bekle(1);

        Assert.assertTrue(reEmail.isDisplayed()); // beklenen görünmesi
        System.out.println("reEmail = " + reEmail.isDisplayed());

        MyFunc.Bekle(1);

        WebElement webDay= driver.findElement(By.id("day"));
        Select day=new Select(webDay);
        day.selectByVisibleText("30");

        MyFunc.Bekle(1);

        WebElement webMonth=driver.findElement(By.id("month"));
        Select month=new Select(webMonth);
        month.selectByVisibleText("Haz");

        MyFunc.Bekle(1);

        WebElement webYear=driver.findElement(By.id("year"));
        Select year=new Select(webYear);
        year.selectByVisibleText("1996");






        BekleKapat();


    }
}
