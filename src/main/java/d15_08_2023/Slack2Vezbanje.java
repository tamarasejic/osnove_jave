package d15_08_2023;

public class Slack2Vezbanje {
    public static void main(String[] args) {

//       2. (Za vezbanje - Slack)
//       Napisati program koji vrsi procentualnu procenu u fazi skidanja fajla.
//       Program od informacija cuva naziv originalnog fajla, velicinu originalnog fajla u Mb (megabajtima)
//       i velicinu skunutog dela fajla takodje u Mb.
//       Na kraju programa racuna i ispisuje koji je deo fajla skinut.Stampanje se vrsi u formatu
//       naziv fajla velicina originalnog fajla Mb/velicina skinutog dela fajla Mb
//       *****************************
//       ***********procenat %
//       *****************************
//        Primer izvrsenja:
//        profile-image.png 7Mb/2Mb
//        *****************************
//        *********** 28%
//        ***************************** (edited)

    String fileName = "image_001.jpg";
    int sizeOGFile = 7;
    int sizeDlFile = 2;
    int percentage = (sizeDlFile * 100) / sizeOGFile;

        System.out.println(fileName + " " + sizeOGFile + "Mb/" + sizeDlFile + "Mb");
        System.out.println("*****************************");
        System.out.println("*********** " + percentage + "%");
        System.out.println("*****************************");

    }
}
