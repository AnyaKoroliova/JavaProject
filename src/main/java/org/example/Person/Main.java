package org.example.Person;

public class Main {
    public static void main(String[] args) {
        Woman woman = new Woman("Mary", 25, PersonRole.TEACHER);
        Man man1 = new Man ("John", 30, PersonRole.ENGINEER);
        Man man2 = new Man ("Bob", 35, PersonRole.DOCTOR);

        woman.displayPersonInfo();
        man1.displayPersonInfo();
        man2.displayPersonInfo();

        man1.setRole(PersonRole.ARTIST);
        System.out.println("Оновлена інформація про John:");
        man1.displayPersonInfo();
    }
}
