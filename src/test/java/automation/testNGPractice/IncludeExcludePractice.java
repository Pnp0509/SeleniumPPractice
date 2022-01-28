package automation.testNGPractice;

import org.testng.annotations.Test;

public class IncludeExcludePractice {

    @Test(groups = "Group1")
    public void test1(){
        System.out.println("I am from method test1 and I belongs to Group1");
    }

    @Test(groups = {"Group1","Group2"})
    public void test2(){
        System.out.println("I am from method test2 and I belongs to Group1 as well as Group2");
    }

    @Test(groups = "Group2")
    public void test3(){
        System.out.println("I am from method test3 and I belongs to Group2");
    }

    @Test(groups = "Group3")
    public void test4(){
        System.out.println("I am from method test4 and I belongs to Group3");
    }
}