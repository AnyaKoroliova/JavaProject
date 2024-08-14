package org.example.Person;

public class Man extends Person {
    public static final String GENDER = "чоловік";

    public Man(String name, int age, PersonRole role) {
        super(name, age, role);
    }

    public void displayPersonInfo() {
        System.out.println("Ім'я: " + getName() + "," + " Вік: " + getAge() + ","
                + " Стать: " + GENDER + "," + " Роль: " + getRole());
    }
}
