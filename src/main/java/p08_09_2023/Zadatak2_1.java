package p08_09_2023;


public class Zadatak2_1 {
    public static void main(String[] args) {

//    Krairti klasu SlackMessage koja ima:
//    tekst poruke
//    ime i prezime osobe koja je stavila poruku
//    datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//    (dopuna) kreirati metodu za stampu koja stampa podatke u formatu
//    [ime i prezime osobe] - [kad je poslata]
//    [Tekst poruke]
//    U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke
//
//      (Dopuna)
//      Dopuniti klasu SlackMessage novim atributom koji kaze kada je poruka azurirana i kreirati metodu za azuriranje teksta. Metoda kao parametar prima novi tekst i datum kada je poruka azurirana. Metoda postavlja novi tekst i datum azuriranja u objektu.
//      U glavnom programu pozvati ovu metodu za izmenu i nakon toga ponovo odstampati stanje objekata.

      SlackMessage1 m = new SlackMessage1();

      m.imeIPrezime = "Marko Markovic";
      m.dateAndTime = "26.08.2021 18:55";
      m.text = "Poruka, poruka, poruka";

      SlackMessage1 p = new SlackMessage1();

      p.imeIPrezime = "Petar Petrovic";
      p.dateAndTime = "07.08.2023 10:12";
      p.text = "Tekst, poruka, tekst";

      m.printSlackMessage();
      m.update("Novii tekst", "09.09.2023. 22:02");
      System.out.println("(((((((((((((");
      m.printSlackMessage();

      String convertedInfo = m.convertToString();
    }

}
