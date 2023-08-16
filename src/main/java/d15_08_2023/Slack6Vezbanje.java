package d15_08_2023;

public class Slack6Vezbanje {
    public static void main(String[] args) {

//        Napisati program koji simulira ponasanje auto video quality funkcionalnost na youtube-u.
//                Program od informacija ima:
//        naziv videa
//        duzinu fajla u sekundama (npr: ako video traje 2:29, cuva se 149s)
//        broj frame-ova  po sekundi
//        rezoluciju (duzina x visina frame-a)
//        Teorija: Frame je jedna slika u videu date rezolucije. video se sastoji od niza frame-ova i obicno se po sekundi prikaze od 20 do 30 frame-a, zavisno od samog videa. Npr: ako imate video koji traje 5s rezolucije 1920x1080 sa 10 frame-a po sekundi, to znaci da se u jednoj sekundi prikazu 10frama sto ce biti na po 100 milisekundi jedna slika.
//                Program racuna minimalan internet protok po sekundi potreban za datu rezoluciju. Minimalan internet protok je protok koji moze da ucita sekundu videa u sekundi. Minimalni protok treba da bude izrazen u Mb/s
//        Dodatno program isposuje informacije u odredjenom formatu. Napomena: Informacija za duzinu videa treba da bude u formatu minuti:sekunde
//        Primer izvrsenja:
//*************************************************************************
//        Tea Tairović - Bibi Habibi (Official Video | Album Balerina)
//        2:29   <| | | | |
//        Number of frames per second: 20
//        Resolution: 1920x1080
//        Minimal network speed: 39Mb/s (edited)

        String fileName = "Tea Tairović - Bibi Habibi (Official Video | Album Balerina)";
        int fullLenght = 149;
        int lenghtMin = fullLenght / 60;
        int lenghtSek = fullLenght - lenghtMin * 60;

        int fps = 20;
        int width = 1920;
        int height = 1080;
        int sizeb = width * height;
        int sizekb = sizeb / 1024;
        double sizeMb = (sizekb * 1.0) / 1024;
        int minNetSpeed = (int) (sizeMb * fps);

        System.out.println("*************************************************************************");
        System.out.println(fileName);
        System.out.println(lenghtMin + ":" + lenghtSek + "   <| | | | |");
        System.out.println("Number of frames per second: " + fps);
        System.out.println("Resolution: " + width + "x" + height);
        System.out.println("Minimal network soeed: " + minNetSpeed +"Mb/s");


    }
}
