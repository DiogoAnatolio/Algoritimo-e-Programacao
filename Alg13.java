import java.util.Scanner;
public class Alg13 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int numeroDigitado;

		System.out.println("Digite um n�mero negativo, positivo ou nulo:");
		numeroDigitado=ler.nextInt();

		if (numeroDigitado > 0){
			System.out.println("Esse n�mero � positivo!!");
		}

		if (numeroDigitado == 0){
			System.out.println("Esse n�mero � nulo!!");
		}

		if (numeroDigitado < 0){
			System.out.println("Esse n�mero � negativo!!");
		}

	}
}

