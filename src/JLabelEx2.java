import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import static javax.swing.SwingConstants.LEFT;

public class JLabelEx2 {
    public static void main(String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("Label com Imagem");
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Icon imagem = new ImageIcon("enidh_logo2.png");
        JLabel rotulo = new JLabel("enautica",imagem,LEFT);
        janela.add(rotulo);
        janela.pack();
        janela.setVisible(true);
    }

}
