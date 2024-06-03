import java.util.Scanner;

public class MainSeis {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Digite um número para verificar se é uma potência de 2:");
        int numero = ref.nextInt();

        if (PotenciaDeDois(numero)) {
            System.out.println(numero + " é uma potência de 2.");
        }
        else {
            System.out.println(numero + " não é uma potência de 2.");
        }
    }

    public static boolean PotenciaDeDois(int num) {
        return num > 0 && (num & (num - 1)) == 0;
    }
}
