/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_Dziekanat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Pavel
 */
public class main extends JFrame {

    private static SchRegister sr;
    private JButton[] butt;
    private JLabel[] lab;
    private static JFrame window;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         // TODO code application logic here
         window = new JFrame("Dziekanat");
         //window.setContentPanel();
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         window.setResizable(false);
         window.setLocation(55,25);
         window.pack(); 
         window.setVisible(true);
         */
        Register reg = new Register();
        reg.main(args);
    }

}
