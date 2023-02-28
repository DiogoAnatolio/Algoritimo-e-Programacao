public class Alg58 {

    public static void main(String[] args) {

		int i;
		int[] vet1 = {28, 22, 11, 0, 3, 4, 5};
		int[] vet2 = {2, 4, 7, 1, 6, 6, 11};
		int[] vet3 = new int[7];

		   for(i=0;i < vet3.length;++i){

		   vet3[i]= vet1[i]+ vet2[i];
		   }
		   for(i=0;i < vet3.length;++i){
		          System.out.print(vet3[i] + " ");
		   }
    }
}

