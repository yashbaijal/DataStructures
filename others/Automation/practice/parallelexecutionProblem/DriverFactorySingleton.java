package seleniumPractice.paralleExecutionProblem;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactorySingleton {

    public static DriverFactorySingleton driverFactorySingleton=null;

    public static WebDriver driver;

    private DriverFactorySingleton()
    {
        System.out.println("Initiated");
        setDriver();
    }

    public static void setDriver()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver=new ChromeDriver(options);
    }

    public  WebDriver getDriver()
    {
        return driver;
    }

    public static DriverFactorySingleton getInstance()
    {
        if(driverFactorySingleton==null)
        {
            driverFactorySingleton = new DriverFactorySingleton();
        }
        return driverFactorySingleton;
    }

 public  void closeDriver()
 {
     getDriver().close();
     driverFactorySingleton=null;
 }



}
