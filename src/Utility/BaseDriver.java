package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;






    static {

        Logger logger= Logger.getLogger(""); // sisteme ait bütün logları üreten objeye/servise ulaştım ""
        logger.setLevel(Level.SEVERE); // Sadece errorları göster

        // gerekmeyen logları kaldıracağız

        // System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        driver=new ChromeDriver();

        driver.manage().window().maximize(); // ekranı max yapıyor

        Duration dr=Duration.ofSeconds(30);
        driver.manage().timeouts().pageLoadTimeout(dr);

        //sadece tüm sayfanın kodlarının bilgisayarınıza inmesi süresiyle ilgili

        // bu eklenmezse selenium sayfa yüklenene kadar sonsuza bekler

        //30 sn süresince sayfanın yüklenmesini bekle yüklenmezse hata ver

        //eğer 2 sn yüklerse 30 sn beklemez

        driver.manage().timeouts().implicitlyWait(dr); // bütün webelementlerin element bazında, elemente özel işlem yapılmadan önce

        //hazır hale gelmesi verilen mühlet yani süre

        //eğer 2 sn yüklerse 30 sn beklemez
    }



    public static void BekleKapat(){

        MyFunc.Bekle(3);
        driver.quit();
    }

    public static void KalanOncekileriKapat() {

        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
}
