package ua.hillel.qaauto.lesson9;

public class ReverseString {
    public static String reverse(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        } else {
            return reverse(input.substring(1)) + input.charAt(0);
        }
    }

}