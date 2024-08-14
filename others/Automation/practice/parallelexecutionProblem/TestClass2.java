package seleniumPractice.paralleExecutionProblem;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class TestClass2 {

    @BeforeMethod
    public void setup()
    {
        DriverFactorySingleton.getInstance();
        System.out.println("Browser setup by Thread : "+Thread.currentThread().getId()+" Driver reference is : "+DriverFactorySingleton.getInstance().getDriver());
    }

    @Test
    public void amazonTest(Method m)
    {
        System.out.println(m.getName()+" of class "+m.getClass()+ " Executing by Thread "+Thread.currentThread().getId()+" with Driver reference"+ DriverFactorySingleton.getInstance().getDriver());
        DriverFactorySingleton.getInstance().getDriver().get("https://www.amazon.in/");
        DriverFactorySingleton.getInstance().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Title of page printed by Thread :"+Thread.currentThread().getId()+" - "+DriverFactorySingleton.getInstance().getDriver().getTitle());
        DriverFactorySingleton.getInstance().getDriver().manage().deleteAllCookies();
    }

    @Test
    public void myntraTest(Method m)
    {
        System.out.println(m.getName()+" of class "+m.getClass()+ " Executing by Thread "+Thread.currentThread().getId()+" with Driver reference"+ DriverFactorySingleton.getInstance().getDriver());
        DriverFactorySingleton.getInstance().getDriver().get("https://www.myntra.com/");
        DriverFactorySingleton.getInstance().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Title of page printed by Thread :"+Thread.currentThread().getId()+" - "+DriverFactorySingleton.getInstance().getDriver().getTitle());
        DriverFactorySingleton.getInstance().getDriver().manage().deleteAllCookies();
    }

    @AfterClass
    public void tearDown()
    {
        System.out.println("Browser closed by thread : "+Thread.currentThread().getId()+" and closing driver "+DriverFactorySingleton.getInstance().getDriver());
        DriverFactorySingleton.getInstance().closeDriver();
    }

}
