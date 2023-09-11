package p11_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

//    1. Zadatak
//    Kreirati klasu Student koja ima:
//    ime
//    prezime
//    broj indeksa (int)
//    da li je na budzetu
//    gettere i settere za sve atribute
//        (dopuna) Kreirati metodu za stampu koja stampa sve podatke studenta.

        Student p = new Student();
        p.setFirstName("Petar");
        p.setLastName("Petrovic");
        p.setIndexNo(1234);
        p.setIsOnBudget(true);

        p.printStudentInfo();

    }
}
