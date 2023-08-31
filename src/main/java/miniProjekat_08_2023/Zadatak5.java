package miniProjekat_08_2023;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//    5. **Zadatak: Generisanje Random Passworda sa Specijalnim Karakterom**
//
//    Kako biste saznali više o generisanju random brojeva u programiranju, preporučujemo da istražite sledeći link: random koristeci Random class. Ovaj resurs će vam pružiti detaljnije razumevanje kako programi generišu slučajne brojeve i kako ih možete koristiti u različitim situacijama.
//
//    Napišite program koji simulira automatsko generisanje random passworda. Korisnik će uneti željenu dužinu passworda, a program će kreirati i ispisati password koji zadovoljava te parametre. Ovaj zadatak zahteva implementaciju različitih metoda za generisanje karaktera i passworda.
//            generisiRandomKarakter: Ova metoda generiše i vraća random karakter. Metoda koristi niz stringova sa elementima koji predstavljaju mala slova, velika slova i brojeve (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao povreatnu vrednost (string). Ova metoda nema ulazne parametre.
//    generisiRandomSpecijalanKarakter: Ova metoda generiše i vraća random specijalan karakter. Metoda koristi niz stringova sa elementima `@`, `#`, `&`, `*` i `!` (niz je sa fiksnim vrednostima). Random bira jedan element iz niza i vraća ga kao string. Ova metoda nema ulazne parametre.
//
//            Napomena: Metode generisiRandomSpecijalanKarakter generisiRandomKarakter nemaju nikakvu stampu u sebi!
//
//            Glavni program:
//    - Korisnik unosi dužinu passworda i informaciju da li treba sadržati specijalan karakter.
//    - Koristeći metodu `generisiPassword`, program generiše i ispisuje password.
//
//            Primer izvršenja 1:
//    Unesite dužinu passworda: 10
//    Da li želite da sadrži specijalan karakter: true
//    Generisan password: eD9Kx0e@
//
//            Primer izvršenja 2:
//    Unesite dužinu passworda: 10
//    Da li želite da sadrži specijalan karakter: false
//    Generisan password: eCxdwEeFEx

        Scanner s = new Scanner(System.in);

        System.out.print("Enter password lenght: ");
        int passwordLenght = s.nextInt();
        System.out.print("Would you like a special character included: ");
        boolean includeSpecialSign = s.nextBoolean();

        String generatedPassword = generisiPassword(passwordLenght, includeSpecialSign);
        System.out.println("Generated password: " + generatedPassword);

    }
    public static String generisiPassword (int passwordLenght, boolean includeSpecialSign) {
        String fullPassword = "";

            for (int i = 1; i <= passwordLenght; i++) {
                if (i != passwordLenght) {
                    fullPassword += generisiRandomKarakter();
                } else if (includeSpecialSign){
                    fullPassword += generisiRandomSpecijalanKarakter();
                } else {
                    fullPassword += generisiRandomKarakter();
                }
            }

        return fullPassword;
    }

    public static String generisiRandomKarakter () {
        Random randomChar = new Random();
        ArrayList<String> character = new ArrayList<>();

        character.add("A"); character.add("a"); character.add("0");
        character.add("B"); character.add("b"); character.add("1");
        character.add("C"); character.add("c"); character.add("2");
        character.add("D"); character.add("d"); character.add("3");
        character.add("E"); character.add("e"); character.add("4");
        character.add("F"); character.add("f"); character.add("5");
        character.add("G"); character.add("g"); character.add("6");
        character.add("H"); character.add("h"); character.add("7");
        character.add("I"); character.add("i"); character.add("8");
        character.add("J"); character.add("j"); character.add("9");
        character.add("K"); character.add("k");
        character.add("L"); character.add("l");
        character.add("M"); character.add("m");
        character.add("N"); character.add("n");
        character.add("O"); character.add("o");
        character.add("P"); character.add("p");
        character.add("Q"); character.add("q");
        character.add("R"); character.add("r");
        character.add("S"); character.add("s");
        character.add("T"); character.add("t");
        character.add("U"); character.add("u");
        character.add("V"); character.add("v");
        character.add("W"); character.add("w");
        character.add("X"); character.add("x");
        character.add("Y"); character.add("y");
        character.add("Z"); character.add("z");

        return character.get(randomChar.nextInt(character.size()));
    }
    public static String generisiRandomSpecijalanKarakter () {
        Random randomSpec = new Random();
        ArrayList<String> sign = new ArrayList<>();

        sign.add("@");
        sign.add("#");
        sign.add("&");
        sign.add("*");
        sign.add("!");

        return sign.get(randomSpec.nextInt(sign.size()));
    }
}
