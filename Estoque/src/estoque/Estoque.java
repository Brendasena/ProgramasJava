
package estoque;

import java.util.Scanner;

public class Estoque {

    public static void main(String[] args) {
        //definição de variáveis 
        double valor, qntde, vt;
        
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual a quantidade de peças?");
        qntde =entrada.nextDouble();
        
        System.out.println("Qual o valor das peças?");
        valor =entrada.nextDouble();
        
        //processamento
        vt = valor*qntde;
        
        //saída
        System.out.println("O valor do estoque é igual a:"+vt);
    }
    
}
