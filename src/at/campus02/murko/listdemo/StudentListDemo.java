package at.campus02.murko.listdemo;

import java.util.ArrayList;
import java.util.List;

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Nachnahme");
        //   students.remove(0);

        students.contains("Nachnahme");

        for (int i = 0; i < students.size(); i++) {
            System.out.println("students[i] = " + students.get(i));
        }
        students.add("Murko");
        students.remove(1);
        printStudents(students);
    }

    public static void printStudents(ArrayList<String> studentList) {
        for (String s : studentList) {
            System.out.println("student = " + s);
        }
        System.out.println("-----");
    }

    public static boolean isInList(ArrayList<String> studentList, String string) {
        for (String s : studentList) {
            if (studentList.equals(s)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
