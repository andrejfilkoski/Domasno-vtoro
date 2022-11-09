public class Predmet {

    String ime;
    String profesor;
    int krediti;
    int semestar;


    public Predmet() {
    }

    public Predmet(String ime) {
        this.ime = ime;
    }
    public Predmet(String ime, String profesor, int krediti) {
        this.ime = ime;
        this.profesor = profesor;
        this.krediti = krediti;
    }
}
