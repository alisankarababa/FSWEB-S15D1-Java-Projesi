package com.mobile.main;

import com.mobile.models.Contact;
import com.mobile.models.MobilePhone;

public class Main {

    public static void main(String[] args) {
        MobilePhone mp = new MobilePhone("123456");
        mp.addNewContact(Contact.createContact("ali", "0123123"));
        mp.addNewContact(Contact.createContact("veli", "234234"));
        mp.addNewContact(Contact.createContact("ahmet", "999999"));
        mp.addNewContact(Contact.createContact("veysel", "1312312312"));

        System.out.println(mp.addNewContact(Contact.createContact("veysel", "1312312312")));

        mp.printContact();

        System.out.println(mp.removeContact(mp.queryContact("0123123")));
        mp.printContact();
        System.out.println(mp.addNewContact(Contact.createContact("ahmet", "999999")));
        mp.printContact();

        System.out.println(mp.updateContact(mp.queryContact("999999"), Contact.createContact("ahmet", "199999")));
        mp.printContact();



    }
}
