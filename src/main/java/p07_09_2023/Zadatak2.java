package p07_09_2023;

public class Zadatak2 {
    public static void main(String[] args) {

//    Krairti klasu SlackMessage koja ima:
//    tekst poruke
//    ime i prezime osobe koja je stavila poruku
//    datum i vreme kad je poslata poruka (npr: 26.08.2021 18:55)
//    U glavnom programu kreirati 2 slack poruke sa proizvoljnim podacima i ostampati obe poruke u formatu:
//    [ime i prezime osobe] - [kad je poslata]
//    [Tekst poruke]

      SlackMessage m = new SlackMessage();

      m.imeIPrezime = "Marko Markovic";
      m.dateAndTime = "26.08.2021 18:55";
      m.text = "Poruka, poruka, poruka";

      SlackMessage p = new SlackMessage();

      p.imeIPrezime = "Petar Petrovic";
      p.dateAndTime = "07.08.2023 10:12";
      p.text = "Tekst, poruka, tekst";

      System.out.println(m.imeIPrezime + " - " + m.dateAndTime);
      System.out.println(m.text);

      System.out.println(p.imeIPrezime + " - " + p.dateAndTime);
      System.out.println(p.text);

    }
}
