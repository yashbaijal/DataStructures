package seleniumPractice.dynamicTable;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleDynamicTable {

    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver(options);

        driver.get("https://practice.expandtesting.com/dynamic-table");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        List<WebElement> allHeaders=driver.findElements(By.xpath("//table[@class='table table-striped']/thead/tr/th"));
        for (WebElement e:allHeaders)
        {
            System.out.println(e.getText());
        }

        List<WebElement> nuberOfRows=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr"));
        Assert.assertEquals(nuberOfRows.size(),4);
        List<WebElement> allData=driver.findElements(By.xpath("//table[@class='table table-striped']/tbody/tr/td"));

        boolean dataStatus=false;
        for(WebElement e:allData)
        {
            String value=e.getText();
            System.out.println(value);
            if(value.equalsIgnoreCase("Firefox"))
            {
                System.out.println("Requested record found");
                dataStatus=true;
                break;
            }
           // Assert.assertTrue(dataStatus,"Record not found");
        }

        String load=driver.findElement(By.xpath("//table[@class='table table-striped']/tbody/tr/td[contains(text(),'Chrome')]/following-sibling::td[contains(text(),'%')]")).getText();
        System.out.println("load"+load);
        String compare=driver.findElement(By.xpath("//p[@id='chrome-cpu']")).getText();
        System.out.println("value 2 : "+compare);
        /*String [] arr=compare.split(" ");
        Assert.assertEquals(load,arr[arr.length-1],"Value not matched");
        driver.quit();*/
    }
}
