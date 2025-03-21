package org.example.mobile;
import java.util.List;
import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts = new ArrayList<>();

    public boolean addNewContact(Contact contact) {
        if (myContacts.contains(contact)) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (myContacts.contains(oldContact)) {
            int index = myContacts.indexOf(oldContact);
            myContacts.set(index, newContact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact) {
        System.out.println("IN HEREEE" + myContacts);
        System.out.println("IN HEREEE" + contact);

        if (myContacts.contains(contact)) {
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    public int findContact(String name) {
        for (Contact contact: myContacts) {
            if (contact.getName().equals(name)) {
                return myContacts.indexOf(contact);
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {
        for (Contact contact: myContacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void printContact() {
        for (Contact contact: myContacts) {
            System.out.println(myContacts.indexOf(contact) + 1 + ". " + contact.getName() + " " + contact.getPhoneNumber());
        }
    }

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public MobilePhone(String myNumber, List<Contact> myContacts) {
        this.myContacts = myContacts;
        this.myNumber = myNumber;
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContacts;
    }
}