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
public class Operacoes {
    public static void main(String[] args) {
        int opc=0;
        double num1,num2,resultado=0;
        while(opc!=5){
            opc=Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação\n"
               +"1 - Soma\n"+
                "2 - Subtração\n"+
                "1 - Multiplicação\n"+
                "1 - Divisão\n"));
            num1=Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
            num2=Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));        if (opc ==1){
            if (opc==1){
                resultado=num1+num2;
            }
            if (opc==1){
                resultado=num1+num2;
            }
            if (opc==2){
                resultado=num1-num2;
            }
            if (opc==3){
                resultado=num1*num2;
            }
            if (opc==4){
                resultado=num1/num2;
            }
            JOptionPane.showMessageDialog(null,"O resultado da operação é: "+resultado);
            }
        }
    }
}
    

