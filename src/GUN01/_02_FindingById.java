package GUN01;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        driver.get("https://form.jotform.com/221934510376353"); //sayfaya gittim

        WebElement name=driver.findElement(By.id("first_8")); // elemanı id ile bul
        name.sendKeys("mert"); // kutucuklara yazı gönderme

        WebElement surname= driver.findElement(By.id("last_8"));
        surname.sendKeys("polat"); // soyismi id ile bul



        name.clear();
        surname.clear();

        // first name yazarsak bütün kelimelerde arar

        //#first_name yazarsak bütün ıd parametrelerinde arar

        WebElement labelFirstName= driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName.getText() = " + labelFirstName.getText());

        WebElement labelLastName= driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());

        WebElement button= driver.findElement(By.id("input_2"));
        button.click();


        MyFunc.Bekle(5);
        driver.quit();


    }
}
