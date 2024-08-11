package org.java.springsecurity.MobilePhone;

import org.java.springsecurity.MobilePhone.Contact;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists.  Update was not successful.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {

        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {

        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {

        System.out.println("Contact List:");
//        for (int i = 0; i < this.myContacts.size(); i++) {
//            System.out.println((i + 1) + ". " +
//                    this.myContacts.get(i).getName() + " -> " +
//                    this.myContacts.get(i).getPhoneNumber());
//        }
        for (Contact element: myContacts) {
            System.out.println(" contact " + element.getName() +    " -> " + element.getPhoneNumber());
        }
    }

    public static void main(String[] args) {
        MobilePhone myPhone = new MobilePhone("123-456-7890");

        Contact john = new Contact("John Doe", "123-456-7891");
        Contact jane = new Contact("Jane Doe", "987-654-3210");

        myPhone.addNewContact(john);
        myPhone.addNewContact(jane);
//        myPhone.addNewContact(john);
        myPhone.printContacts();

        Contact updatedContact = new Contact("Jane Doe", "098-765-4321");
        myPhone.updateContact(jane, updatedContact);

        myPhone.printContacts();

        Contact removedContact = myPhone.queryContact("John Doe");
        myPhone.removeContact(removedContact);

        myPhone.printContacts();
    }
}