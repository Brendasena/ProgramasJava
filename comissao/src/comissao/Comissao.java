
package comissao;

import java.util.Scanner;

public class Comissao {

    public static void main(String[] args) {
        // definição de variaveis
        double valorp, qntdp, valorfp, valorc;
        
        //entrada
        Scanner entrada =new Scanner (System.in);
        
        System.out.println("Qual o valor do produto?");
        valorp =entrada.nextDouble();
        
        System.out.println("Qual a quantidade do produto?");
        qntdp =entrada.nextDouble();
        
        //processamento
        valorfp = qntdp*valorp;
        valorc =5 *(valorfp/100);
        
        //saída
        System.out.println("O valor final do produto é:?"+valorfp);
        System.out.println("E o valor da comissão é:?"+valorc);
    }
    
}
