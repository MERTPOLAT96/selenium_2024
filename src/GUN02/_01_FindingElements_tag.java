package GUN02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");


        List<WebElement> linkler = driver.findElements(By.tagName("a")); // verilen taglerdeki tüm elemanları aldık

        // verilen tag lerdeki tüm elemanları aldık

        for (WebElement e : linkler) {

            if (e.getText().isEmpty()) { // boş olan ları yazdırmış oldum boş linkler yani sayfanın üretmemesi gereken kodlar

                System.out.println("e.getAttribute(\"href\") = " + e.getAttribute("href"));
                System.out.println("e.getAttribute(\"title\") = " + e.getAttribute("title"));
                System.out.println("e.getAttribute(\"rel\") = " + e.getAttribute("rel"));

                // soncunda a ile başlayan bütün tagleri almış oldum

            }


            BekleKapat();


        }
    }
}
