package com.kavinschool.testng.examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityWithDependencies {

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        System.out.println("PriorityWithDependencies.beforeClass");
    }

    @AfterClass(alwaysRun = true)
    public void afterClass() {
        System.out.println("PriorityWithDependencies.afterClass");
    }

    @Test(groups = {"PriorityWithDependencies","testApple"} )
    public void testApple() {
        System.out.println("PriorityWithDependencies.testApple");
    }

    @Test(groups = {"PriorityWithDependencies","testBanana"} )
    public void testBanana() {
        System.out.println("PriorityWithDependencies.testBanana");
    }

    @Test(groups = {"PriorityWithDependencies","testCherry"} )
    public void testCherry() {
        System.out.println("PriorityWithDependencies.testCherry");
    }

}
