package org.example;

import java.util.*;

public class PhoneBook {
    private NavigableMap<String, String> contacts = new TreeMap<>();
    public int add (String name, String number) {
        contacts.put(name, number);
        return contacts.size();
    }

    public String findByNumber(String number) {
        if(contacts.containsValue(number)) {
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                if(number.equals(entry.getValue())) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }

    public String findByName (String name) {
        if(contacts.containsKey(name)) {
            return contacts.get(name);
        }
        return null;
    }

    public NavigableSet<String> printAllNames () {
        NavigableSet<String> names = new TreeSet<>(contacts.navigableKeySet());
        System.out.println(names);
        return names;
    }
}
