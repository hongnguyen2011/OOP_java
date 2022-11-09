package library;

import java.util.Objects;
import java.util.function.ObjLongConsumer;

public class Student implements Comparable<Student>{
    String name;
    String lastname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    String phone;
    double average;

    public Student(String name, String lastname, String phone) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
    }

    public Student(String name, String lastname, double average) {
        this.name = name;
        this.lastname = lastname;
        this.average = average;
    }

    public Student(String name, String lastname, String phone, double average) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.average = average;
    }

    public int compareTo(Student s){
        return this.getName().compareTo(s.getName());
    }

    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null || getClass() != o.getClass()) {
            return  false;
        }

        Student student = (Student) o;
        return Double.compare(student.average, average) == 0
                && Objects.equals(name , student.name)
                && Objects.equals(lastname, student.lastname)
                && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }

    @Override
    public String toString() {
        return String.format(
                "Student [name=%s, lastname=%s, phone=%s, average=%s]",
                this.name,
                this.lastname,
                this.phone,
                this.average);
    }
}
