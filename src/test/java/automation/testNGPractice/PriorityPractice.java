package automation.testNGPractice;

import org.testng.annotations.Test;

public class PriorityPractice {

    @Test(priority = 3)
    public void aaa(){
        System.out.println("I am from method aaa with priority 3");
    }

    @Test(priority = 3)
    public void aab(){
        System.out.println("I am from method aab with priority 3");
    }

    @Test(priority = 3)
    public void AAA(){
        System.out.println("I am from method AAA with priority 3");
    }

//    @Test(priority = 3)
//    public void AAA(){
//        System.out.println("I am from method AAA with priority 3");
//    }

    @Test(priority = 1)
    public void one(){
        System.out.println("I am from method one with priority 1");
    }

    @Test(priority = 2)
    public void two(){
        System.out.println("I am from method two with priority 2");
    }

    @Test(priority = 0)
    public void zero(){
        System.out.println("I am from method zero with priority 0");
    }

    @Test
    public void noPriority(){
        System.out.println("I am from method noPriority with priority not mentioned");
    }

}