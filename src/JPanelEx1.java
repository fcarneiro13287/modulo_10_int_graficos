import javax.swing.*;
import java.awt.*;

public class JPanelEx1 {
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setTitle("Exemplo deJPanel");
        janela.setSize(350,150);
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JButton bt1 = new JButton("Ok");
        JButton bt2 = new JButton("Cancelar");
        JButton bt3 = new JButton("Ajuda");
        panel.add(bt1);
        panel.add(bt2);
        panel.add(bt3);
        String nomes[] = {"João", "Ana", "José", "Eva"};
        JList lista = new JList(nomes);
        janela.add(lista, BorderLayout.NORTH);
        janela.add(panel,BorderLayout.SOUTH);
        janela.pack();
        janela.setVisible(true);
    }
}
