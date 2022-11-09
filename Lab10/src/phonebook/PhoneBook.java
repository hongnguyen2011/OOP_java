package phonebook;

public interface PhoneBook {

    public void addPerson(Student p);

    public Student searchByName(String name);

    public Student searchByLastName(String lastname);

    public Student searchByNumber(String phone);

    public void deleteByNumber(String phone);
}
