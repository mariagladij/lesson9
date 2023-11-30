package ua.hillel.qaauto.lesson10;

import java.util.Objects;

// Базовий клас Employee
class Employee {
    private String name;
    private String address;
    private double salary;
    private String position;

    public Employee(String name, String address, double salary, String position) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public double calculateBonus() {
        // Розрахунок бонусу за замовчуванням
        return 0;
    }

    public String generatePerformanceReport() {
        return "Performance report for " + position + " " + name + " -> Good";
    }

    public String performTask(String language) {
        return position + " " + name + " is performing tasks.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 &&
                name.equals(employee.name) &&
                address.equals(employee.address) &&
                position.equals(employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, salary, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}

// Підклас Manager
class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.1; // Бонус для менеджера - 10% від зарплати
    }
}

// Підклас Developer
class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String address, double salary, String programmingLanguage) {
        super(name, address, salary, "Developer");
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15; // Бонус для розробника - 15% від зарплати
    }

    @Override
    public String performTask(String language) {
        return super.performTask(language) + " Programming Language: " + programmingLanguage;
    }
}

// Підклас QA
class QA extends Employee {
    public QA(String name, String address, double salary) {
        super(name, address, salary, "QA");
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.12; // Бонус для QA - 12% від зарплати
    }
}

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Oleksandr Fedic", "123 Main St", 15000);
        Employee developer = new Developer("Kate Ovchar", "456 Elm St", 8000, "Java");
        Employee qa = new QA("Marine Awful", "789 Oak St", 10000);

        System.out.println(manager.generatePerformanceReport());
        System.out.println(developer.generatePerformanceReport());
        System.out.println(qa.generatePerformanceReport());

        System.out.println(manager.performTask("Java"));
        System.out.println(developer.performTask("Java"));
        System.out.println(qa.performTask("Manual Testing"));

        System.out.println(manager);
        System.out.println(developer);
        System.out.println(qa);
    }
}

