
package custfabcarro;

import java.util.Scanner;

public class CustfabCarro {

    public static void main(String[] args) {
        //definição de variáveis
        double cust, imp, dist, valorf;
                
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o custo de fábrica do automóvel?");
        cust =entrada.nextDouble();
        
        //processamento
        imp = cust*1.45;
        dist = imp*1.28;
        
        //saída
        System.out.println("O valor final do automóvel é de: R$"+dist);
    }
    
    
}
