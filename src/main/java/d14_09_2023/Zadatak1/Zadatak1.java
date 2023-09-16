package d14_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

//    1. Zadatak
//    Napisati klasu Student koja ima
//    broj indeksa
//    ime i prezime
//    tip studija (osnovne, master, doktorske)
//    niz ispita
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za indeks, ime i prezime, tip studija
//    getter za niz predmeta
//    metodu dodaj ispit u niz ispita
//    metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    metodu stampaj koja stampa u formatu:
//    (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//    (naziv predmeta) - (profesor) - (ocena)
//    (naziv predmeta) - (profesor) - (ocena)
//    (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)
//
//    Napisati klasu Ispit koja ima
//    naziv predmeta
//    ocenu (u rasponu od 5 do 10)
//    Ime i prezime profesora koji predaje predmet
//    konstuktore koje mislite da ce vam trebati
//    gettere i settere za sve atribute
//    metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    metodu koja stampa ispit u formatu:
//    (naziv predmeta) - (profesor) - (ocena)

        Exam exam1 = new Exam("Biology", 9, "Marko Markovic");
        Exam exam2 = new Exam("Anatomy I", 7, "Petar Petrovic");
        Exam exam3 = new Exam("Psychology", 10, "Jovana Jovanovic");
        Exam exam4 = new Exam("Chemistry", 5, "Stefan Stefanovic");
        Exam exam5 = new Exam("Anatomy II", 5, "Petar Petrovic");

        Student student1 = new Student("RA1234", "Nikola Nikolic", "Master studies");

        student1.addExam(exam1);
        student1.addExam(exam2);
        student1.addExam(exam3);
        student1.addExam(exam4);
        student1.addExam(exam5);

        student1.printInfo();
    }
}
