package GUN10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {

    @Test
    public void Test1(){

        driver.manage().deleteAllCookies(); // cookies leri sildim
        driver.get("https://www.copado.com/robotic-testing");

        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement element= driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);", element); // elemente kadar kaydır, sayfanın üstünde kaldı element


        //element.click(); tıklatma özelliğini kaybettiren elementlerin altında olduğunda tıklanamaz
        js.executeScript("arguments[0].click();", element); // html içinden elemente ulaşır ve tıklatır


        BekleKapat();

    }
}
