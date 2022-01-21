package automation.testNGPractice;

import org.testng.annotations.*;

public class Annotations {

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite(){
        System.out.println("I am in Before Suite");
    }

    @BeforeTest(alwaysRun = true)
    public void beforeTest(){
        System.out.println("I am in Before Test");
    }

    @BeforeClass(alwaysRun = true)
    public void beforeClass(){
        System.out.println("I am in Before Class");
    }

    @BeforeGroups(groups = "testGroups",alwaysRun = true)
    public void beforeGroup(){
        System.out.println("I am in Before Group testGroups");
    }

    @BeforeMethod(alwaysRun = true)
    public void beforeMethod(){
        System.out.println("I am in Before Method");
    }


    @Test(groups = "testGroups")
    public void testcase1(){
        System.out.println("In test case 1");
    }

    @Test(groups = "testGroups")
    public void testcase2(){
        System.out.println("In test case 2");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        System.out.println("I am in After Method");
    }

    @AfterGroups(groups = "testGroups",alwaysRun = true)
    public void afterGroups(){
        System.out.println("I am in After Group testGroups");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass(){
        System.out.println("I am in After Class");
    }

    @AfterTest(alwaysRun = true)
    public void afterTest(){
        System.out.println("I am in After Test");
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        System.out.println("I am in After Suite");
    }

}