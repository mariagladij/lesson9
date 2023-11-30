package ua.hillel.qaauto.lesson12;

import java.util.HashMap;
import java.util.Map;

class Cow {
    private String name;

    public Cow(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Task3 {
    public static void main(String[] args) {
        Map<String, Cow> cowMap = new HashMap<>();

        for (int i = 1; i <= 10; i++) {
            String cowName = "Cow" + i;
            Cow cow = new Cow(cowName);
            cowMap.put(cowName, cow);
        }

        for (Map.Entry<String, Cow> entry : cowMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue().getName());
        }
    }
}

