
package Condicionais;

import javax.swing.JOptionPane;

public class Banco {
    public static void main(String[] args) {
        double saque, saldoatual, saldofinal, limite;
        saldoatual=25000;
        limite=30000;
        
        saque = Double.parseDouble( JOptionPane.showInputDialog("Quanto você quer sacar?"));
        
        saldofinal = saldoatual - saque;
        
        if (saldofinal>=0){
            JOptionPane.showMessageDialog (null,"Seu saldo é positivo com R$"+saldofinal);
        }
        
        if ((saldofinal<0) && (saldofinal>=(-limite))){
            JOptionPane.showMessageDialog (null,"Seu saldo é negativo com R$"+saldofinal);
        }
        
        else{
            JOptionPane.showMessageDialog (null,"Você não possui limite suficiente para realizar o saque, seu limite é de: R$");
        }
    }   
}

 