
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author clebe
 */
public class Conta {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com a quantidade de minutos utilizados: ");
        int minutos = sc.nextInt();
        double conta = 50.0;
        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
            System.out.println("Minutos consumidos acima da franquia: "+(minutos-100));
           
        }
       
        System.out.printf("Valor da conta = R$ %.2f%n", conta);
        sc.close();

    }
}
