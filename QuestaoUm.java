import java.util.Scanner;

public class MainUm {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
	System.out.println("Digite um número: ");
		int numUm = ref.nextInt();

	System.out.println("Digite outro número: ");
		int numDois = ref.nextInt();

	int soma = numUm + numDois;
	System.out.println("A soma dos números é: " + soma);   
	}
}
