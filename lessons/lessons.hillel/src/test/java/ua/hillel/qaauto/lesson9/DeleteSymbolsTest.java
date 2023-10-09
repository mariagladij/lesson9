package ua.hillel.qaauto.lesson9;

import org.testng.annotations.Test;

public class DeleteSymbolsTest {
    @Test
    public void testRemoveCharacters() {
        String initialString = "abcd4efabc123deabcdaaa";
        System.out.println("Original string is: " + initialString);
        String charactersToRemove = "ad3";
        String modifiedString = DeleteSymbols.removeCharacters(initialString, charactersToRemove);
        System.out.println("The new string is: " + modifiedString);
    }
}