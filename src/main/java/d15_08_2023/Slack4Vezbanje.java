package d15_08_2023;

public class Slack4Vezbanje {
    public static void main(String[] args) {

//        4. (Za vezbanje - Slack)
//        Napisati program koji izracunava velicinu slike na temelju dostupnih podataka.
//        Program cuva sledece informacije o slici:
//        Naziv slike
//        Rezoluciju (duzina i visina)
//        Na osnovu rezolucije, program racuna ukupan broj piksela u slici.
//        Svaki piksel zauzima 1b (bajt).
//        Teorijski primer: ako je rezolucija slike 20x10, tada slika sadrzi ukupno 200 piksela, čime je njena velicina 200b.
//        Nakon toga, program treba da prikaze velicinu slike izrazenu u kilobajtima (kb) i megabajtima (mb), uzimajuci u obzir sledece konverzije:
//        1 kb = 1024b
//        1 Mb= 1024 kb
//        Primer izvrsenja
//        File: profile-image.log
//        Resolution: 1920 x 1080
//        Size (kb): 2025
//        Size (Mb):  1.977 (edited)

    String fileName = "image_003.jpg";
    int lenght = 1920;
    int height = 1080;
    int sizeb = lenght * height;

    int sizekb = sizeb / 1024;
    double sizeMb = (sizekb * 1.0) / 1024;

        System.out.println("File: " + fileName);
        System.out.println("Resolution: " + lenght + " X " + height);
        System.out.println("Size (kb): " + sizekb);
        System.out.println("Size (Mb): " + sizeMb);




    }
}
