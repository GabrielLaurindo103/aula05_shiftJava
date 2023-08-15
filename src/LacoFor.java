import java.util.Scanner;

public class LacoFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero, tabuada = 0;

        System.out.println("Digite um número para calcular a tabuada: ");
        numero = input.nextInt();

        for (int i = 1; i <= 10; i++){ //VARIÁVEL "i" SÓ EXISTE DENTRO DA ESTRUTRA FOR
            tabuada = numero * i;
            System.out.println(numero + " x " + i + " = " + tabuada);
        }
    }
}
