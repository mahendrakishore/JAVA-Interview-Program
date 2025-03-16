package JavaProgram;

import java.util.ArrayList;
import java.util.List;

public class StudentSort {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(103, "John", "New York"));
        students.add(new Student(101, "Alice", "London"));
        students.add(new Student(105, "David", "Sydney"));
        students.add(new Student(102, "Emma", "Toronto"));
        students.add(new Student(104, "Chris", "California"));

        students.sort((s1,s2)->Integer.compare(s1.rollNo,s2.rollNo));
        students.stream().forEach(student -> {System.out.print(student.rollNo);
            System.out.print(":");
            System.out.print(student.name);
            System.out.print(":");
            System.out.print(student.address);
            System.out.println();

        });
    }



}
