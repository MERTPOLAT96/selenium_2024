package GUN02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetCssValue extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter= driver.findElement(By.id("inputValEnter"));


        // elemanın parametrelerine ulaşmak için getAttribute u kullanıyoruz
        System.out.println("inputValEnter.getAttribute(\"class\") = " + inputValEnter.getAttribute("class"));


        // class ın karşılığı olan CSS şekillendirme değerlerini almak için gettCssValue kullanılır
        System.out.println(inputValEnter.getCssValue("color"));
        System.out.println(inputValEnter.getCssValue("font-size"));
        System.out.println(inputValEnter.getCssValue("background"));


        BekleKapat();
    }
}
