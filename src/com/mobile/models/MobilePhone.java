package com.mobile.models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MobilePhone {

    final private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {

        if(null == newContact || null == newContact.getName() || null == newContact.getPhoneNumber())
            return false;

        if(myContacts.contains(newContact))
            return false;

        myContacts.add(newContact);
        return true;
    }

    public int findContact(Contact contact) {

        return myContacts.indexOf(contact);
    }

    public int findContact(String contactNumber) {

        if(null == contactNumber)
            return -1;

        for(int i = 0; i < myContacts.size(); ++i) {

            if( myContacts.get(i).getPhoneNumber().equals(contactNumber))
                return i;
        }

        return -1;
    }

    public Contact queryContact(String contactNumber) {

        final int idxContact = findContact(contactNumber);

        if(-1 != idxContact)
            return myContacts.get(idxContact);

        return null;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        if(null == oldContact || null == newContact)
            return false;

        final int idxOldContact = findContact(oldContact);

        if(-1 == idxOldContact)
            return false;

        myContacts.set(idxOldContact, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {

        return myContacts.remove(contact);
    }

    public void printContact() {
        for (Contact myContact : myContacts)
            System.out.println(myContact);
    }
}
