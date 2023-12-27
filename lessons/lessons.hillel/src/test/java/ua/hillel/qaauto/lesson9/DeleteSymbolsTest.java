package ua.hillel.qaauto.lesson9;

import org.testng.Assert;
import org.testng.annotations.*;

public class DeleteSymbolsTest {

    @DataProvider(name = "dataForPositiveTest")
    public Object[][] dataForPositiveTest() {
        return new Object[][]{
                {"abcd4efabc123deabcdaaa", "ad3", "bc4efbc12ebc"},
                {"hello123world", "123", "helloworld"},
        };
    }

    @DataProvider(name = "dataForNegativeTest")
    public Object[][] dataForNegativeTest() {
        return new Object[][]{
                {"abcd4efabc123deabcdaaa", "xyz", "abcd4efabc123deabcdaaa"},
                {"hello123world", "@#", "hello123world"},
        };
    }

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

    @Test(dataProvider = "dataForPositiveTest", groups = "positiveTests")
    public void testRemoveCharacters_Positive(String initialString, String charactersToRemove, String expectedString) {
        String modifiedString = DeleteSymbols.removeCharacters(initialString, charactersToRemove);
        Assert.assertEquals(modifiedString, expectedString);
    }

    @Test(dataProvider = "dataForNegativeTest", groups = "negativeTests")
    public void testRemoveCharacters_Negative(String initialString, String charactersToRemove, String expectedString) {
        String modifiedString = DeleteSymbols.removeCharacters(initialString, charactersToRemove);
        Assert.assertEquals(modifiedString, expectedString);
    }
}
