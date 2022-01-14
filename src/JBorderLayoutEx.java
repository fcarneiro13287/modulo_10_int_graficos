import javax.swing.*;
import java.awt.*;

public class JBorderLayoutEx {
    public static void main(String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("Exemplo de JButton");
        janela.setSize(350,150);
        janela.setLocation(500,500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("botao 1");
        JButton b2= new JButton("botao 2");
        JButton b3= new JButton("botao 3");
        JButton b4 = new JButton("botao 4");
        JButton b5 = new JButton("botao 5");
        janela.add(b1, BorderLayout.NORTH);
        janela.add(b2,BorderLayout.SOUTH);
        janela.add(b4,BorderLayout.WEST);
        janela.add(b5,BorderLayout.CENTER);
        janela.add(b3,BorderLayout.EAST);
        janela.setVisible(true);
 }
}
