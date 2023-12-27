package ua.hillel.qaauto.lesson9;

import org.testng.Assert;
import org.testng.annotations.*;

public class CheckPhoneNumberTest {

    @DataProvider(name = "validPhoneNumbers")
    public Object[][] validPhoneNumbers() {
        return new Object[][]{
                {"+38(099)1234567"},
                {"+38(067)9876543"},
        };
    }

    @DataProvider(name = "invalidPhoneNumbers")
    public Object[][] invalidPhoneNumbers() {
        return new Object[][]{
                {"+38(0123)4567890"},  // Invalid: incorrect length of the area code
                {"+38(0AB)1234567"},   // Invalid: non-numeric characters in the area code
                {"+38(099)12345"},     // Invalid: incorrect length of the phone number
        };
    }

    @Test(dataProvider = "validPhoneNumbers", groups = "positiveTests")
    public void testIsValidPhoneNumber_Valid(String phoneNumber) {
        Assert.assertTrue(CheckPhoneNumber.isValidPhoneNumber(phoneNumber));
    }

    @Test(dataProvider = "invalidPhoneNumbers", groups = "negativeTests")
    public void testIsValidPhoneNumber_Invalid(String phoneNumber) {
        Assert.assertFalse(CheckPhoneNumber.isValidPhoneNumber(phoneNumber));
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
}
