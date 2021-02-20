package GUI;

import Decryption.DecryptionClass;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    public static void main(String[] args) {
        new MainFrame();
    }
}


class MainFrame extends JFrame implements ActionListener {
    private JTextField lisenceTextField, proLicenseTextField, inputTextField;
    private JButton applyButton;
    private final JLabel emptyLabel = new JLabel(" ");
    private final JLabel inputLabel = new JLabel("Input symbols :");
    private DecryptionClass decryptionClass;
    private String finalCode;
    private String finalCodePro;
    private ImageIcon imageIcon, backIcon;
    private JLabel hypenLabel1;
    private String text;


    public MainFrame() {
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
        setTitle("LIS Activator");
        setFont(font);
        setSize(600, 400);
        setLocation(200, 300);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        imageIcon = new ImageIcon(Toolkit.getDefaultToolkit().getImage("src/img/icon.png").getScaledInstance(15, 15, Image.SCALE_SMOOTH));
        setIconImage(imageIcon.getImage());
        setLocationRelativeTo(null);
        initialize();



        setVisible(true);
        System.out.println("Activation KEY : " + finalCode);       //<<<------- This is Activation Key -------//
        System.out.println("Activation KEY pro : " + finalCodePro);  //<<<------- This is Activation Key PRO ----//
    }

    public void initialize() {
        decryptionClass = new DecryptionClass();

        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 25);
        inputLabel.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        lisenceTextField = new JTextField(8);
        lisenceTextField.setPreferredSize(new Dimension(500, 40));
        lisenceTextField.setColumns(8);
        lisenceTextField.setFont(font);
        lisenceTextField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lisenceTextField.setBorder(new LineBorder(Color.DARK_GRAY, 2));
        lisenceTextField.setEditable(false);


        proLicenseTextField = new JTextField(8);
        proLicenseTextField.setPreferredSize(new Dimension(500, 40));
        proLicenseTextField.setColumns(8);
        proLicenseTextField.setFont(font);
        proLicenseTextField.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        proLicenseTextField.setBorder(new LineBorder(Color.DARK_GRAY, 2));
        proLicenseTextField.setEditable(false);


        inputTextField = new JTextField(15);
        inputTextField.setPreferredSize(new Dimension(500, 40));
        inputTextField.setFont(font);
        inputTextField.setColumns(15);
        inputTextField.setBorder(new LineBorder(Color.DARK_GRAY, 2));


        applyButton = new JButton("start");
        applyButton.setBorder(new LineBorder(Color.DARK_GRAY, 2));
        applyButton.setForeground(Color.white);
        applyButton.setBackground(Color.decode("#BE0000"));
        applyButton.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        applyButton.setPreferredSize(new Dimension(75, 40));
        applyButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 18));
        applyButton.setFocusPainted(false);
        applyButton.addActionListener(this);

        JLabel simpleLabel = new JLabel("    ");//-------simple space------//
        JLabel hypen1 = new JLabel(" ");
        JLabel hypen2 = new JLabel(" ");
        JLabel hypen3 = new JLabel(" ");
        JLabel licenseLabel = new JLabel("30 day version : ");
        JLabel proLicenseLabel = new JLabel("Pro version : ");
        licenseLabel.setFont(font);
        proLicenseLabel.setFont(font);
        simpleLabel.setFont(font);



        JPanel licensePanel = new JPanel(new FlowLayout());
        licensePanel.add(licenseLabel);
        licensePanel.add(lisenceTextField);


        JPanel proLicensePanel = new JPanel(new FlowLayout());
        proLicensePanel.add(simpleLabel);
        proLicensePanel.add(proLicenseLabel);
        proLicensePanel.add(proLicenseTextField);


        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(inputLabel);
        inputPanel.add(inputTextField);
        inputPanel.add(applyButton);


        JPanel northPanel = new JPanel(new GridLayout(3,1));
        northPanel.add(hypen1);
        northPanel.add(inputPanel);


        JPanel southPanel = new JPanel(new GridLayout(3,1));
        southPanel.add(licensePanel);
        southPanel.add(proLicensePanel);
        southPanel.add(hypen3);


        add(northPanel,BorderLayout.NORTH);
        add(southPanel,BorderLayout.SOUTH);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(applyButton)) {
            if (inputTextField.getText().isEmpty()){
                JFrame frame = new JFrame();
                JOptionPane.showMessageDialog(frame,"Enter text to Generate please.");
            }
            text= inputTextField.getText();
            lisenceTextField.setText(decryptionClass.decryptionInfo(text));
            proLicenseTextField.setText(decryptionClass.decryptionInfoPro(text));

            System.out.println(decryptionClass.decryptionInfo(text));
            System.out.println(decryptionClass.decryptionInfoPro(text));
           /* decryptionClass.decryptionInfo(text);
            decryptionClass.decryptionInfoPro(text);*/
            }
        }

    }


