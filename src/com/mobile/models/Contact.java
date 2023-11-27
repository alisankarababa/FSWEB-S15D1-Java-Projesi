package com.mobile.models;

import java.util.Objects;

public class Contact {

    private String name;
    private String phoneNumber;

    private Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {

        if(null == name || null == phoneNumber)
            return null;

        return new Contact(name, phoneNumber);
    }

    @Override
    public String toString() {
        return name + " -> " + phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

}
