import entities.Student;
import entities.StudentManager;

import java.util.*;



public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();
        StudentManager manager = new StudentManager();

        manager.studentsRegister(students, sc);
        manager.Register(students);
        manager.searchStudents(students, sc);
        manager.modifyStudents(students, sc);
        manager.removeStudent(students, sc);
        manager.Register(students);

        sc.close();

    }


}