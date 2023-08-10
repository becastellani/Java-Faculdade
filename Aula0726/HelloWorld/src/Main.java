import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = myObj.nextLine();

        System.out.print("Qual seu curso?: ");
        String course = myObj.nextLine();

        System.out.println("Olá " + nome + ", como voce está? Bem vindo ao curso de " + course);

    }
}