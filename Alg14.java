import java.util.Scanner;
public class Alg14 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int numeroDigitado, numeroPar;

		System.out.println("Digite um n�mero negativo, positivo ou nulo:");
		numeroDigitado=ler.nextInt();

		if (numeroDigitado == 0) {
			System.out.println("Esse n�mero � nulo!!");
		} else if (numeroDigitado%2 == 0){
			System.out.println("Esse n�mero � par!!");
			} else if (numeroDigitado%2 == 1){
				System.out.println("Esse n�mero � impar!!");
				}
	}
}

