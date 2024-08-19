package org.example.Person;

public class Main {
    public static void main(String[] args) {
        try {
            Woman woman = new Woman("Mary", 25, PersonRole.TEACHER);
            woman.displayPersonInfo();

            Man man1 = new Man (" ", 30, PersonRole.ENGINEER);
            man1.displayPersonInfo();

        }
        catch (InvalidPersonDataException e) {
            System.out.println(e.getMessage());
        }
        try {
            Man man2 = new Man ("Bob", -35, PersonRole.DOCTOR);
            man2.displayPersonInfo();

        } catch (InvalidPersonDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
