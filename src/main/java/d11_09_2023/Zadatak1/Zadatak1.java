package d11_09_2023.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

//    1. Zadatak
//    Kreirati klasu Autor koja ima
//    -ime i prezime
//    -konstuktore koje mislite da su vam potrebni
//    -gettere i settere za atribute
//    -metodu print koja stampa u formatu:
//    (ime autora) (prezime autora)
//
//    Kreirati klasu Knjiga koji ima:
//    -ISBN
//    -naziv
//    -godina izdanja
//    -autor
//    -konstuktore koje mislite da su vam potrebni
//    -gettere i settere za atribute
//    -metodu print koja stampa u formatu (izbegavati dupliranje koda):
//    (ISBN)
//    (naziv) - (godina izdanja)
//    autor: (ime autora) (prezime autora)
//
//    U glavnom programu napraviti vise autora sa vise knjiga.

        Author author1 = new Author("Agatha", "Christie");

        Author author2 = new Author("Jo", "Nesbo");

        Book book1 = new Book("ISBN 978-0-00-812320-8", "And then there were none", 2015, author1);
        Book book2 = new Book("ISBN 978-0-06-207395-2", "Hallowe'en Party", 2011, author1);

        Book book3 = new Book("ISBN 978-0753190548", "Headhunters", 2008,  author2);
        Book book4 = new Book("ISBN 978-1787303782", "Killing Moon", 2022,  author2);

        book1.printInfo();
        System.out.println();

        book2.printInfo();
        System.out.println();

        book3.printInfo();
        System.out.println();

        book4.printInfo();
    }
}
