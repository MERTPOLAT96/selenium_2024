package GUN01;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByName {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement ad= driver.findElement(By.name("q8_name[first]"));
        ad.sendKeys("mert");

        MyFunc.Bekle(3);
        driver.quit();
    }
}
