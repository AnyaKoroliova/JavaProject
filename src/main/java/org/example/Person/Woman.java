package org.example.Person;

public class Woman extends Person {
    public static final String GENDER = "жінка";

    public Woman(String name, int age, PersonRole role) throws InvalidPersonDataException {
        super(name, age, role);
    }

    @Override
    public String getGender(){
        return GENDER;
    }

    @Override
    public void displayPersonInfo() {
        System.out.println("Ім'я: " + getName() + "," + " Вік: " + getAge() + "," + " Стать: " + getGender() + "," + " Роль: " + getRole());
    }
}
