package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, String> contacts = new HashMap<>();
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
        return null;
    }
}
