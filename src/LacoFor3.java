import java.util.Scanner;

public class LacoFor3 {
    public static void main(String[] args) {
        //Fazer um programa que peça o usuário digitar 10 números
        //Quantos números pares, ímpares e a média destes números

        int numero, qtdeImpar = 0, qtdePar = 0, soma = 0;
        double media = 0;

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <=10; i++){
            System.out.println("Digite o " + i + "º número: ");
            numero = input.nextInt();

            if(numero % 2 == 1){
                qtdeImpar += 1;
            }
            else{
                qtdePar += 1;
            }
            soma += numero;
        }

        media = soma / 10;
        System.out.println("Quantidade Impar: " + qtdeImpar);
        System.out.println("Quantidade Par: " + qtdePar);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}
