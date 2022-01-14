import javax.swing.JFrame;
import javax.swing.JButton;

public class JButtonEx {
    public static void main(String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("Exemplo de JButton");
        janela.setSize(350,150);
        janela.setLocation(500,500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton botao = new JButton("ok");
        janela.add(botao);
        janela.setVisible(true); }
}
