import javax.swing.JFrame;

public class JframeEx {
    public static void main(String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("JFrame");
        janela.setSize(500,200);
        janela.setLocation(50,50);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
