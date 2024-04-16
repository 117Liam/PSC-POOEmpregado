//A fim de representar empregados em uma empresa, crie uma classe chamada Empregado que inclui as três informações a seguir como atributos:
//Um primeiro nome,
//Um sobrenome, e
//Um salário mensal.
//Sua classe deve ter um construtor que inicializa os três atributos. Forneça os métodos método get/set para cada atributo. Se o salário mensal não for positivo, configure-o como 0.0. Escreva um aplicativo de teste que demonstra as capacidades da classe. Crie duas instâncias da classe e exiba o salário anual de cada instância (soma dos salários mensais). Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado.

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Informe o primeiro nome do empregado:");
            String primeiroNome = input.nextLine();

            System.out.println("Informe o sobrenome do empregado:");
            String sobrenome = input.nextLine();

            System.out.println("Informe o salário mensal do empregado: R$ ");
            float salarioMensal = input.nextFloat();
            input.nextLine(); 

            Empregado empregado = new Empregado(primeiroNome, sobrenome, salarioMensal);

            System.out.println("Salário anual do empregado: R$ " + empregado.calcularSalarioAnual());
            empregado.aumentarSalario();
            System.out.println("\nApós aumento de salário:");
            System.out.println("Novo salário anual do empregado: R$ " + empregado.calcularSalarioAnual());

            System.out.println("\nDeseja informar sobre outro empregado? (S/N)");
            choice = input.nextLine();

        } while (choice.equalsIgnoreCase("S"));

        input.close();
    }
}