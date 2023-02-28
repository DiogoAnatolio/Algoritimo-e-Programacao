import java.util.Random;
import java.util.Scanner;

	public class jokenpo
		 {
	public static void main(String[] args){

		Scanner dados = new Scanner(System.in);
		Random gerador = new Random();

		int valor1, valor2;

		System.out.println("Para começar o jogo, escollha para 0 (pedra), 1( papel) e 2 (tesoura)");

		valor1 = dados.nextInt();
		valor2 = gerador.nextInt(3);

			System.out.println(valor2);

				if (valor1 == 0){
						if (valor1 == 0 && valor2 == 2){
					System.out.println("pedra ganha de tesoura...");
					System.out.println("parabéns, você ganhou!!");

				}else {
					System.out.println("que pena, você perdeu!!");
				}
			}

				if (valor1 == 1){
						if (valor1 == 1&& valor2 == 0){
					System.out.println("papel ganha de pedra...");
					System.out.println("parabéns, você ganhou!!");

				}else {
					System.out.println("que pena, você perdeu!!");
				}
			}

				if (valor1 == 2){
						if (valor1 == 2 && valor2 == 1){
					System.out.println("tesoura ganha de papel...");
					System.out.println("parabéns, você ganhou!!");

				}else {
					System.out.println("que pena, você perdeu!!");
				}
			}

	}
}