package seleniumPractice.retryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {

    @Override
    public boolean retry(ITestResult iTestResult) {

        int count=0;
        int retryLimit=3;

        if(count<retryLimit)
        {
            count++;
            return true;
        }
        return false;
    }
}
