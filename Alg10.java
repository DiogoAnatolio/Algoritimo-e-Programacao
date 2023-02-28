import java.util.Scanner;
public class Alg10 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		double distancia, volCombustivel, consumo;

		System.out.println("Digite primeiro a distância percorrida");
		distancia=ler.nextDouble();

		System.out.println("Agora digite a quantidade de Litros de combustível utilizado");
		volCombustivel=ler.nextDouble();

		consumo = (distancia/volCombustivel);

		System.out.printf("O valor do consumo médio do um automóvel é: " + consumo + " k/l");
	}
}