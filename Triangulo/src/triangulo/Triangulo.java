package triangulo;

import javax.swing.JOptionPane;

public class Triangulo {
    public static void main(String[] args) {
        double a,b,c;

a= Double.parseDouble(JOptionPane.showInputDialog("Digite o  do lado A:"));

b= Double.parseDouble(JOptionPane.showInputDialog("Digite o  do lado B:"));

c= Double.parseDouble(JOptionPane.showInputDialog("Digite o  do lado C:"));

    
if(((a<(b+c))&&(a>(Math.abs(b-c)))) &&((b<(a+c))&&(b>(Math.abs(a-c)))) && ((c<(b+a))&&(c>(Math.abs(b-a))))) {
 
    if((((a==b) && (b==c) && (a==c)))){ 
        JOptionPane.showMessageDialog(null, "Ele é um triângulo Equilátero."); 
    }
    
    if ((((a!=b) && (a!=c) && (b!=c)))){
        JOptionPane.showMessageDialog(null, "Ele é um triângulo Escaleno.");
    }
    
    if ((((a==b)&&(b!=c)) || ((b==c)&&(c!=a)) || ((a==c)&&(c!=b)))){
        JOptionPane.showMessageDialog(null, "Ele é um triângulo Isóceles.");
    }
    
}else{
    JOptionPane.showMessageDialog(null, "Ele não é um triângulo.");
    }

}