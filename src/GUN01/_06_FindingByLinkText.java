package GUN01;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement siparislerimlinki= driver.findElement(By.linkText("Siparişlerim"));
        // gözüken text i Siparişlerim olan a tag li webelement
        System.out.println("siparislerimlinki.getText() = " + siparislerimlinki.getText());


        WebElement kampanyalinki= driver.findElement(By.linkText("Kampanyalar"));
        System.out.println("kampanyalinki.getText() = " + kampanyalinki.getText());

        System.out.println("siparislerimlinki.getAttribute(href) = " + siparislerimlinki.getAttribute("href"));
        System.out.println("siparislerimlinki = " + siparislerimlinki.getAttribute("title"));
        System.out.println("siparislerimlinki = " + siparislerimlinki.getAttribute("rel"));

        //partialLinkText

        WebElement link2= driver.findElement(By.partialLinkText("Süper Fiyat")); // görülen link text inin bir parçası verilebiliyor
        System.out.println("link2.getText() = " + link2.getText());





        MyFunc.Bekle(3);
        driver.quit();
    }
}
