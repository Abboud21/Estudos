
package aula.swing;

import javax.swing.*;

public class AulaSwing {

    public static void main(String[] args) {
        //Criar Janela
        
        JFrame janela = new JFrame("Minha Primeira janela");
        janela.setSize(300,200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);  //Layout livre
        
        //Criar um Botão
        
        JButton botao = new JButton("Clique aqui!");
        botao.setBounds(80,70,130,30); //Posição x,y ,Largura,Altura
        botao.addActionListener(e ->{
        
        JOptionPane.showMessageDialog(null,"Ola, Mundo Swing");    
    });
        
       //Adicionar o Botão na janela   
       janela.add(botao);
      
       //Tornar a janela visivel
       janela.setVisible(true);
       
    }
    
}
