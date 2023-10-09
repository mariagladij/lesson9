package ua.hillel.qaauto.lesson9;

import org.testng.annotations.Test;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        String original = "Java, World!";
        System.out.println("Original string is: " + original);
        String reversed = ReverseString.reverse(original);
        System.out.println("Reversed string is: " + reversed);
    }
}
