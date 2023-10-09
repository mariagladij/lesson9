package ua.hillel.qaauto.lesson9;

public class StringManipulation {
    public static String removeSubstring(String mainString, String removableString) {
        if (mainString == null || removableString == null) {
            return mainString;
        }

        return mainString.replace(removableString, "");
    }
}