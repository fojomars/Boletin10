/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_2;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author fojomars
 */
public class JuegoOrdenador {
    private int numeroAleatorio;
    private int numIntentos;
    public void jugarJuego(){
        
        numeroAleatorio = (int) (Math.random() * 50) +1;    
        numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o número de intentos: "));
        
        do{
            int numeroCorrecto = Integer.parseInt(JOptionPane.showInputDialog("Intenta adiviñar o numero: "));
            if(Math.abs(numeroAleatorio-numeroCorrecto) > 0)
                JOptionPane.showMessageDialog(null, "Moi preto");
            else if(Math.abs(numeroAleatorio-numeroCorrecto) >= 5)
                JOptionPane.showMessageDialog(null, "Preto");
            else if(Math.abs(numeroAleatorio-numeroCorrecto) >= 10)
                JOptionPane.showMessageDialog(null, "Lonxe");
            else if(Math.abs(numeroAleatorio-numeroCorrecto) > 20)
                JOptionPane.showMessageDialog(null, "Moi lonxe");
            else{
                JOptionPane.showMessageDialog(null, "Moi ben! \nAcertaches!");  
                break;
          }
            numIntentos -=1;
      }while(numIntentos != 0);
    
}
}
