import java.util.Scanner;
public class Alg12 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int numeroDigitado;

		System.out.println("Digite um número negativo ou positivo:");
		numeroDigitado=ler.nextInt();

		if (numeroDigitado > 0){
			System.out.println("Esse número é positivo!!");
		}else {
			System.out.println("Esse número é negativo!!");
		}

	}
}

