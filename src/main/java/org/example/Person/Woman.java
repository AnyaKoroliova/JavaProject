package org.example.Person;

public class Woman extends Person {
    public static final String GENDER = "жінка";

    public Woman(String name, int age, PersonRole role) {
        super(name, age, role);
    }

    public void displayPersonInfo() {
        System.out.println("Ім'я: " + getName() + "," + " Вік: " + getAge() + "," + " Стать: " + GENDER + "," + " Роль: " + getRole());
    }
}
