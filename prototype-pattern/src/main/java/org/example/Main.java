package org.example;

import org.example.prototype.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("0761298123");

        var originalPerson = new Person("William", phoneNumbers);

        var newPerson = originalPerson.clone();
        var newPersonNumbers = newPerson.getPhoneNumbers();
        newPersonNumbers.add("0823334412");

        System.out.println(originalPerson);
        System.out.println(newPerson);
    }
}