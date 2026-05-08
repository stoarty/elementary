package pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan Ivanov");
        student.setEntryDate(LocalDate.of(2020, 9, 1));
        student.setGroup("CS-101");
        System.out.println("Student name: " + student.getName());
        System.out.println("Entry date: " + student.getEntryDate());
        System.out.println("Group: " + student.getGroup());
    }
}
