public class MainClass {

    public static void main(String[] args){
        Predmet mtm = new Predmet();
        mtm.ime = "mtm";
        mtm.profesor = "Sonja Mancevska";
        mtm.krediti = 6;
        mtm.semestar = 2;
        Predmet angliski = new Predmet("angliski");
        angliski.profesor = "Lela Andreevska";
        angliski.krediti = 6;
        angliski.semestar = 2;
        Predmet kio = new Predmet("Kio", "Mimoza Jovanovska", 6);

        System.out.println("-Predmet 1" +
                "\nPredmet: " + mtm.ime + "\nProfesor: " + mtm.profesor +
                "\nKrediti: " + mtm.krediti + "\nSemestar: " + mtm.semestar +
                "\n\n-Predmet 2" +
                "\nPredmet: " + angliski.ime + "\nProfesor: " + angliski.profesor +
                "\nKrediti: " + angliski.krediti + "\nSemestar: " + angliski.semestar +
                "\n\n-Predmet 3" +
                "\nPredmet: " + kio.ime + "\nProfesor: " + kio.profesor +
                "\nKrediti: " + kio.krediti);
        //Pecatenjeto go organizirame so nov red (\n)
        // potoa kazuvame sto sakame da ispecatime ("Predmet: ")
        // i na kraj go pecatime so povikuvanje na konstruktorot vo klasata Predmet,
        // so soodvetniot objekt mtm, angliski ili kio i na krajot soodvetnata promenliva od objektot (mtm.ime)
    }
}
