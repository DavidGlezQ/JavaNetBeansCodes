package herencia.layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlowLayoutFrame extends JFrame{
    
    public static void main(String[] args){
        FlowLayoutFrame obj = new FlowLayoutFrame();
        obj.getContentPane().setLayout(new FlowLayout());
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(500, 100);
        obj.setTitle("Esquema FlowLayout");
        
        JButton btn1 = new JButton("Boton 1");
        JButton btn2 = new JButton("Boton 2");
        JButton btn3 = new JButton("Boton 3");
        JButton btn4 = new JButton("Boton 4");
        JLabel lbl1 = new JLabel("Este es un FlowLayout");
        
        obj.add(btn1);
        obj.add(btn2);
        obj.add(btn3);
        obj.add(btn4);
        obj.add(lbl1);
        
        obj.setVisible(true);
    }
}
