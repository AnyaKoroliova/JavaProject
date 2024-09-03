package org.example.Person;

abstract class Person implements Displayable{
    protected String name;
    protected int age;
    protected PersonRole role;

    public Person(String name, int age, PersonRole role) throws InvalidPersonDataException {
            if (name == null || name.trim().isEmpty()) {
                throw new InvalidPersonDataException("Name cannot be null or empty");
            }
            if (age < 0) {
                throw new InvalidPersonDataException("Age cannot be negative");
            }
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

    public abstract String getGender();

    @Override
    public abstract void displayPersonInfo();
}
