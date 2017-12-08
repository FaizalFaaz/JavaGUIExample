/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 *
 * @author home
 */
public class Lab2 extends JFrame {
        private JLabel Labelname;
        private JTextField FirstNameText;
        private JButton Button1;
        private JCheckBox FirstCheck,SecondCheck;
        private JRadioButton Firstradio,SecondRadio;
        private ButtonGroup radiogroup;
        private JComboBox <String> comboBox;
        private static final String[] data= {"option1","option2","option3"};
   
        public Lab2(){
              super("components");
              JFrame window=new JFrame();
                window.setSize(550, 400);
                window.setVisible(true);
                window.setResizable(false);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                JPanel panel=new JPanel();
                panel.setLayout(null);
                window.add(panel);
                
        
                 Labelname = new JLabel("Label name:");
                Labelname.setBounds(40, 10, 260, 20);
                panel.add(Labelname);
                FirstNameText = new JTextField("Enter First name");
                FirstNameText.setBounds(270, 10, 200, 20);
                panel.add(FirstNameText);
                 Firstradio =new JRadioButton("Arial",true);
         SecondRadio =new JRadioButton("Times New",true);
         Firstradio.setBounds(40, 50, 100, 40);
         panel.add(Firstradio);
         SecondRadio.setBounds(40, 100, 150, 40);
         panel. add(SecondRadio);
         radiogroup =new ButtonGroup();
         radiogroup.add(Firstradio);
        radiogroup.add(SecondRadio);
        comboBox =new JComboBox<String>(data);
        comboBox.setMaximumRowCount(2);
        comboBox.setBounds(270, 100, 100, 20);
       panel.add(comboBox);
             FirstCheck= new JCheckBox("Bold");
        SecondCheck= new JCheckBox("Italic");
       FirstCheck.setBounds(40, 250, 100, 30);
        panel. add(FirstCheck);
        SecondCheck.setBounds(270, 250, 100, 30);
       panel.add(SecondCheck);
         Button1 = new JButton("Exit");
         Button1.setBounds(220, 300, 100, 30);
       panel.add(Button1);
        
        
        }
        
    public static void main(String[] args) {
    Lab2 l=new Lab2();
     
        
    
    }
    
}
