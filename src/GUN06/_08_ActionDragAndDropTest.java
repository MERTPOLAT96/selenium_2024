package GUN06;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionDragAndDropTest extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions aksiyonlar=new Actions(driver);

        WebElement oslo= driver.findElement(By.id("box1"));
        WebElement norway= driver.findElement(By.id("box101"));

        aksiyonlar.dragAndDrop(oslo,norway).build().perform();  // oslo yu al norway at

        WebElement madrid= driver.findElement(By.id("box7"));
        WebElement spain=driver.findElement(By.id("box107"));

        aksiyonlar.dragAndDrop(madrid,spain).build().perform();

        WebElement washington=driver.findElement(By.id("box3"));
        WebElement usa=driver.findElement(By.id("box103"));

        aksiyonlar.dragAndDrop(washington,usa).build().perform();

        WebElement rome=driver.findElement(By.id("box6"));
        WebElement ıtaly=driver.findElement(By.id("box106"));

        aksiyonlar.dragAndDrop(rome,ıtaly).build().perform();





        //2. yöntem

        //aksiyonlar.clickAndHold(oslo).build().perform(); // oslo yu tıklat ve al
        //aksiyonlar.moveToElement(norway).release().build().perform(); // norway in üzerine git bırak





        BekleKapat();


    }
}
