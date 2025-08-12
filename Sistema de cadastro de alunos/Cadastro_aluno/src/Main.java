import entities.Student;
import java.util.*;



public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        studentsRegister(students, sc);
        searchStudents(students, sc);
        modifyStudents(students, sc);
        removeStudent(students, sc);
        sc.close();
    }

    public static void studentsRegister(List<Student> students, Scanner sc) {
        System.out.println("Enter how many students will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the %d° student ID: ", i + 1);
            int ID = sc.nextInt();


            System.out.printf("Enter the %d° student name: ", i + 1);
            sc.nextLine();
            String name = sc.nextLine();

            System.out.printf("Enter the %d° student final note: ", i + 1);
            double finalNote = sc.nextDouble();

            students.add(new Student(name, ID, finalNote));

            for (Student s : students) {
                System.out.println(s.getName());
                System.out.println(s.getID());
                System.out.println(s.getFinalNote());
                System.out.println(s.status());
            }
        }

    }

    public static void searchStudents(List<Student> students, Scanner sc) {
        Student student = null;
        System.out.println("You want to search a student by their ID (y/n)? ");
        char choice = sc.next().toLowerCase().charAt(0);

        if (choice == 'y') {

            while (student == null) {
                System.out.println("Enter the student ID: ");
                int ID = sc.nextInt();

                Optional<Student> result = students.stream().filter(x -> x.getID() == ID).findFirst();

                if (result.isPresent()) {
                    student = result.get();
                    System.out.println("Name: " + student.getName());
                    System.out.println("Final note: " + student.getFinalNote());
                } else {
                    System.out.println("ID not found. Try again.");
                }
            }

        }


    }

    public static void modifyStudents(List<Student> students, Scanner sc) {
        Student student = null;
        System.out.println("You wish modify the final note of an student?(y/n)");
        char choice = sc.next().toLowerCase().charAt(0);

        if (choice == 'y') {
            while (student == null) {
                System.out.println("Enter the student ID: ");
                int ID = sc.nextInt();

                Optional<Student> result = students.stream().filter(x -> x.getID() == ID).findFirst();

                if (result.isPresent()) {
                    student = result.get();
                    System.out.println("The student is: " + student.getName());
                    System.out.println("The final note is " + student.getFinalNote());

                    System.out.println("Enter the new final note: ");
                    student.setFinalNote(sc.nextDouble());

                    System.out.println("The new final note is " + student.getFinalNote());
                } else {
                    System.out.println("ID not found. Try again.");
                }

            }

        }


    }

    public static void removeStudent(List<Student> students, Scanner sc) {
        //Student student = null;
        System.out.println("You want to remove a student from the list?(y/n)");
        char choice = sc.next().toLowerCase().charAt(0);
        int ID = 0;
        if (choice == 'y') {
            System.out.println("Enter the student ID: ");
            int finalID = sc.nextInt();
            students.removeIf(x -> x.getID() == finalID);
            System.out.println("The student who was removed is " + students.get(finalID).getName());
        }

        //esta com erro aqui


    }
}