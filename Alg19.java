import java.util.Scanner;
public class Alg18 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		double salario, novoSalario;

		System.out.println("Escreva seu salário");
		salario =ler.nextDouble();

		if (salario < 500) {
		novoSalario = salario*1.15;
		System.out.println("O reajuste é de 15% e o novo salário é " + novoSalario);

			} else if (salario >= 500 && salario <= 1000) {
					novoSalario = salario*1.10;
					System.out.println("O reajuste é de 10% e o novo salário é " + novoSalario);

				} else if (salario > 1000) {
					novoSalario = salario*1.05;
					System.out.println("O reajuste é de 5% e o novo salário é " + novoSalario);
					}
	}
}
