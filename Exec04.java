package Pack1;
import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a[] = new int [3];
		int b[] = new int [3];
		int c[] = new int [6];

		for(int i = 0; i < 3; i++) {
			System.out.print("Informe o " + i + "º valor de A: ");
			a[i] = ler.nextInt();
			c[i] = a[i];

			System.out.print("Informe o " + i + "º valor de B: ");
			b[i] = ler.nextInt();
			c[i+3] = b[i];
		}
		
		System.out.println("");

		for(int i = 0; i < 3; i++) {
			System.out.println("Os valores de C são " + c[i]);
			System.out.println("Os valores de C são " + c[i+3]);
		}
		ler.close();
	}

}


