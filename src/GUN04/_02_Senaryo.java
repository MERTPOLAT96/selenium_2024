package GUN04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _02_Senaryo extends BaseDriver {

    @Test

    public  void Test1(){

        //1- https://www.saucedemo.com/
        //2- login işlemini yapınız.   //input[@id='user-name']  //input[@id='password']  //input[@id='login-button']
        //3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
        //4- Sonra geri dönün (Back to products e tıklatın)
        //5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
        //6- sepete tıklatın
        //7- CheckOut a tıklatın
        //8- kullanıcı bilgilerini doldurup Continue ya tıklatın
        //9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
        //Item total e eşit olup olmadığını Assert ile test ediniz.

        //Bu soruda tamamen XPATH kullanılacaktır.


        driver.get("https://www.saucedemo.com/");

        WebElement firstbox= driver.findElement(By.xpath("//input[@id='user-name']"));
        firstbox.sendKeys("standard_user");

        MyFunc.Bekle(2);

        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("secret_sauce");

        MyFunc.Bekle(3);

        WebElement button=driver.findElement(By.xpath("//input[@id='login-button']"));
        button.click();

        MyFunc.Bekle(3);

        WebElement sauce=driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        sauce.click();

        WebElement addtocart=driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addtocart.click();

        MyFunc.Bekle(3);

        WebElement back=driver.findElement(By.xpath("//button[@id='back-to-products']"));
        back.click();

        MyFunc.Bekle(3);

        WebElement tshirt=driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        tshirt.click();

        MyFunc.Bekle(3);

        WebElement addtocart2=driver.findElement(By.xpath("//button[text()='Add to cart']"));
        addtocart2.click();

        MyFunc.Bekle(3);

        WebElement back2=driver.findElement(By.xpath("//button[@id='back-to-products']"));
        back2.click();


        MyFunc.Bekle(3);

        WebElement sepet=driver.findElement(By.xpath("//span[text()='2']"));
        sepet.click();

        MyFunc.Bekle(2);

        WebElement checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
        checkout.click();

        MyFunc.Bekle(2);

        WebElement firstname=driver.findElement(By.xpath("//input[@id='first-name']"));
        firstname.sendKeys("mert");

        MyFunc.Bekle(2);

        WebElement lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
        lastname.sendKeys("polat");

        MyFunc.Bekle(2);

        WebElement zip=driver.findElement(By.xpath("//input[@id='postal-code']"));
        zip.sendKeys("1234");

        MyFunc.Bekle(2);

        WebElement cont=driver.findElement(By.xpath("//input[@id='continue']"));
        cont.click();

        // ürünlerin ücretleri testi

        List<WebElement> ucretler=driver.findElements(By.xpath("//div[@class='inventory_item_price']"));

        double toplam=0;

        for (WebElement e:ucretler) {
            System.out.println("e.getText() = " + e.getText());


            toplam=toplam+ Double.parseDouble(e.getText().substring(1)); // 1 den itibaren sonuna kadar al

        }

        System.out.println("toplam = " + toplam);

        WebElement webaltToplam=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']"));
        System.out.println("webaltToplam.getText() = " + webaltToplam.getText());

        System.out.println("webaltToplam.getText().replaceAll(\"[^0-9,.]\",\"\") = " + webaltToplam.getText().replaceAll("[^0-9,.]",""));

        Double alttoplam=Double.parseDouble(webaltToplam.getText().replaceAll("[^0-9,.]",""));

        Assert.assertTrue("values not equal",(toplam==alttoplam));





        BekleKapat();


    }
}
