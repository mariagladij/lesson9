package ua.hillel.qaauto.lesson10;

public class MessageGenerator {

    public static String infoMessage(String message, Object... args) {
        return String.format("INFO: " + message, args);
    }

    public static String errorMessage(String message, int errorCode) {
        return String.format("ERROR %d: %s", errorCode, message);
    }

    public static void main(String[] args) {
        String info = MessageGenerator.infoMessage("Оновлення додатку", "Версія 1.0");
        System.out.println(info);

        String error = MessageGenerator.errorMessage("Сторінка не знайдена", 404);
        System.out.println(error);
    }
}
