package automation.testNGPractice;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ListenerISuiteListener implements ISuiteListener {

    public void onStart(ISuite suite){
        System.out.println("This method invokes before the test suite execution starts. "+ suite.getName());

    }

    public void onFinish(ISuite suite){
        System.out.println("This method invokes after the test suite execution ends.");
    }
}
