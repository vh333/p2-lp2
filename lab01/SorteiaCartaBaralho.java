import java.util.Random;
import java.util.Scanner;
public class SorteiaCartaBaralho {
    public static void main(String[] args) {
        String[] naipes = {"Paus", "Ouros", "Copas", "Espadas"};
        String[] cartas = {"1", "2", "3", "4", "5", "6" , "7", "8", "9", "Valete", "Dama", "Rei"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Aperte x para sortear a carta");
        String controle = scanner.nextLine();
        if (controle.equals("x")) {
            Random rand = new Random();
            int i = rand.nextInt(cartas.length);
            int j = rand.nextInt(naipes.length);
            System.out.println("A carta sorteada foi " + cartas[i] + " de " + naipes[j]);
        }else {
            System.out.println("ENTRADA INVALIDA");
        }
    }
}
