package ua.hillel.qaauto.lesson9;

public class DeleteSymbols {
    public static String removeCharacters(String input, String charactersToRemove) {
        if (input == null || charactersToRemove == null) {
            return input;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (charactersToRemove.indexOf(currentChar) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}