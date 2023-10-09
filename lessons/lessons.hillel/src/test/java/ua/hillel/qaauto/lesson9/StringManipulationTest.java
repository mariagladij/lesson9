package ua.hillel.qaauto.lesson9;

import org.testng.annotations.Test;

public class StringManipulationTest {

    @Test

    public void testRemoveSubstring() {
        String mainString = "This is the test string";
        System.out.println("The main string is: " + mainString);
        String removableString = "st";
        String result = StringManipulation.removeSubstring(mainString, removableString);
        System.out.println("The new string is: " + result);
    }
}

