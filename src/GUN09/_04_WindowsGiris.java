package GUN09;

import Utility.BaseDriver;
import Utility.MyFunc;
import com.sun.org.apache.bcel.internal.generic.Select;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.selenium.dev/");

        // şu aşamada ana sayfadayım

        // bulunulan window id yi almak için

        String anasayfaWindowID=driver.getWindowHandle();
        System.out.println("anasayfaWindowID = " + anasayfaWindowID);


        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link:linkler) {

            if (!link.getAttribute("href").contains("mail"))
            link.click();

            // şu aşamada bütün sayfalar açıldı


            Set<String> windowsIDler=driver.getWindowHandles();

            for (String id:windowsIDler) {

                System.out.println("id = " + id);

                // şu anda en son açılan sayfadayım ana sayfaya geçmek için

                driver.switchTo().window(anasayfaWindowID); // ana sayfayA geçtim

                MyFunc.Bekle(10);
                BekleKapat();


            }

        }
    }
}
