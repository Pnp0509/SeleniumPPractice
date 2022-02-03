package automation.testNGPractice;

import org.testng.annotations.Test;

public class ParallelTest {
    @Test
    public void test1(){
        System.out.println("I am from method test1, I belongs to ParallelTest Class and my thread id is : " + Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.println("I am from method test2, I belongs to ParallelTest and my thread id is : " + Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.println("I am from method test3, I belongs to ParallelTest and my thread id is : " + Thread.currentThread().getId());
    }

    @Test
    public void test4(){
        System.out.println("I am from method test4, I belongs to ParallelTest and my thread id is : " + Thread.currentThread().getId());
    }

    @Test
    public void test5(){
        System.out.println("I am from method test5, I belongs to ParallelTest and my thread id is : " + Thread.currentThread().getId());
    }
}
