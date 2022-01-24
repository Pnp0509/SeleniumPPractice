package automation.testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnPractice {

    @Test
    public void test1(){
        System.out.println("I am from test case 1");
    }

    @Test(dependsOnMethods = "test1")
    public void test4(){
        System.out.println("I am from test case 4 and I will run only if test1 pass");
    }

    @Test
    public void test2(){
        System.out.println("I am from test case 2 and I will fail");
        Assert.fail("I am failing myself intentionally");
//        Assert.assertTrue(true);
        System.out.println("I cannot run if above Assertion fail");
    }

    @Test(dependsOnMethods = "test2")
    public void test3(){
        System.out.println("I am from test case 3 and I will run only if test2 pass");
    }

    @Test//(dependsOnMethods = "notest")
    public void test(){
        System.out.println("I am here to show error in depends on method as 'notest' method does not exist");
    }
}