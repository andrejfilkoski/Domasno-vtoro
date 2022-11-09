import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){
        int strana1 = 0;
        int strana2 = 0;
        int strana3 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vnesi gi trite strani na triagonikot.");
        System.out.println("Strana 1: ");
        strana1 = scanner.nextInt();
        System.out.println("Strana 2: ");
        strana2 = scanner.nextInt();
        System.out.println("Strana 3: ");
        strana3 = scanner.nextInt();

        Triagolnik triagolnik = new Triagolnik(strana1, strana2, strana3);

        System.out.println("Plostinata na triagolnikot e: " + triagolnik.Plostina());
        System.out.println("Perimetarot na triagolnikot e: " + triagolnik.Perimetar());


    }
}
