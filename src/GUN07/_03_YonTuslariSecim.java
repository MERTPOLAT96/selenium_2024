package GUN07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_YonTuslariSecim extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/auto-complete");

        WebElement txtbox= driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions aksiyonlar=new Actions(driver);

        //elemente git, içine tıklat , b tuşuna bas

        Action aksiyon=aksiyonlar.moveToElement(txtbox).click().sendKeys("b").build();

        aksiyon.perform();

        MyFunc.Bekle(2);

        Action action2=aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER)

                .build();

        action2.perform();



        BekleKapat();
    }
}
