import java.util.Scanner;
public class Alg11 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		double custoFinal, custoFabrica, pDistribuidor, pImpostos;

		System.out.println("Digite o custo de fábrica:");
		custoFabrica=ler.nextDouble();

		pDistribuidor = (custoFabrica*0.12);
		pImpostos = (custoFabrica*0.45);

		custoFinal= (custoFabrica + pDistribuidor + pImpostos);

		System.out.printf("Logo, o custo final do carro é: " + custoFinal);
	}
}

