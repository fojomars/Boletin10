/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;
import javax.swing.JOptionPane;
/**
 *
 * @author fojomars
 */
public class Juego {
    private int num;
    private int numIntentos;
    private int resposta;
    
    // Validar el número y número de intentos que se va a introducir
    public void validarJuego(){
        boolean valido = false;
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entre 1 y 50: "));
            if(num > 0 && num <= 50)
                valido = true;
            else
                JOptionPane.showMessageDialog(null, "Número erróneo! \nIntentao de novo.");    
        }while(valido == false);
        numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o número de intentos: "));
    }
    
    // Método del juego
    public void jugarJuego(){
        this.validarJuego();
        for(int cont = 0; cont < numIntentos; cont++){
            resposta = Integer.parseInt(JOptionPane.showInputDialog("Intenta adivinar un número entre 1 y 50:"));
            if(resposta > num){
                JOptionPane.showMessageDialog(null, "O número é menor");
            }    
            else if(resposta < num){
                JOptionPane.showMessageDialog(null, "O número é maior");
            }    
            else{
                JOptionPane.showMessageDialog(null, "Moi ben! \nAcertaches!");
                break;
                
            }    
        }
        JOptionPane.showMessageDialog(null, "Remataches todos os intentos!");
    }   
}
