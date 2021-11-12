package at.campus02.murko.setdemo;

import java.util.HashSet;

public class StudentSetDemo {
    public static void main(String[] args) {
        //neues Set deklarieren
        HashSet<String> students = new HashSet<>();

        //Studentene (vor und nachname) hinzufügen
        students.add("Max Mustermann");
        String susi= "Susi Hal";
        students.add(susi);

        System.out.println("students =" + students);

        students.remove(susi);
        System.out.println("students =" + students);

        boolean contains = students.contains(susi);
        boolean max_muster = students.contains("Max Muster");
        System.out.println("students =" + students);
        System.out.println("contains = " + contains);
        System.out.println("max_muster = " + max_muster);

        students.add(susi);

        //iter
    for(String student: students)
    {
        System.out.println();
    }
    }
}
