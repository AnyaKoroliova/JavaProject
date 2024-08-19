package org.example.Person;

public class Man extends Person {
    public static final String GENDER = "чоловік";

    public Man(String name, int age, PersonRole role) throws InvalidPersonDataException {
        super(name, age, role);
    }

    @Override
    public String getGender(){
        return GENDER;
    }

    @Override
    public void displayPersonInfo() {
        System.out.println("Ім'я: " + getName() + "," + " Вік: " + getAge() + ","
                + " Стать: " + getGender() + "," + " Роль: " + getRole());
    }
}
