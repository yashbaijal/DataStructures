package seleniumPractice.handleMutipleWindows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class SwithToWindows {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
       // String parentWIndow=driver.getWindowHandle();

        driver.findElement(By.id("selenium143")).click();

        driver.findElement(By.linkText("Open a popup window")).click();


       Set<String> windows= driver.getWindowHandles();
       for(String s:windows)
       {
           driver.switchTo().window(s);
           try
           {
               System.out.println(driver.getTitle());
               String text=driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
               System.out.println(text);
               driver.quit();
               break;
           }catch (NoSuchElementException e)
           {
               driver.close();
           }

       }


    }
}
