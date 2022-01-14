import javax.swing.*;
import java.awt.*;

public class EventosEx {
    public static void main(String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("Exemplo de Botão com evento");
        janela.setLayout(new FlowLayout());
        janela.setSize(350,150);
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton ok = new JButton("OK");
        JButton cancela = new JButton("Cancela");
        TratadorEventoBotao handler;
        handler = new TratadorEventoBotao(ok, cancela);
        ok.addActionListener(handler);
        janela.add(ok);
        cancela.addActionListener(handler);
        janela.add(cancela);
        //janela.setSize(350,70);
        janela.setVisible(true); }
}
