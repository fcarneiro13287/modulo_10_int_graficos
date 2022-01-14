import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Exemplo de FlowLayout");
        janela.setSize(350,150);
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1 = new JLabel("Utilizador: ");
        JTextField tf1 = new JTextField(10);
        JLabel l2 = new JLabel("Palavra chave: ");
        JPasswordField pw = new JPasswordField(6);
        JButton bt1 = new JButton("Ok");
        JButton bt2 = new JButton("Cancela");
        janela.add(l1);
        janela.add(tf1);
        janela.add(l2);
        janela.add(pw);
        janela.add(bt1);
        janela.add(bt2);
        FlowLayout flout = new FlowLayout();//set FlowLayout como Layout
        flout.setAlignment(FlowLayout.LEFT);
        janela.getContentPane().setLayout(flout);//metodo utilizado para se mudar o Layout no obj janela
        //janela.setSize(230,120);//redefine o tamanho da janela
        janela.setVisible(true);
    }

}
