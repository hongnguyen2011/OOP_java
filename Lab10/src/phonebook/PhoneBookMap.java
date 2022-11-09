package phonebook;

import java.util.*;

public class PhoneBookMap implements PhoneBook {

    HashMap<String, Student> phoneBook;

    public PhoneBookMap() {
        phoneBook = new HashMap<>();
    }

    @Override
    public void addPerson(Student p) {
        phoneBook.put(p.getPhone(), p);
    }

    @Override
    public Student searchByName(String name) {
        for (Student student : phoneBook.values()) {
            if (student.getName().equals(name)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByLastName(String lastname) {
        for (Student student : phoneBook.values()) {
            if (student.getLastname().equals(lastname)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public Student searchByNumber(String phone) {
        for (Student student : phoneBook.values()) {
            if (student.getPhone().equals(phone)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public void deleteByNumber(String phone) {
        if (phoneBook.containsKey(phone)) {
            phoneBook.remove(phone);
        }
    }
}

