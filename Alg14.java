import java.util.Scanner;
public class Alg14 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int numeroDigitado, numeroPar;

		System.out.println("Digite um número negativo, positivo ou nulo:");
		numeroDigitado=ler.nextInt();

		if (numeroDigitado == 0) {
			System.out.println("Esse número é nulo!!");
		} else if (numeroDigitado%2 == 0){
			System.out.println("Esse número é par!!");
			} else if (numeroDigitado%2 == 1){
				System.out.println("Esse número é impar!!");
				}
	}
}

