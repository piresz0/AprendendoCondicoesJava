import java.util.Scanner;

public class ExemploCondicao2 {


    //Quer adicionar um desconto gradativo
    // Valor Maior que 1000 - 10%
    // Valor Maior que 2000 - 20%
    // Valor Maior que 3000 - 30%
    // Valor Menor igual a 1000 - 0%

    public static void main(String[] args) {

        double valorBruto = 3000;
        double desconto = 0d;

        // Operadores Logicos
        // && e
        // || ou

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor Bruto : ");
        valorBruto = scanner.nextDouble();

        if (valorBruto > 1000 && valorBruto<= 2000) {
             desconto = valorBruto * 0.10;
        }
        else if (valorBruto > 2000 && valorBruto < 3000) {
             desconto = valorBruto * (20 / 100);
        }
        else if (valorBruto >= 3000) {
             desconto = valorBruto * (30. / 100);
        }

        System.out.println("Valor do Bruto: " + valorBruto);
        System.out.println("Valor do desconto é " + desconto);
        System.out.println("Valor Liquido é :" + (valorBruto - desconto) );




    }



}
