package Model;

public class Player {
    private String navn;
    private String email;
    private int telefon;
    private int scoringer;


    public Player(String navn, String email, int telefon) {
        this.navn = navn;
        this.email = email;
        this.telefon = telefon;
        this.scoringer = 0;
    }

    @Override
    public String toString() {
        return ("navn " + navn);
    }

    public String getNavn() {
        return navn;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefon() {
        return telefon;
    }

    public int getScoringer() {
        return scoringer;
    }
}
