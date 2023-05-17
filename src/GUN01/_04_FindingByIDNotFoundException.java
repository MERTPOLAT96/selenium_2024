package GUN01;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_FindingByIDNotFoundException {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement name= driver.findElement(By.className("form-textbox validate[required]"));
        name.sendKeys("mert");

        //birden fazla aynı locator a sahip eleman bulunursa findElement ne yapar?
        // cevap : ilk elementi bulur

        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));
        System.out.println("labels.size() = " + labels.size());


        for (WebElement e:labels)
            System.out.println("e.getText() = " + e.getText());

        // findElements is size ı 0 olan list verir,yani hata vermez

        MyFunc.Bekle(3);
        driver.quit();
    }
}
