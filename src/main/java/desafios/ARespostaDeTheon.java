package desafios;

import java.util.Scanner;

public class ARespostaDeTheon {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int[] T = new int[N];
        int  menor = 0, posMenor = 0;
        for(int i = 0; i<N; i++){
            T[i] = leitor.nextInt();
        }

        menor = T[0];
        for(int i = 0; i<N; i++){
            if(menor>T[i]){
                menor = T[i];
                posMenor = i;
            }
        }

        System.out.println(posMenor+1);
        leitor.close();

    }
}
