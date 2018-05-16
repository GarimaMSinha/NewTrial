package seleniumtrial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxSelection {

    static String url ="https://www.irctc.co.in/eticketing/loginHome.jsf";
    //static int a =10;
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
       
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.xpath("//*[@id='otpId']")).click();
        if(driver.findElement(By.xpath("//*[@id='otpId']")).isSelected()) {
            System.out.println("Yes Its selected");
        }
        else System.out.println("Not Selected");
       

    }

}