package phonebook;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name, lastname, phone;
    private double average;

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

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public int compareTo(Student s) {
        if (this.average > s.average) {
            return 1;
        } else if (this.average < s.average) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone, average);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Double.compare(student.average, average) == 0 && name.equals(student.name) && lastname.equals(student.lastname) && phone.equals(student.phone);
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

