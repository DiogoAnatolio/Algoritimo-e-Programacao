import java.util.Scanner;
public class Alg6 {

	public static void main(String[] args)	{

		Scanner ler = new Scanner(System.in);

		int nota1, nota2, nota3;

		System.out.println("Entre com as notas do aluno");

		nota1=ler.nextInt();
		nota2=ler.nextInt();
		nota3=ler.nextInt();

		int notaF=(nota1+nota2+nota3);

		if (notaF >= 60) {
			System.out.println("Aprovado");

		}else{
			System.out.println("Reprovado");
		}
	}
}