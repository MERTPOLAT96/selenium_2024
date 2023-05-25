package GUN09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */

public class _05_WindowsSoru extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.selenium.dev/");

        String anasayfaWindowID= driver.getWindowHandle(); // anasayfayı aldım


        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link : linkler)

            if (!link.getAttribute("href").contains("mail"))
                link.click();


            Set<String> windowsIdler=driver.getWindowHandles();

            for (String id:windowsIdler) {

                driver.switchTo().window(id); // sıradaki tabdaki window a geçmiş oldum

                System.out.println("title"+ driver.getTitle()+" , url="+driver.getCurrentUrl());

            }

            // ana sayfa harici kapama

        for (String id:windowsIdler) {

            if (id.equals(anasayfaWindowID))
                continue;

            MyFunc.Bekle(3);
            driver.switchTo().window(id); // sıradaki tabdaki window a geçmiş oldum
            driver.close();



        }

            BekleKapat();

            }


        }



