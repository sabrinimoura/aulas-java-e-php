package tret;
import java.util.Scanner;
import java.util.Random;
public class Tret {
    public static void main(String[] args) {
         Random numero = new Random();
        Scanner tcl = new Scanner(System.in);
        int vetor [] = new int[10];
        for (int i = 0; i < vetor.length; i++) {
             vetor[i] = tcl.nextInt();
        }
{
           
        }
       
    }    
    public static int busca(int vetor [],int tcl, int valor){
        int i =0;
        while((i < tcl)&& (vetor[i] != valor)){
            i++;
        }
        if((tcl == 0)&& (i > tcl));return 1;
        int x = busca;
        System.out.println(' '+ x);
    }
   
}

    
    

