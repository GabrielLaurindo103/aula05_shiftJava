import java.util.Objects;
import java.util.Scanner;

public class Lacos {
    public static void main(String[] args) {

        Scanner inputNumber = new Scanner(System.in);
        Scanner inputText = new Scanner(System.in);
        double largura, comprimento, areacComodo, totalArea = 0;
        String resposta, descricaoComodo;

        System.out.println("***Cálculo da área residencial***");

        do {
            System.out.println("Digite o nome do cômodo: ");
            descricaoComodo = inputText.nextLine();

            System.out.println("Largura: ");
            largura = inputNumber.nextDouble();

            System.out.println("Comprimento: ");
            comprimento = inputNumber.nextDouble();

            areacComodo = largura * comprimento;
            System.out.println("Área: " + areacComodo);

            totalArea += totalArea;

            System.out.println("Deseja adicionar o registro de outro cômodo da residência: ");
            resposta = inputText.nextLine();

        } while (Objects.equals(resposta, "Sim") || Objects.equals(resposta, "s"));

        System.out.println("Total m2 da residência: " + totalArea);
    }
}
