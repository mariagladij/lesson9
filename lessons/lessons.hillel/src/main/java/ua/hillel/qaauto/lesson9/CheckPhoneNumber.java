package ua.hillel.qaauto.lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "\\+38\\(0[0-9]{2}\\)[0-9]{7}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);

        boolean isValid = matcher.matches();

        if (isValid) {
            System.out.println(phoneNumber + " is a valid phone number.");
        } else {
            System.out.println(phoneNumber + " is not a valid phone number.");
        }

        return isValid;
    }
}
