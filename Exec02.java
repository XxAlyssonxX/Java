package Pack1;
import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		double multiplo;
		Scanner ler = new Scanner(System.in);

		System.out.print("Informe o valor: ");
		multiplo = ler.nextDouble();
		
		if(multiplo % 5 == 0) {
			System.out.println("O número " + multiplo + " é multiplo de 5");
			System.exit(0);
		}
		System.out.println("O número " + multiplo + " não é multiplo de 5");
		ler.close();
	}
}
