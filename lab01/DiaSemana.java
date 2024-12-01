import java.util.Scanner;
    public class DiaSemana {
        public static void main(String[] args) {
        System.out.println("Digite o dia: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] semana = {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sabado"};
        if (n <= semana.length) {
            System.out.println("o dia " + n + " será uma(a) " + semana[n-1]);
        }else {
            int dia = n % 7;
            if (dia == 0) {
                System.out.println("o dia " + n + " será um(a) " + semana[6]);
            }else {
                System.out.println("o dia " + n + " será um(a) " + semana[dia-1]);
            }
        }
    }
}
