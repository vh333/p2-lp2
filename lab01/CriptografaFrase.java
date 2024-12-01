import java.util.Random;
import java.util.Scanner;
public class CriptografaFrase {
    public static void main(String[] args) {
        String frase_criptografada = "";
        Scanner scanner = new Scanner(System.in);
        String palavra_chave = scanner.nextLine();
        String frase_inicial = scanner.nextLine();
        String[] frase = frase_inicial.split(" ");
        for (int i = 0; i < frase.length; i++) {
            if (frase[i].equals(palavra_chave)) {
                frase_criptografada += " ***";
            }else {
                frase_criptografada += ' ' + frase[i];
            }
        }
        System.out.println(frase_criptografada.trim());
    }
}
