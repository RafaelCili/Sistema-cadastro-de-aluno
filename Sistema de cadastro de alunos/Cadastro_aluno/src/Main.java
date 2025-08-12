import entities.StudentManager;

import java.util.*;



public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        manager.studentsRegister();
        manager.Register();
        manager.searchStudents();
        manager.modifyStudents();
        manager.removeStudent();
        manager.Register();

        sc.close();

    }


}