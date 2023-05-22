package GUN07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://demoqa.com/auto-complete");

        WebElement element= driver.findElement(By.id("autoCompleteSingleContainer"));

        Actions aksiyonlar=new Actions(driver);

        Action action=aksiyonlar.moveToElement(element).click().keyDown(Keys.SHIFT)
                        .sendKeys("a") // shift+a - > A
                .keyUp(Keys.SHIFT) // shift i bırak
                .sendKeys("hmet")
                        .build();

        MyFunc.Bekle(2);

        action.perform(); // gerçekleştirildi



        BekleKapat();


    }
}
