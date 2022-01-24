package automation.testNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPractice {

    //@Test
    public void hardAssertFail(){
        System.out.println("I am from method Hard Assert fail but before Assert Fail");
        Assert.assertTrue(false,"I will fail if you provide false");
        System.out.println("I am from method Hard Assert fail but after Assert Fail");
    }

    //@Test
    public void hardAssertPass(){
        System.out.println("I am from method Hard Assert Pass but before Assert Pass");
        Assert.assertTrue(true,"I will fail if you provide false");
        System.out.println("I am from method Hard Assert Pass but after Assert Pass");
    }

    @Test
    public void softAssertFail(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("I am from method Soft Assert Fail but before Assert Fail");
        softAssert.assertTrue(false,"I will fail if you provide false");
        softAssert.assertTrue(true);
        System.out.println("I am from method Soft Assert Fail but after Assert Fail");
        softAssert.assertAll();
        System.out.println("I am from method Soft Assert Fail but after softAssert.assertAll()");
    }

    @Test
    public void softAssertPass(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("I am from method Soft Assert Pass but before Assert Pass");
        softAssert.assertTrue(true,"I will fail if you provide false");
        softAssert.assertTrue(true);
        System.out.println("I am from method Soft Assert Pass but after Assert Pass");
        softAssert.assertAll();
        System.out.println("I am from method Soft Assert Pass but after softAssert.assertAll()");
    }

    //@Test
    public void noAssertAll(){
        SoftAssert softAssert = new SoftAssert();
        System.out.println("I am from method noAssertALl but before any assert statement");
        softAssert.assertTrue(false,"I will fail if you provide false");
        softAssert.assertTrue(true,"I will fail if you provide false");
        softAssert.fail("I am failing due to softAssert.fail");
        softAssert.assertAll();
        System.out.println("I am from method noAssertALl but after all assert statement. " +
                "\nSome assertion are failing still I will execute if you don't use softAssert.assertAll() " +
                "\nSo Test will be marked as Pass even if assertions are failing.");
    }


    //@Test
    public void hardAssertFail2(){
        String expectedResult = "prashant";
        String actualResult = "PRashant";  //this should come from UI
        System.out.println("I am from method Hard Assert fail but before Assert Fail");
        Assert.assertTrue(expectedResult.equalsIgnoreCase(actualResult),"I will fail if you provide false");
        System.out.println("I am from method Hard Assert fail but after Assert Fail");
    }


    //@Test
    public void softAssertFail2(){
        SoftAssert softAssert = new SoftAssert();
        String expectedResult = "prashant";
        String actualResult = "PRashant";  //this should come from UI
        System.out.println("I am from method Hard Assert fail but before Assert Fail");
        softAssert.assertTrue(expectedResult.equalsIgnoreCase(actualResult),"Casing is ignored");
        softAssert.assertTrue(expectedResult.equals(actualResult),"Case does not matched");
        softAssert.assertAll();
        System.out.println("I am from method Hard Assert fail but after Assert Fail");
    }
}