package sela;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class automate
{
    public static void main(String[] args) {


        System.setProperty("webdriver.edge.driver", "E:\\Pehxn\\.KDU\\.3rd yr\\6th sem\\SQA\\Selenium Automation\\msedgedriver.exe");

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        rumLMS(driver);
        //rumGmail(driver);

        // driver.quit();
    }

    private  static  void waitForMe(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private  static  void waitForMe(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void rumLMS(WebDriver driver){
        driver.get("http://nw.lms.kdu.ac.lk/lms/login/index.php");
        waitForMe(10);
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("38-bit-00020@kdu.ac.lk");
        waitForMe(10);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("LMS@Pehan0");
        waitForMe(10);
        driver.findElement(By.xpath("//button[@id='loginbtn']")).submit();
    }

//    private static void rumGmail(WebDriver driver){
//        driver.get("https://accounts.google.com/InteractiveLogin");
//        waitForMe();
//        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("pehankannangara20@gmail.com");
//        waitForMe();
//        driver.findElement(By.id("identifierNext")).click();
//        waitForMe(10);
//        driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']")).sendKeys("LMS@Pehan0");
//        driver.findElement(By.xpath("//span[text()='Next']")).click();
//        waitForMe(10);
//        System.out.println("operation sucessful");
//        waitForMe(10);
//        driver.quit();

//    }
}
