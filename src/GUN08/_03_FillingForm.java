package GUN08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */

public class _03_FillingForm extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement element1= driver.findElement(By.cssSelector("[id='title']"));
        element1.sendKeys("mert");

        MyFunc.Bekle(2);

        WebElement element2= driver.findElement(By.cssSelector("[id='description']"));
        element2.sendKeys("yukarıda yazdığım benim ismimdir");

        MyFunc.Bekle(2);

        WebElement element3= driver.findElement(By.cssSelector("[id='btn-submit']"));
        element3.click();

        MyFunc.Bekle(2);


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("[id='submit-control']"), "Form submited Successfully!"));

        BekleKapat();


    }
}
