package Condicionais;

import javax.swing.JOptionPane;

public class AumentoSalario {
    public static void main(String[] args){
        double salario, resp;
    
      salario= Double.parseDouble(JOptionPane.showInputDialog("Digite seu salário:"));
    
      if(salario<=1500) {
        resp = salario*1.20;
      }
    
      else if(salario>1500 && salario<=3000){
        resp = salario*1.15;
      }
    
      else {
       resp = salario*1.10;
      }
    
      JOptionPane.showMessageDialog(null,"Seu salário com o aumento será de: R$" +resp);
    
    }
    
}
