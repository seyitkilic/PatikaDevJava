package Week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {

    private int id;
    private double cgpa;
    private String name;

    public Student(int id, String name, double cgpa) {
        /*
         * Constructor Methot
         */
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getters
    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }

    @Override
    public int compareTo(Student st) {
        /*
         * implement edilen Comparable Interface si sayesinde karsilastirma islemini
         * kendi urettigimiz compareTo metodu sayesinde yapabiliriz
         */
        double diff = st.cgpa - this.cgpa;
        if (diff == 0) {
            return this.name.compareTo(st.name);
        } else {
            return diff < 0 ? -1 : 1;
        }
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> pQueue = new PriorityQueue<>();

        List<Student> res = new ArrayList<>();

        String[] lines;
        String name;
        int id;
        double cgpa;

        for (String event : events) {
            lines = event.split(" ");
            // Girilen satirlari bosluklara gore ayiriyor ve ayri ayri olarak lines
            // isimli Arrayde tutuyor

            if (lines.length == 4) {
                // Eger Giris ifadesi "ENTER Mark 3.8 24" gibi olursa lines Array inin uzunlugu
                // 4 olmalidir
                name = lines[1]; // ENTER kismindan sonraki kisim isim degeri ...
                cgpa = Double.parseDouble(lines[2]);
                id = Integer.parseInt(lines[3]);
                pQueue.add(new Student(id, name, cgpa)); // elde edilen veriler ile yeni Student nesnesi olusturma
            } else {
                // Eger giris ifadesi SERVED olursa direk olarak PriorityQueue uzerinden poll
                // islemi yapmaliyiz
                pQueue.poll();
            }
        }

        while (!pQueue.isEmpty()) {
            res.add(pQueue.poll());
        }

        return res;
    }

}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }
    }
}