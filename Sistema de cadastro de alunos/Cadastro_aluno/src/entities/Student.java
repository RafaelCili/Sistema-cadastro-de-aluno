package entities;

public class Student {

    private String name;
    private int ID;
    private double finalNote;

    public Student(String name, int ID, double notaFinal) {
        this.name = name;
        this.ID = ID;
        this.finalNote = notaFinal;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(double finalNote) {
        if(finalNote >= 0 && finalNote <= 10) {
            this.finalNote = finalNote;
        } else {
            System.out.println("Enter a valid note! The note must be between 0 and 10");
        }
    }

    public String status() {
        if(this.finalNote >= 6 ) {
            return "Approved";
        } else {
            return "Reproved";
        }
    }

    public String toString() {
        return "Name: " + name + " , ID: " + ID + " , your final note is: " + finalNote + " and your status is: " + status();
    }


}
