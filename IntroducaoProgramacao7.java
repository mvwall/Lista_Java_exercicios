import java.util.Scanner;

public class IntroducaoProgramacao7 {
    public static void main(String[] args) {
        //Faça um programa que leia e imprima dois números inteiros n2a tela.
        Scanner console = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero1 = console.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int numero2 = console.nextInt();
        System.out.print("O primeiro número digitado foi " + numero1 + "\nO segundo numero digitado foi " + numero2);
    }

}
