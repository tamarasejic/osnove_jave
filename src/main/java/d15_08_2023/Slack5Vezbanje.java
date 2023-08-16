package d15_08_2023;

public class Slack5Vezbanje {
    public static void main(String[] args) {

//        5. (Za vezbanje - Slack)
//        Napisati program za promenu velicine slike na osnovu cuvanih podataka.
//        Program cuva sledece informacije:
//        Naziv slike
//        Rezoluciju (duzina i visina)
//        Faktor skaliranja
//        Na osnovu faktora skaliranja, program će odluciti hoce li sliku smanjiti ili povecati.
//        Evo teorijskih primera za faktor skaliranja:
//        ako je originalna slika 1920x1080, a faktor skaliranja 0.8, slika ce se smanjiti za 20% i rezolucija ce postati 1536x864.
//                S druge strane, ako je faktor skaliranja 1.3, slika ce se povecati za 30% i rezolucija ce postati 2496x1404.
//                Na kraju programa, prikazati velicinu svake slike u megabajtima (MB). Naziv nove slike se dobija dodavanjem prefiksa "resized-" originalnom nazivu.
//        Primer izvrsenja:
//        Original image: profile-image.png  Size: 1.977Mb
//        Scale: 1.3
//        Resized image: resized-profile-image.png Size: 3.342Mb
//                | Click here to Download image |

        String fileName = "image_004.png";
        int lenght = 1920;
        int height = 1080;
        double scaleFactor = 1.3;
        int scaledLenght = (int) (lenght * 1.0 * scaleFactor);
        int scaledHeight = (int) (height * 1.0 * scaleFactor);


        int sizeb = lenght * height;
        int sizekb = sizeb / 1024;
        double sizeMb = (sizekb * 1.0) / 1024;

        int sizebResized = (int) (scaledLenght * scaledHeight);
        int sizekbResized = sizebResized / 1024;
        double sizeMbResized = (sizekbResized * 1.0) / 1024;

        System.out.println("Original image: " + fileName + " Size: " + sizeMb + "Mb");
        System.out.println("Scale: " + scaleFactor);
        System.out.println("Resized image: resized-" + fileName + " Size: " + sizeMbResized + "Mb");
        System.out.println("| Click here to Download image |");



    }
}
