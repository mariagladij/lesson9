package ua.hillel.qaauto.lesson12;

import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        Set<String> set2 = new HashSet<>();
        set2.add("banana");
        set2.add("grape");
        set2.add("watermelon");

        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        System.out.println("First HashSet: " + set1);
        System.out.println("Second HashSet: " + set2);
        System.out.println("United HashSet: " + unionSet);
    }
}
