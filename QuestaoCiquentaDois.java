
import java.util.Scanner; 

public class QuestaoCiquentaDois {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		int numUm = ref.nextInt();
		
		System.out.println("Insira outro número: ");
		int numDois = ref.nextInt();
		
		System.out.println("Insira mais um número: ");
		int numTres = ref.nextInt();
		
		if ((numUm < numDois) && (numUm < numTres) && (numDois < numTres)) {
			System.out.println("Em ordem decrescente os números são: " + numTres + " " + numDois + " " + numUm);
		}
		
		if ((numUm < numDois) && (numUm < numTres) && (numTres < numDois)) {
			System.out.println("Em ordem decrescente os números são: " + numDois + " " + numTres + " " + numUm);
		}
		
		if ((numDois < numTres) && (numDois < numUm) && (numUm < numTres)) {
			System.out.println("Em ordem decrescente os números são: " + numTres + " " + numUm + " " + numDois);
		}
	}
}
