public class MainClass {

     public static void main(String[] args){
        Covek covek = new Covek();
        covek.ime = "Andrej";
        covek.prezime = "Filkoski";
        covek.maticen = 1234567891011B;

         System.out.println("Imeto na covekot e: " + covek.ime +
                 "\nPrezimeto na covekot e: " + covek.prezime +
                 "\nCovekot ima maticen broj: " + covek.maticen);
    }
}
