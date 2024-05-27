import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o parâmetro 1: ");
        int parametro1 = sc.nextInt();

        System.out.print("Digite o parâmetro 2: ");
        int parametro2 = sc.nextInt();

        contar(parametro1, parametro2);

        System.out.println("Fim do programa.");
    }

    public static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        if (parametro1 > parametro2) {
            throw new ParametrosInvalidosException();
        }

        System.out.println("Contagem de 1 até " + (parametro2 - parametro1) + ":");

        for(int i = 1; i <= parametro2 - parametro1; i++) {
            System.out.println(i);
        }

    }
}


