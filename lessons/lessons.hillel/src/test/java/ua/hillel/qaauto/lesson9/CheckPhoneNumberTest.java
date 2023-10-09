package ua.hillel.qaauto.lesson9;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class CheckPhoneNumberTest {
    @Test
    public void testValidPhoneNumber() {
        assertTrue(CheckPhoneNumber.isValidPhoneNumber("+38(099)1234567"));
        assertTrue(CheckPhoneNumber.isValidPhoneNumber("+38(012)3456789"));
    }

    @Test
    public void testInvalidPhoneNumber() {
        assertFalse(CheckPhoneNumber.isValidPhoneNumber("+38(abc)defghij"));
        assertFalse(CheckPhoneNumber.isValidPhoneNumber("+380991234567"));
        assertFalse(CheckPhoneNumber.isValidPhoneNumber("+38(123)456789"));
        assertFalse(CheckPhoneNumber.isValidPhoneNumber("+38(099)12345678"));
    }

}
