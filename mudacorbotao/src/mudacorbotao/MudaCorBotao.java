package mudacorbotao;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
 
public class MudaCorBotao extends JFrame {
 
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
 
    private JButton btn;
 
    private final Color C1 = Color.YELLOW, C2 = Color.GREEN;
 
    public MudaCorBotao() {
        super("Mudar cor do botão");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
         
 
        add(btn = new JButton("Mudar Cor"));
        btn.setBackground(C1);
        btn.setBounds(5, 5, 100, 25);
 
        btn.addActionListener(new ActionListener() {
 
            @Override
            public void actionPerformed(ActionEvent arg0) {
                //Se for a cor um, então mudo para a cor 2...
                btn.setBackground(btn.getBackground() == C1 ? C2 : C1);
            }
        });
         
         
    }
 
    public static void main(String[] args) {
        new MudaCorBotao().setVisible(true);
    }
 
}
