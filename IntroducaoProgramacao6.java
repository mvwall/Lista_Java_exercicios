import java.util.Scanner;

public class IntroducaoProgramacao6 {
    /*
    Faça um programa que leia um número inteiro e mostre-o na tela, por exemplo,
da seguinte forma: O número inteiro digitado foi 4
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroInteiroDigitado = console.nextInt();
        System.out.printf("O numero digitado foi %d",numeroInteiroDigitado);
    }
}
