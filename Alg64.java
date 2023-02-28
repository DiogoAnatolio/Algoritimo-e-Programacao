import java.util.Scanner;
public class Alg64 {

    public static void main(String[] args) {

		int i, c;
		int num;
		int[] vet1 = { -1,8,0,2,-20};
		boolean verdadeiro = true;


		Scanner ler = new Scanner(System.in);

		   for(c=0;c <= 3;c++){

		   	if (verdadeiro = false){
		   		System.out.println("Digite e confira o número:");
		   		num =ler.nextInt();

		   		for(i=0; i<=4; i++){
			   			if(num==vet1[i]){
			   				System.out.println("o número que se encontra no array é " + num);
			   				verdadeiro = false;
		   		}

		   	}
		   	}
		   }

    }
}
