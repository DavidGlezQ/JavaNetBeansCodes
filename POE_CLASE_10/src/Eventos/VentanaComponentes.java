package Eventos;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class VentanaComponentes extends JFrame{
    //Objetos/atributos
    private JTextField txt_caja;
    private JButton btn1;
    
    //Main
    public static void main(String[] args){
        VentanaComponentes ventanaComponentes = new VentanaComponentes();
        ventanaComponentes.setVisible(true); 
    }
    
    //Constructor
    public VentanaComponentes(){ 
        inicializarComponentes();
    }
    
    //Metodo para crear la ventana
    public void inicializarComponentes(){
        getContentPane().setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
        setTitle("POE CLASE 10, EVENT LISTENER");
        txt_caja = new JTextField();
        txt_caja.setColumns(20);
        btn1 = new JButton("Aceptar");
        
        add(txt_caja);
        add(btn1);
        
        ManejadorEventos EventListener = new ManejadorEventos();
        txt_caja.addActionListener(EventListener);
        txt_caja.addMouseListener(EventListener);
        btn1.addActionListener(EventListener);
        txt_caja.addKeyListener(EventListener);
    }
    
    //Event Listener
    private class ManejadorEventos implements ActionListener, MouseListener, KeyListener{
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource() == txt_caja){
                System.out.println("Se presiona enter en el EditText");
            }
            if(ae.getSource() == btn1){
                System.out.println("Se presiona enter en el boton aceptar");
            }
        }   
        //Mouse Listener
        @Override
        public void mouseClicked(MouseEvent me) {
            if(me.getSource() == txt_caja){
                System.out.println("Se presiona el EditText con el mouse" + me.getLocationOnScreen().toString());
            }
        }

        @Override
        public void mousePressed(MouseEvent me) {}

        @Override
        public void mouseReleased(MouseEvent me) {}

        @Override
        public void mouseEntered(MouseEvent me) {}

        @Override
        public void mouseExited(MouseEvent me) {}
        //KeyListener
        @Override
        public void keyTyped(KeyEvent ke) {
            System.out.println("Se presiono la tecla: " + ke.getKeyChar());
        }

        @Override
        public void keyPressed(KeyEvent ke) {}

        @Override
        public void keyReleased(KeyEvent ke) {}
    }
}
