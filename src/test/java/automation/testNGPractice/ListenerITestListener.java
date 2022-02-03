package automation.testNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerITestListener implements ITestListener {

    @Override
    public void onStart(ITestContext context){
        System.out.println("This method invokes when the test class is instantiated and before executing any test method. " + context.getName());
    }

    @Override
    public void onFinish(ITestContext context){
        System.out.println("This method invokes when all the test methods have run, and calling of all of their configuration methods happens.");
    }

    @Override
    public void onTestStart(ITestResult result){
        System.out.println("This method invokes every time a test method is called and executed. " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result){
        System.out.println("This method is invoked every time a test case passes (succeeds).");
    }

    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("This method invokes every time a test case fails");
    }

    @Override
    public void onTestSkipped (ITestResult result){
        System.out.println("This method invokes every time a test skips");
    }
}
