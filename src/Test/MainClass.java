//package Test;
//
//import javax.swing.*;
//import javax.swing.border.Border;
//import java.awt.*;
//
//public class MainClass {
//    public static void main(String[] args) {
//        new FrameDemo();
//    }
//}
//
//
//
//
//class FrameDemo extends JFrame {
//
//
//    FrameDemo(){
//
//        setLayout(new BorderLayout(5,5));
//        setSize(600,400);
//        setLocationRelativeTo(null);
//        initialize();
//        setVisible(true);
//    }
//
//    private void initialize() {
//        JPanel panel1 = new JPanel(new BorderLayout());
//        JPanel panel2 = new JPanel();
//        JPanel panel3 = new JPanel();
//        JPanel panel4 = new JPanel();
//        JPanel panel5 = new JPanel(new BorderLayout());
//        //----------------------- NORTH PANEL DEMONSTRATION -------------------//
//        JPanel panelN  = new JPanel(new BorderLayout());
//        JPanel panelN1 = new JPanel();
//        JPanel panelN2 = new JPanel();
//        JPanel panelN3 = new JPanel();
//        JPanel panelN4 = new JPanel();
//        JPanel panelN5 = new JPanel();
//
//        panelN1.setBackground(Color.yellow);
//        panelN2.setBackground(Color.green);
//        panelN3.setBackground(Color.BLACK);
//        panelN4.setBackground(Color.blue);
//        panelN4.setBackground(Color.magenta);
//
//        panelN.add(panelN1,BorderLayout.SOUTH);
//        panelN.add(panelN2,BorderLayout.NORTH);
//        panelN.add(panelN3,BorderLayout.EAST);
//        panelN.add(panelN4,BorderLayout.WEST);
//        panelN.add(panelN5,BorderLayout.CENTER);
//
//        panel1.setPreferredSize(new Dimension(100,100));
//        panel2.setPreferredSize(new Dimension(100,100));
//        panel3.setPreferredSize(new Dimension(100,100));
//        panel4.setPreferredSize(new Dimension(100,100));
//
//        panel1.setBackground(Color.red);
//        panel2.setBackground(Color.green);
//        panel3.setBackground(Color.black);
//        panel4.setBackground(Color.yellow);
//
//
//        panel1.add(panelN);
//        panel5.add(panelN3,BorderLayout.WEST);
//        panel5.add(panelN5,BorderLayout.WEST);
//        panel5.add(panelN1,BorderLayout.WEST);
//        panel5.add(panelN2,BorderLayout.WEST);
//        panel5.add(panelN4,BorderLayout.WEST);
//
//        add(panel1,BorderLayout.NORTH);
//        add(panel2,BorderLayout.SOUTH);
//        add(panel3,BorderLayout.EAST);
//        add(panel4,BorderLayout.WEST);
//        add(panel5,BorderLayout.CENTER);
//
//    }
//}
