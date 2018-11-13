/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author professor
 */
public class EleicaoGremio {
    public static void main(String[] args) {
        int voto=0, contA=0, contB=0;
        while(voto!=3){
            voto=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para votar na ChapaA\n"
                    +"Digite 2 para votar na ChapaB"));
            if (voto==1){
                contA=contA+1;
            }
            if (voto==2){
                contB=contB+1;
            }  
        }
        JOptionPane.showMessageDialog(null,"Votos para a ChapaA: "+Integer.toString(contA)+
                "\nVotos para a ChapaB: "+Integer.toString(contB));
         
    }
}
