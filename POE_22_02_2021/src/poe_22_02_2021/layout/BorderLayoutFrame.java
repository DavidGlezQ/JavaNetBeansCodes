package poe_22_02_2021.layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutFrame extends JFrame{
    
    public static void main(String[] args){
        FlowLayoutFrame obj = new FlowLayoutFrame();
        
        obj.getContentPane().setLayout(new BorderLayout(5,5));
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.setSize(500, 250);
        obj.setTitle("Esquema FlowLayout");
        
        JButton btn1 = new JButton("Boton 1");
        JButton btn2 = new JButton("Boton 2");
        JButton btn3 = new JButton("Boton 3");
        JButton btn4 = new JButton("Boton 4");
        JButton btn5 = new JButton("Boton 5");
        
        obj.add(btn1, BorderLayout.NORTH);
        obj.add(btn2, BorderLayout.SOUTH);
        obj.add(btn3, BorderLayout.EAST);
        obj.add(btn4, BorderLayout.WEST);
        obj.add(btn5, BorderLayout.CENTER);
        
        obj.setVisible(true);
    }
}
