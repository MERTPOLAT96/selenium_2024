package GUN05;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_SelectClassGiris extends BaseDriver {

    @Test
    public void Test1(){

        driver.manage().deleteAllCookies();
        driver.get("https://www.amazon.com.tr/");
        driver.manage().deleteAllCookies();

        WebElement webMenu= driver.findElement(By.id("searchDropdownBox"));

        //bu element select tag i ile başlıyorsa sen bunu select e cast yap ve öyle kullan

        Select ddMenu=new Select(webMenu); // elementi daha rahat kullanılabilir SELECT nesnesi haline dönüştürdü.

        ddMenu.selectByIndex(4); //ister bu şekilde seçersin
        //ddMenu.selectByValue("value değerini"); // ister bu şekilde seçersin
        //ddMenu.selectByVisibleText("görünen textini"); // ister bu şekilde seçersin
        // child ler la uğraşmama gerek kalmamış oldu

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        BekleKapat();
    }
}
