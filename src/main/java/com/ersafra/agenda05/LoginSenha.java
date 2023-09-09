/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ersafra.agenda05;

import javax.swing.JOptionPane;

/**
 *
 * @author edson
 */
public class LoginSenha {
    public static void main(String[] args) {
        // login e senha
        // login =  aluno
        //senha = aluno
        //declaração de variaveis
        String login,senha; // variaveis para armazenar os dados , como são do mesmo tipo podem ser declaradas na mesma linha
        
        //entrada de dados
        login = JOptionPane.showInputDialog("Entre com o Login");
        senha = JOptionPane.showInputDialog("Entre com a senha");
        
        if(login.equals("aluno")&& senha.equals("aluno")){
            JOptionPane.showMessageDialog(null,"Acesso liberado");
        }else{
            JOptionPane.showMessageDialog(null,"Acesso não pode ser liberado,login ou senha incorretos");
        }//fim do if
        
    }//fim do main
   
}//fim da classe
