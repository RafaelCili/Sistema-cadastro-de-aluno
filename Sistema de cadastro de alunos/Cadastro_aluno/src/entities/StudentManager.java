package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class StudentManager {

    private final Scanner sc =  new Scanner(System.in);
    private final List<Student> students = new ArrayList<>();

    public void studentsRegister() {
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

        }

    }

    public void Register() {
        int i = 0;
        for (Student s : students) {
            i++;
            System.out.printf("The %d° student\n", i);
            System.out.println(s.toString());

        }
    }

    public void searchStudents() {
        Student student;
        System.out.println("You want to search a student by their ID (y/n)? ");
        char choice = sc.next().toLowerCase().charAt(0);

        if (choice == 'y') {

            while (true) {
                System.out.println("Enter the student ID: ");
                int ID = sc.nextInt();

                Optional<Student> result = students.stream().filter(x -> x.getID() == ID).findFirst();

                if (result.isPresent()) {
                    student = result.get();
                    System.out.println("Name: " + student.getName());
                    System.out.println("Final note: " + student.getFinalNote());
                    break;
                } else {
                    System.out.println("ID not found. Try again.");
                }
            }

        }


    }

    public void modifyStudents() {
        Student student;
        System.out.println("You wish modify the final note of an student?(y/n)");
        char choice = sc.next().toLowerCase().charAt(0);

        if (choice == 'y') {

            while (true) {
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
                    break;
                } else {
                    System.out.println("ID not found. Try again.");
                }

            }

        }


    }

    public void removeStudent() {
        System.out.println("You want to remove a student from the list?(y/n)");
        char choice = sc.next().toLowerCase().charAt(0);

        if(choice == 'y') {

            while (true) {
                System.out.println("Enter the student ID: ");
                int ID = sc.nextInt();

                Optional<Student> toRemove = students.stream().filter(x -> x.getID() == ID).findFirst();

                if(toRemove.isPresent()) {
                    System.out.println("The student who was removed is: " + toRemove.get().getName());
                    students.remove(toRemove.get());
                    break;
                } else {
                    System.out.println("ID not found. Try again.");
                }
            }
        }



    }
}
