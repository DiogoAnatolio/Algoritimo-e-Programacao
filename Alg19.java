import java.util.Scanner;
public class Alg18 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		double salario, novoSalario;

		System.out.println("Escreva seu sal�rio");
		salario =ler.nextDouble();

		if (salario < 500) {
		novoSalario = salario*1.15;
		System.out.println("O reajuste � de 15% e o novo sal�rio � " + novoSalario);

			} else if (salario >= 500 && salario <= 1000) {
					novoSalario = salario*1.10;
					System.out.println("O reajuste � de 10% e o novo sal�rio � " + novoSalario);

				} else if (salario > 1000) {
					novoSalario = salario*1.05;
					System.out.println("O reajuste � de 5% e o novo sal�rio � " + novoSalario);
					}
	}
}
