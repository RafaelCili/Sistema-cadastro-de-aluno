import entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        System.out.println("Enter how many students will be created? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d° student ID: ", i+1);
            int ID = sc.nextInt();

            System.out.printf("Enter the %d° student name: ", i+1);
            sc.nextLine();
            String name = sc.nextLine();

            System.out.printf("Enter the %d° student final note: ", i+1);
            double finalNote = sc.nextDouble();

            students.add(new Student(name, ID, finalNote));
        }

        for(Student s : students) {
            System.out.println(s.getName());
            System.out.println(s.getID());
            System.out.println(s.getFinalNote());
            System.out.println(s.status());
            System.out.println("teste");
        }
    }

}