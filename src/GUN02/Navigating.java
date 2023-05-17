package GUN02;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Navigating extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);

        WebElement element= driver.findElement(By.id("alerttest"));
        //WebElement element1= element.findElement(By.linkText("Alerts (JavaScript)"));
        element.click();
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğun url yi verir (adres çubuğu https kısmı)

        driver.navigate().back(); // sayfaya geri git dedim
        MyFunc.Bekle(3);

        driver.navigate().forward(); // sayfaya ileri git dedim
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl()); // o anda bulunduğun url yi gösterir



        BekleKapat();
    }
}
