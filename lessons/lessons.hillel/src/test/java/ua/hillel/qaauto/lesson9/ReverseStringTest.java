package ua.hillel.qaauto.lesson9;

import org.testng.Assert;
import org.testng.annotations.*;

public class ReverseStringTest {

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
    public void testReverseString_Positive() {
        String original = "Java, World!";
        String expectedReversed = "!dlroW ,avaJ";
        String reversed = ReverseString.reverse(original);
        Assert.assertEquals(reversed, expectedReversed);
    }

    @Test(groups = "positiveTests")
    public void testReverseString_Positive_EmptyString() {
        String original = "";
        String expectedReversed = "";
        String reversed = ReverseString.reverse(original);
        Assert.assertEquals(reversed, expectedReversed);
    }

    @Test(groups = "negativeTests")
    public void testReverseString_Negative_NullString() {
        String original = null;
        // Assuming reverse(null) returns null
        String reversed = ReverseString.reverse(original);
        Assert.assertNull(reversed);
    }
}

