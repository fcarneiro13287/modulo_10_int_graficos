import javax.swing.JFrame;
import javax.swing.JLabel;

public class JLabelEx {
    public static void main(String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("JFrame");
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel rotulo = new JLabel("Escreva o seu nome: ");
        janela.add(rotulo);
        janela.pack();
        janela.setVisible(true);
    }

}
