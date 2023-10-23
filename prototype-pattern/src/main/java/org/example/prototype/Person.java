package org.example.prototype;

import java.util.ArrayList;
import java.util.List;

public class Person implements Prototype<Person>{
    private String name;
    private List<String> phoneNumbers;

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public Person(String name, List<String> phoneNumbers) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }

    public Person(Person person) {
        this.name = person.name;
        this.phoneNumbers = new ArrayList<>(person.phoneNumbers);
    }

    @Override
    public Person clone() {
        return new Person(this);
    }
}
