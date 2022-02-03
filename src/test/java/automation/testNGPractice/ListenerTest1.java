package automation.testNGPractice;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = {ListenerITestListener.class,ListenerISuiteListener.class,ListenerIInvokedMethodListener.class})
//@Listeners(value = ListenerITestListener.class)
//@Listeners(value = ListenerISuiteListener.class)
//@Listeners(value = ListenerIInvokedMethodListener.class)
//@Listeners(value = ListenerRetry.class)  //This wont work
//@Listeners(value = ListenerAnnotationTransformer.class)  //This wont work
public class ListenerTest1 {
    @BeforeClass
    public void beforeClass(){
        System.out.println("I am from before class annotation");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am from after class annotation");
    }

    @Test
    public void testMethod1(){
        System.out.println("I am testMethod1 From ListnerTest1.");
    }

    @Test
    public void testMethodPass(){
        System.out.println("I am testMethodPass From ListnerTest1.");
        Assert.assertTrue(true,"I will never fail testMethodPass From ListnerTest1 ");
    }

    @Test()
    public void testMethodFail1(){
        System.out.println("I am testMethodFail1 From ListnerTest1.");
        Assert.fail("I am failing testMethodFail From ListnerTest1 ");
    }

    @Test(dependsOnMethods = "testMethodFail1")
    public void dependsOnTest(){
        System.out.println("I am dependsOnTest From ListnerTest1. I am depends on testMethodFail1");
    }

//    @Test(retryAnalyzer = ListenerRetry.class)
    public void testMethodFail2(){
        System.out.println("I am testMethodFail From ListnerTest1.");
        Assert.fail("I am failing testMethodFail From ListnerTest1 ");
    }
}
