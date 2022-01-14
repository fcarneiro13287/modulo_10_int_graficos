import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TratadorEventoBotao implements ActionListener {
    private JButton ok;
    private JButton cancela;
    public TratadorEventoBotao(JButton ok, JButton cancela){
        this.ok = ok;
        this.cancela = cancela; }
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == ok)
            JOptionPane.showMessageDialog(null, "O botão OK foi selecionado");
        if(evento.getSource() == cancela)
            JOptionPane.showMessageDialog(null, "O botão CANCELA foi selecionado");
    }
}

