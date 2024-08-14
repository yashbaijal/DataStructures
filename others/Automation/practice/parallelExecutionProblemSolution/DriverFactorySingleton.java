package seleniumPractice.parallelExecutionProblemSolution;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactorySingleton {

    public static ThreadLocal<DriverFactorySingleton> driverFactorySingleton=new ThreadLocal<>();
    public static ThreadLocal<WebDriver> driver=new ThreadLocal<>();

    private DriverFactorySingleton()
    {
        System.out.println("Instantiated Singleton class ...");
    }

    public static DriverFactorySingleton getInstance()
    {
        if(driverFactorySingleton.get()==null)
        {
            driverFactorySingleton.set(new DriverFactorySingleton());
            setDriver();
        }
        return driverFactorySingleton.get();

    }

    public static void setDriver()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver.set(new ChromeDriver(options));
    }

    public WebDriver  getDriver()
    {
       return driver.get();
    }

    public void removeDriver()
    {
        driver.get().close();
        driverFactorySingleton.remove();
        driver.remove();
    }


}
