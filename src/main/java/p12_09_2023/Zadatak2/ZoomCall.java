package p12_09_2023.Zadatak2;

public class ZoomCall {
    private String url;
    private String password;
    private Korisnik host;
    private Korisnik guest;

    public ZoomCall (String url, String password, Korisnik host) {
        this.url = url;
        this.password = password;
        this.host = host;
    }

    public void printInfo () {
        System.out.println("Zoom Call: " + this.url);
        System.out.println("Password: " + this.password);
        System.out.println("Host: " + this.host.getFullName());
        if (this.guest != null) {
            System.out.println("Guest: " + this.guest.getFullName());
        }
        System.out.println("Maximum video call length is " + this.host.maxVideoLength() + " min.");
    }




    //    getters & setters
    public String getUrl() {
        return this.url;
    }

    public String getPassword () {
        return this.password;
    }

    public Korisnik getHost() {
        return host;
    }
    public Korisnik getGuest() {
        return guest;
    }
    public void setGuest(Korisnik guest) {
        this.guest = guest;
    }
}
