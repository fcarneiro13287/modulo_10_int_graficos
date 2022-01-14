import javax.swing.JFrame;
import javax.swing.JTextField;

public class JTextFieldEX {
    public static void main(String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("Exemplo de TextField");
        janela.setSize(200,50);
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField texto = new JTextField("Escreva o seu nome aqui: ");
        janela.add(texto);
        janela.setVisible(true);
    }
}
