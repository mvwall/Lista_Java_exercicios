import java.util.Scanner;

public class IntroducaoProgramacao8 {
    /*
    Faça um programa que leia um número inteiro e imprima o seu número sucessor e antecessor.
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numInt = console.nextInt();
        int sucessor = numInt+1;
        int antessesor = numInt-1;
        System.out.printf("Número sucessor %d ,numero antessesor %d\nVocê digitou: %d",sucessor,antessesor,numInt);

    }
}
