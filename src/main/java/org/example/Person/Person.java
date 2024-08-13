package org.example.Person;

public class Person {
    private String name;
    private int age;
    private String profession;

    public Person(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30, "Інженер");
        Person person2 = new Person("Mary", 25, "Вчитель");
        Person person3 = new Person("Bob", 35, "Лікар");

        person1.displayPersonInfo();
        person2.displayPersonInfo();
        person3.displayPersonInfo();

        person1.changeProfession("Дизайнер");
        System.out.println("Оновлена інформація про John:");
        person1.displayPersonInfo();
    }

    public void changeProfession(String newProfession) {
        this.profession = newProfession;
    }

    public void displayPersonInfo() {
        System.out.println("Ім'я: " + name + "," + " Вік: " + age + "," + " Професія: " + profession + ",");
    }
}
