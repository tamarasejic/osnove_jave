package p19_09_2023.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//    Zadatak 2. Kreirati apstraktnu klasu Atleticar čiji su tributi:
//    ime i prezime privatni
//    i rezultat ostvaren na takmičenju koji je zasticen
//    Javne metode klase su:
//    apstratktna metoda koja ispituje da li je rezultat atletičara bolji od rezultata drugog atletičara (metoda za parametar prima atleticara, ne rezultat drugog atleticara!!)
//    metoda koja stampa podataka o atletičaru u formatu: (ime) (prezime), (rezultat)
//    Kreirati i klase Trkac i Skakac izvedene iz klase Atleticar. Kod trkača je bolji manji rezultat, a kod skakača veći.
//    Kreirati i klasu Disciplina čiji su privatni atributi:
//    ime discipline
//    tip discipline (Trkacka ili Skakacka)
//    niz atletičara koji učestvuju u toj disciplini.
//    U javnom delu klase definisati:
//    konstuktore, gettere i settere
//    konstruktor koji postavlja ime discipline i tip
//    metodu dodaj atleticara u disciplinu
//    metodu diskvalifikuj atleticara iz discipline, za parametar funkcije prima se ime i prezime atleticara
//    (za vezbanje) privatnu metodu koja pronalazi i vraca atletircara (ne ime i prezime) sa najboljim rezultatom
//    (za vezbanje) metoda koja prikazuje podatke o pobedniku discipline.
//    U funkciji main kreirati discipline „Skok u dalj“ i „110m s preponama“ sa proizvoljnim brojem učesnika,
//    (za vezbanje) na ekranu prikazati poruke o pobednicima obe discipline.

        Disciplina skokUDalj = new Disciplina("Skok u dalj", "skakac");
        Disciplina trkaSPreponama = new Disciplina("110m s preponama", "trkac");

        Trkac trkac1 = new Trkac("Marko", "Markovic", 233);
        Trkac trkac2 = new Trkac("Milan", "Milanovic", 205);
        Trkac trkac3 = new Trkac("Janko", "Jankovic", 300);
        Trkac trkac4 = new Trkac("Stefan", "Stefanovic", 125);

        Skakac skakac1 = new Skakac("Darko", "Darkovic", 123);
        Skakac skakac2 = new Skakac("Pera", "Peric", 100);
        Skakac skakac3 = new Skakac("Steva", "Stevic", 150);

        skokUDalj.addAtleticar(skakac1);
        skokUDalj.addAtleticar(skakac2);
        skokUDalj.addAtleticar(skakac3);

        trkaSPreponama.addAtleticar(trkac1);
        trkaSPreponama.addAtleticar(trkac2);
        trkaSPreponama.addAtleticar(trkac3);
        trkaSPreponama.addAtleticar(trkac4);

        skokUDalj.printTheBest();

        trkaSPreponama.disqualify("Janko", "Jankovic");
        trkaSPreponama.printTheBest();

    }
}
