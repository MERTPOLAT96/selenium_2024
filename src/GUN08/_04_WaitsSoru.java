package GUN08;

import Utility.BaseDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününüz
 */

public class _04_WaitsSoru extends BaseDriver {


    @Test
    public void Test1() throws IOException {

        driver.get("https://www.demoblaze.com/index.html");

        WebElement element= driver.findElement(By.xpath("(//a[@class='hrefch'])[1]"));
        element.click();

        WebElement element2= driver.findElement(By.linkText("Add to cart"));
        element2.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent()); // alert çıkana kadar bekle


        driver.switchTo().alert().accept();

        WebElement mainpage= driver.findElement(By.id("nava"));
        mainpage.click();

        TakesScreenshot ts=(TakesScreenshot) driver; //1. aşama ekran görüntüsü alma değişkenini tanımladım

        File hafızadakihali=ts.getScreenshotAs(OutputType.FILE);  // 2. aşama ekran görüntüsü alındı, hafızada

        // hafızadaki bu bilgiyi dosya olarak kaydet.

        FileUtils.copyFile(hafızadakihali, new File("ekrangoruntuleri\\screenshot.png"));



        BekleKapat();




    }
}
