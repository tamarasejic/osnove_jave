package d07_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

//    Zadatak 1: Kreiranje klase "Student"
//    Napišite klasu "Student" koja ima sledeće atribute: ime (String), brojIndeksa (int) i fakultet (String).
//    Kreirajte 2-3 objekta ove klase u glavnoj metodi i postavite im vrednosti. Ispisati informacije o studentima.

        Student student1 = new Student();
        student1.name = "Marko Markovic";
        student1.indexNo = 2001;
        student1.college = "GAF";

        Student student2 = new Student();
        student2.name = "Petar Petrovic";
        student2.indexNo = 362;
        student2.college = "Faculty of Electronic Engineering";

        Student student3 = new Student();
        student3.name = "Jovana Jovanovic";
        student3.indexNo = 789;
        student3.college = "Faculty of Medicine";

        System.out.println("Student " + student1.name + ", index number " + student1.indexNo + ", goes to " + student1.college + ".");
        System.out.println("Student " + student2.name + ", index number " + student2.indexNo + ", goes to " + student2.college + ".");
        System.out.println("Student " + student3.name + ", index number " + student3.indexNo + ", goes to " + student3.college + ".");
    }
}
