package Pack1;

import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {
		int senhaMestre, senhaTentativa;
		double n1, n2, soma;

		Scanner ler= new Scanner(System.in);

		System.out.print("Cadastre uma senha (Apenas números): ");
		senhaMestre = ler.nextInt();

		System.out.print("Digite um número: ");
		n1 = ler.nextDouble();
		System.out.print("Digite outro número: ");
		n2 = ler.nextDouble();
		soma = n1 + n2;

		System.out.print("Digite a senha para desbloquear a soma: ");
		senhaTentativa = ler.nextInt();

		if(senhaTentativa == senhaMestre) {
			System.out.print("A soma é " + soma);
			System.exit(senhaTentativa);
		}
		System.err.print("Erro! Senha Errada!");
		ler.close();
	}
}
