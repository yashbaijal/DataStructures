package seleniumPractice.paralleExecutionProblem;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class TestClass1 {

    @BeforeMethod
    public void setup()
    {
        DriverFactorySingleton.getInstance();
        System.out.println("Browser setup by Thread : "+Thread.currentThread().getId()+" Driver reference is : "+DriverFactorySingleton.getInstance().getDriver());
    }

    @Test
    public void googleTest(Method m)
    {
        System.out.println(m.getName()+" of class TestClass1 Executed  by Thread "+ Thread.currentThread().getId()+ " with Driver reference "+DriverFactorySingleton.getInstance().getDriver());
        DriverFactorySingleton.getInstance().getDriver().get("https://www.google.com/");
        DriverFactorySingleton.getInstance().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Title of page printed by Thread : "+Thread.currentThread().getId()+" -"+DriverFactorySingleton.getInstance().getDriver().getTitle()+ "on Browser reference : "+DriverFactorySingleton.getInstance().getDriver());
        DriverFactorySingleton.getInstance().getDriver().manage().deleteAllCookies();
    }

    @Test
    public void facebookTest(Method m)
    {
        System.out.println(m.getName()+" of class TestClass1 Executed  by Thread "+ Thread.currentThread().getId()+ " with Driver reference "+DriverFactorySingleton.getInstance().getDriver());
        DriverFactorySingleton.getInstance().getDriver().get("https://www.facebook.com/");
        DriverFactorySingleton.getInstance().getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Title of page printed by Thread : "+Thread.currentThread().getId()+" -"+DriverFactorySingleton.getInstance().getDriver().getTitle()+ "on Browser reference : "+DriverFactorySingleton.getInstance().getDriver());
        DriverFactorySingleton.getInstance().getDriver().manage().deleteAllCookies();
    }

    @AfterClass
    public void tearDown()
    {
        System.out.println("Browser closed by thread : "+Thread.currentThread().getId()+" and closing driver "+DriverFactorySingleton.getInstance().getDriver());
        DriverFactorySingleton.getInstance().closeDriver();
    }

}
