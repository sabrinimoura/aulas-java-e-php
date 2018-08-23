import java.util.Random;
import java.util.Scanner;
public class Ex1_bublleSort{
    public static void main(String[]args){
        Scanner tcl = new Scanner(System.in);
        Random numeros = new Random();
        int aux = 0;
        int vetor[] = new int[10];
        for (int i = 0; <vetor.length; i++){
            vetor [i] = tcl.nextInt();
        }
        for (int i = 0; <vetor.length; i++){
        for (int j = 0; j <vetor.length; j++){
            if (vetor[i] < vetor[j]){
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor [j] = aux;
            }
            System.out.println("numeros ordenados");
    for (int i = 0; i < vetor.length; i++){
        System.out.println(vetor[i]);
        

    }
    }
}