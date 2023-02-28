import java.util.Scanner;
public class Alg60 {

    public static void main(String[] args) {

		int i, aux;
		String[] vet1 = new String[8];
		String[] vet2 = new String[8];
		String nome;

		Scanner ler = new Scanner(System.in);

		   for(i=0;i < vet1.length;++i){

		   	System.out.println("Escreva 8 nomes:");
		   	nome =ler.nextLine();

		    vet1[i]= nome;
		   }
		   i=0;

		   for(aux=7;aux >=0 ;aux--){

		    vet2[i]= vet1[aux];
		    i++;
		   }

		   for(i=0;i < vet2.length;++i){

		    System.out.print(vet2[i] + " ");
		   }
    }
}

