package entities;

public class Student {

    private String name;
    private int ID;
    private double finalNote;

    public Student() {
    }

    public Student(String name, int matriculation, double notaFinal) {
        this.name = name;
        this.ID = matriculation;
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
            throw new IllegalArgumentException("Enter a valid note! The note must be between 0 and 10");
        }
    }

    public void changeName(String newName) {
        setName(newName);
    }

    public String status() {
        if(this.finalNote >= 6 ) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }


}
