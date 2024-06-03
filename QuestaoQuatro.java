import java.util.Scanner;

public class MainQuatro {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
	System.out.println("Digite um número: ");
		double numUm = ref.nextInt();

	System.out.println("Digite outro número: ");
		double numDois = ref.nextInt();
		
	System.out.println("Digite outro número: ");
		double numTres = ref.nextInt();
		
	System.out.println("Digite outro número: ");
		double numQuatro = ref.nextInt();

	System.out.println("Digite outro número: ");
		double numCinco = ref.nextInt();

	System.out.println("Digite outro número: ");
		double numSeis = ref.nextInt();


	double media = (numUm + numDois + numTres + numQuatro + numCinco + numSeis)/6;
	System.out.println("A média dos números é: " + media);   
	}
}
