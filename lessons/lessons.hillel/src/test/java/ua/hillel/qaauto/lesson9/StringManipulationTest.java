package ua.hillel.qaauto.lesson9;

import org.testng.Assert;
import org.testng.annotations.*;

public class StringManipulationTest {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Executing before class setup...");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Executing after class teardown...");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Executing before each test method...");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Executing after each test method...");
    }

    @Test(groups = "positiveTests")
    public void testRemoveSubstring_Positive() {
        String mainString = "This is the test string";
        String removableString = "st";
        String expectedString = "This is the te ring";
        String result = StringManipulation.removeSubstring(mainString, removableString);
        Assert.assertEquals(result, expectedString);
    }

    @Test(groups = "positiveTests")
    public void testRemoveSubstring_Positive_EmptyRemovableString() {
        String mainString = "This is the test string";
        String removableString = "";
        String expectedString = "This is the test string";
        String result = StringManipulation.removeSubstring(mainString, removableString);
        Assert.assertEquals(result, expectedString);
    }

    @Test(groups = "negativeTests")
    public void testRemoveSubstring_Negative_NullMainString() {
        String mainString = null;
        String removableString = "st";
        String result = StringManipulation.removeSubstring(mainString, removableString);
        Assert.assertNull(result);
    }
}

