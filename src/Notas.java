import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite a 1ª nota: ");
        int nota_1 = s.nextInt();

        System.out.println("Digite a 2ª nota: ");
        int nota_2 = s.nextInt();

        System.out.println("Digite a 3ª nota: ");
        int nota_3 = s.nextInt();

        System.out.println("Digite a 4ª nota: ");
        int nota_4 = s.nextInt();

        int sum = (nota_1 + nota_2 + nota_3 + nota_4) / 4;

        if (sum >= 7) {
            System.out.println("Aluno Aprovado!");
        } else if (sum >= 5 && sum < 7) {
            System.out.println("Aluno em Recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }
}