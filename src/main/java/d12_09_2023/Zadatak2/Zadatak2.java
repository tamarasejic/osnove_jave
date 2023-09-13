package d12_09_2023.Zadatak2;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {

//        2. Zadatak
//        Kreirati klasu ZeleniKarton koja ima:
//        ime i prezime studenta
//        broj indeksa
//        naziv predmeta
//        ime i prezime profesora
//        ocenu - od 5 do 10
//        gettere i settere
//        konstruktore
//        metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//        metodu stampaj koja stampa podatke u formatu:
//        (naziv predmeta) - (ocena)
//        Student: ime i prezime, broj indeksa
//        Profesor: ime i prezime
//
//        U glavnoj klasi:
//        kreirati niz od 5 zelenih kartona za ispite i odstampati podatke za sve ispite
//        Zatim program pronalazi i ispisuje prosecnu ocenu za sve ispite
//        (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo za polozene ispite

        ArrayList<ExamGreenCard> exams = new ArrayList<>();
        ExamGreenCard exam1 = new ExamGreenCard("Petar Petrovic", "RA1234", "Biology", 8);
        exam1.setProfessorFullName("Milica Milic");
        ExamGreenCard exam2 = new ExamGreenCard("Petar Petrovic", "RA1234", "Anatomy I", 6,"Goran Goranovic");
        ExamGreenCard exam3 = new ExamGreenCard("Petar Petrovic", "RA1234", "Anatomy II", 9,"Marko Markovic");
        ExamGreenCard exam4 = new ExamGreenCard("Petar Petrovic", "RA1234", "Biology II", 7,"Goran Goranovic");
        ExamGreenCard exam5 = new ExamGreenCard("Petar Petrovic", "RA1234", "Psychology", 10);
        exam5.setProfessorFullName("Aleksandar Ristic");

        exams.add(exam1);
        exams.add(exam2);
        exams.add(exam3);
        exams.add(exam4);
        exams.add(exam5);

        printAllGreenCards(exams);

        System.out.println("Average grade: " + calculateAvgAll(exams));


//        za vezbanje - npr. samo polozeni ispiti imaju zeleni karton + prosecna ocena polozenih ispita:

        System.out.println("-------------------------- Only passed exams ---------------------->>>");

        exam3.setGrade(5);
        exam5.setGrade(5);

        printPassedGreenCards(exams);

        System.out.println("Average grade of passed exams: " + calculateAvgPassed(exams));
    }


    public static void printAllGreenCards(ArrayList<ExamGreenCard> exams) {
        for (int i = 0; i < exams.size(); i++) {
            System.out.println("*********** Exam Green Card ***********");
            exams.get(i).printInfo();
            System.out.println();
        }
    }

    public static void printPassedGreenCards(ArrayList<ExamGreenCard> exams) {
        for (int i = 0; i < exams.size(); i++) {
            if (exams.get(i).havePassed()) {
                System.out.println("*********** Exam Green Card ***********");
                exams.get(i).printInfo();
                System.out.println();
            }
        }
    }

    public static double calculateAvgAll(ArrayList<ExamGreenCard> exams) {
        int sum = 0;
        for (int i = 0; i < exams.size(); i++) {
            sum += exams.get(i).getGrade();
        }
        return sum * 1.0 / exams.size();
    }

    public static double calculateAvgPassed(ArrayList<ExamGreenCard> exams) {
        int sumPassed = 0;
        int counterPassed = 0;

        for (int i = 0; i < exams.size(); i++) {
            if (exams.get(i).havePassed()) {
                sumPassed += exams.get(i).getGrade();
                counterPassed++;
            }
        }
        return sumPassed * 1.0 / counterPassed;
    }

}
