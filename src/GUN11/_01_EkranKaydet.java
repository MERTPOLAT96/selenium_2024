package GUN11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {

    @Test
    public void Test1() throws IOException {

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebElement username=driver.findElement(By.name("username"));
        username.sendKeys("mert");

        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("1234");

        WebElement submit=driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        // hatalı var ise çıkan element

        List<WebElement> hataMesajı=driver.findElements(By.cssSelector("div[role='alert']"));

        if (hataMesajı.size()>0){ // hata varsa

            //ekran kaydet
            System.out.println("hata oluştu");

            TakesScreenshot ts=(TakesScreenshot) driver; //1. aşama ekran görüntüsü alma değişkenini tanımladım

            File hafızadakihali=ts.getScreenshotAs(OutputType.FILE);  // 2. aşama ekran görüntüsü alındı, hafızada

            // hafızadaki bu bilgiyi dosya olarak kaydet.

            FileUtils.copyFile(hafızadakihali, new File("ekrangoruntuleri\\screenshot.png"));

            // hafızadaki bilginin dosya haline getirilmesi için yaptık


        }

        MyFunc.Bekle(2);
        BekleKapat();
    }
}
