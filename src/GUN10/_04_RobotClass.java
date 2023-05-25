package GUN10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class _04_RobotClass extends BaseDriver {

    @Test
    public void Test1() throws AWTException {

        driver.get("http://demo.guru99.com/test/upload/");

        MyFunc.Bekle(2);

       // driver.switchTo().frame("gdpr-consent-notice"); // name gdpr-consent-notice

       // List<WebElement> acceptall=driver.findElements(By.xpath("//span[text()='Accept All']"));

       // if (acceptall.size() > 0)

         //   acceptall.get(0).click();

        /***************/

        Robot rbt=new Robot();


        for (int i = 0; i <21 ; i++) {


            MyFunc.Bekle(1);
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı
        }

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        // buraya kadar windows dosya bul açıldı
        // aşağıdaki bölüm dosyanın yolunu hafızaya kopyalıyor
        StringSelection dosyaYolu = new StringSelection("\"C:\\Users\\thermaltake\\Desktop\\New Text Document.txt\"");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(dosyaYolu, null);

        rbt.keyPress(KeyEvent.VK_CONTROL); // bu iki tuş şu anda basılmış vaziyette, hafızadaki
        rbt.keyPress(KeyEvent.VK_V);

        MyFunc.Bekle(2);

        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V);


        MyFunc.Bekle(2);
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);

        MyFunc.Bekle(2);
        // checkbox gelindi

        for (int i = 0; i <2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);

        }
        MyFunc.Bekle(2);


        rbt.keyPress(KeyEvent.VK_SPACE);
        rbt.keyRelease(KeyEvent.VK_SPACE);

        MyFunc.Bekle(2);

        // butona gelindi

        for (int i = 0; i <2 ; i++) {
            rbt.keyPress(KeyEvent.VK_TAB);
            rbt.keyRelease(KeyEvent.VK_TAB);

        }

        MyFunc.Bekle(2);

        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);


        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement message=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='has been successfully uploaded.']")));

        Assert.assertTrue(message.isDisplayed());




        BekleKapat();
    }


}
