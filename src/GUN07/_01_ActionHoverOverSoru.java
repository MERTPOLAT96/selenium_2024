package GUN07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionHoverOverSoru extends BaseDriver {

    @Test

    public void Test1(){

        driver.get("https://www.etsy.com/");

        WebElement mucevher= driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement kolye= driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibkolye= driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar=new Actions(driver);

        aksiyonlar.moveToElement(mucevher).build().perform();
        MyFunc.Bekle(2); // gözükene kadar bekle diyeceğiz ileride
        aksiyonlar.moveToElement(kolye).build().perform();
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(bibkolye).click().build().perform();
        MyFunc.Bekle(2);

        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        Assert.assertTrue("URL de bib kolye var mı" ,

                driver.getCurrentUrl().contains("bib-necklaces"));

        // beklentiyi yazıyorum testi tam olarak geçsin diye hatasız bir şekilde




        BekleKapat();


    }
}
