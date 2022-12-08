package class03;

import org.testng.annotations.*;

public class Annotations {

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am before class");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("I am Before Method");
    }

    @Test
    public void AFirstTest(){
        System.out.println("I am A 1 Test");
    }

    @Test
    public void BSecondest(){
        System.out.println("I am B 2 Test");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("I am After Method");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("I am after class");
    }
}
