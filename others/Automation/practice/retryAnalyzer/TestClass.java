package seleniumPractice.retryAnalyzer;

import org.testng.annotations.Test;

public class TestClass {

    @Test(retryAnalyzer = MyRetryAnalyzer.class)
    public void TestCase1()
    {
        System.out.println("This is test method 1");
    }

    @Test(retryAnalyzer = MyRetryAnalyzer.class)
    public void TestCase2()
    {
        System.out.println("This is test method 2");
    }

}
