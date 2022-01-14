import javax.swing.*;
import java.awt.*;

public class JComboBoxEx1 {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Exemplo de FlowLayout");
        janela.setSize(350,150);
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String nomes[] = {"João", "Ana", "José", "Eva"};
        JComboBox cb = new JComboBox(nomes);
        janela.add(cb);
        FlowLayout flout = new FlowLayout();
        flout.setAlignment(FlowLayout.CENTER);
        janela.getContentPane().setLayout(flout);
        janela.setSize(150,150);
        janela.setVisible(true);
    }
}
