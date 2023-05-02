package Pack1;
import java.util.Scanner;

public class Exec01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int fator = 1, num;

		System.out.print("Informe o Fatorial: ");
		num = ler.nextInt();

		if (num < 0) {
			System.out.print("Não existe fatorial negativo!!!");
		}
		if (num > 0) {
			for(int i = 1; i <= num; i++) {
				fator*=i;
			}
			System.out.println("O fatorial de " + num + " é :" + fator);
		}
		ler.close();
	}
}
