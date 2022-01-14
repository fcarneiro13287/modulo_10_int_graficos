import javax.swing.*;
import java.awt.*;

public class JCheckBoxEx1 {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Exemplo de FlowLayout");
        janela.setSize(350,150);
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JCheckBox cb1 = new JCheckBox("Opção A");
        JCheckBox cb2 = new JCheckBox("Opção B");
        janela.add(cb1);
        janela.add(cb2);
        FlowLayout flout = new FlowLayout();
        flout.setAlignment(FlowLayout.CENTER);
        janela.getContentPane().setLayout(flout);
        janela.pack();
        janela.setVisible(true);
    }

}
