import java.util.Scanner;

public class QuestaOnze {
	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
	
	System.out.println("insira um número: ");
		int num = ref.nextInt();
		
	System.out.println("a sequência de Fibonacci do número " + num + "é: ");
		int x = 0, y = 1;
		
		for (int i = 0; x <= num; i++) {
			System.out.println(x);
			int valorAtual = x;
			x = y;
			y = valorAtual + y;
		}
	}
}
