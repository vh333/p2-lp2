import java.util.Scanner;
public class CalculaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] array_notas = new double[n];
        for (int i = 0; i < n; i++) {
            double nota = scanner.nextDouble();
            array_notas[i] = nota;
        }
        double maior_nota = array_notas[0];
        double menor_nota = array_notas[0];
        double media = array_notas[0];
        for (int i = 1; i < n; i++){
            maior_nota = Math.max(maior_nota, array_notas[i]);
            menor_nota = Math.min(menor_nota, array_notas[i]);
            media += array_notas[i];
        }
        media = media / n;
        String mediaFormatada = String.format("%.2f", media);
        System.out.println("Media: " + mediaFormatada + " Maior nota: " + maior_nota + " Menor nota: " + menor_nota);
        scanner.close();
    }
}
