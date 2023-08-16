package d15_08_2023;

public class Slack3Vezbanje {
    public static void main(String[] args) {

//        3. (Za vezbanje - Slack)
//        Napisati program koji vrsi grubu procenu koliko je vremena potrebno da se skine fajl.
//        Program od informacija cuva naziv fajla, velicinu fajla i brzinu skidanja.
//        Velicina fajla je u Mb a brzina skidana u Mb/s (megabajt u sekundi)
//        Primer izvrsenja
//        File: profile-image.log
//        Size: 25Mb
//        Download speed: 3Mb/s
//        Estimated time: 8s

   String fileName = "image_002.jpg";
   int size = 25;
   int dlSpeed = 3;
   int dlETA = size / dlSpeed;

        System.out.println("File: " + fileName);
        System.out.println("Size: " + size + "Mb");
        System.out.println("Download speed: " + dlSpeed + "Mb/s");
        System.out.println("Estimated time: " + dlETA +"s");



    }
}
