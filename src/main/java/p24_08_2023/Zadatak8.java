package p24_08_2023;

import java.util.ArrayList;

public class Zadatak8 {
    public static void main(String[] args) {

//        8.  Napisati program koji validira registracionu formu. Program treba da održava 2 niza informacija:
//        **Niz polja za registraciju**: Ovaj niz treba da sadrži nazive polja koja se pojavljuju u registracionoj formi.

//            **Niz obaveznih polja**: Ovaj niz treba da sadrži za svako polje informaciju da li je polje obavezno za popunjavanje ili ne. Ako je odgovarajuća vrednost `true`, to znači da je polje obavezno. Ako je vrednost `false`, polje nije obavezno.
//
//            Program treba da radi na sledeći način:
//
//    Ispisuje registracionu formu sa nazivima polja iz prvog niza. Pored svakog naziva polja se ispisuje zvezdica (*) ako je odgovarajuća vrednost u trećem nizu `true`.
//
//    Napomena: Pretpostavljamo da su oba niza iste dužine i da se podaci o istom polju nalaze na istom indeksu u oba niza
//
//    Ako su nizovi:
//    inputs = “first name”, “last name”, “email”, “password”, “phone”, “address”
//    required = true, true, true, true, false, false
//
//    Primer izvrsenja
//    first name: * _______________________
//    last name: * _______________________
//    email: * _______________________
//    password: * _______________________
//    phone:  _______________________
//    address:  _______________________


        ArrayList<String> inputs = new ArrayList<>();
        ArrayList<Boolean> required = new ArrayList<>();

        inputs.add("First name");
        inputs.add("Last name");
        inputs.add("Email");
        inputs.add("Password");
        inputs.add("Phone");
        inputs.add("Address");

        required.add(true);
        required.add(true);
        required.add(true);
        required.add(true);
        required.add(false);
        required.add(false);

        for (int i = 0; i < inputs.size(); i++) {
            if (required.get(i) == true) {
                System.out.println(inputs.get(i) + ": * _______________________");
            } else {
                System.out.println(inputs.get(i) + ":  _______________________");
            }

        }

    }
}
