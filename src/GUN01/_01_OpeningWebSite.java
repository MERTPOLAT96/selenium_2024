package GUN01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebSite {

    public static void main(String[] args) {

        // Hepsiburada.com sayfasına git
        // arama kutusuna usb yaz
        // ara butonuna bas
        // çıkan ürünlerin açıklamasında usb kelimesini kontrol et

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");


    }
}
