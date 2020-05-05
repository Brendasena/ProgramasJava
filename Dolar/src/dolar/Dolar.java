
package dolar;

import java.util.Scanner;

public class Dolar {

    public static void main(String[] args) {
        //definição de variáveis 
        double dolar, valorc, result;
                
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor do dólar atualmente:");
        dolar =entrada.nextDouble();
        
        System.out.println("Digite o valor a ser convertido para dólar:");
        valorc =entrada.nextDouble();
        
        //processamento
        result = valorc/dolar;
        
        //saída
        System.out.println("O valor final é: R$"+result);
    }
    
}
