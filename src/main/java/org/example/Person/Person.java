package org.example.Person;

public class Person implements Displayable{
    private String name;
    private int age;
    private PersonRole role;

    public Person(String name, int age, PersonRole role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public PersonRole getRole() {
        return role;
    }
    public void setRole(PersonRole role) {
        this.role = role;
    }

    public void displayPersonInfo() {
        System.out.println("Ім'я: " + name + "," + " Вік: " + age + "," + " Професія: " + getRole());
    }
}
