
package arearetangulo;

import java.util.Scanner;

public class AreaRetangulo {

    public static void main(String[] args) {
        //definição das variáveis
        double area,perimetro,base,altura;
        Scanner entrada = new Scanner(System.in);
        
        //entrada
        System.out.println("Digite a base:");
        base =entrada.nextDouble();
        
        System.out.println("Digite a altura:");
        altura =entrada.nextDouble();
        
        //processamento
        area =base*altura;
        perimetro =((base*2)+(altura*2));
        
        //saída
        System.out.println("A área do retângulo é igual a:"+area);
        System.out.println("O perímetro do retângulo é igual a:"+perimetro);
        
    }
    
}
