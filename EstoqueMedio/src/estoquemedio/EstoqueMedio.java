
package estoquemedio;

import java.util.Scanner;

public class EstoqueMedio {
 
    public static void main(String[] args) {
        //definição de variáveis
        double estmin, estmax, estmed;
        
        //entrada
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Qual a quantidade mínima do estoque?");
        estmin =entrada.nextDouble();
        
        System.out.println("Qual a quantidade máxima do estoque?");
        estmax =entrada.nextDouble();
        
        //processamento
        estmed = (estmin+estmax)/2;
        
        //saída
        System.out.println("A quantidade média do estoque é de:"+estmed);
    }
    
}
