import java.util.Scanner;

public class QuestaOnze {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
	
	System.out.println("Digite um número: ");
		int num = ref.nextInt();
		
	System.out.println("Sequência de Fibonacci do número " + num + ": ");
		int a = 0, b = 1;
		
		for (int i = 0; a <= num; i++) {
			System.out.println(a);
			int valorAtual = a;
			a = b;
			b = valorAtual + b;
		}
	}
}
