import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        Random ale = new Random();
        System.out.print("Digite um n° a ser procurado: ");
        int n = scr.nextInt();
        int v[] = new int[12];
        for (int i = 0; i < v.length; i++) {
            v[i] = ale.nextInt();
        }
        Arrays.sort(v);
        int indice = (v.length - 1)/2;
        for (int i = 0; i < v.length; i++) {
            if(n == v[indice]){
                System.out.println("Encontrado na posição " + indice);
            }else if(indice > v[i]){
                indice += (v.length - 1)/2;
            }else{
                
            }
        }
    }
}