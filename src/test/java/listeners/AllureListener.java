package listeners;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AllureListener implements ITestListener {
    
    @Override
    public void onTestFailure(ITestResult result) {
        takeScreenshot(result.getTestContext().getAttribute("driver").toString());
    }
    
    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] takeScreenshot(String driver) {
        // Screenshot will be taken automatically by Allure aspectj
        return new byte[0];
    }
}

