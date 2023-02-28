import java.util.Scanner;
public class Alg59 {

    public static void main(String[] args) {

		int i, aux;
		String[] vet1 = new String[8];
		String nome;

		Scanner ler = new Scanner(System.in);

			System.out.println("Escreva 8 nomes:");
		   	nome =ler.nextLine();

		   for(i=0;i < vet1.length;++i){

		   	System.out.println("Escreva 8 nomes:");
		   	nome =ler.nextLine();

		    vet1[i]= nome;
		   }

		   for(aux=7;aux >= 0;--aux){

		    System.out.print(vet1[aux] + " ");
		   }
    }
}

