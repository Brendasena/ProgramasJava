
package quatronum;

import java.util.Scanner;

public class QuatroNum {

    public static void main(String[] args) {
        //definição de variáveis
        double n1, n2, n3, n4, nr1, nr2, nr3, nr4, result;
        
        //entrada
        Scanner entrada= new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        n1=entrada.nextDouble();
        
        System.out.println("Digite o segundo número");
        n2 =entrada.nextDouble();
        
        System.out.println("Digite o terceiro número");
        n3 =entrada.nextDouble();
        
        System.out.println("Digite o quarto número");
        n4 =entrada.nextDouble();
        
        //processamento
        nr1= n1*n1;
        nr2= n2*n2;
        nr3= n3*n3;
        nr4= n4*n4;
        result= nr1+nr2+nr3+nr4;
        
        //saída
        System.out.println("O resultato final é"+result);
    }
    
}
