/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.pkgfor.work;

/**
 *
 * @author Chirag
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIForWork {

public static void main(String[] args) {
 JLabel title, name, width, height;
 JTextField nameField, widthField, heightField;
 JButton generateBmp;
 

  JFrame frame = new JFrame("Bitmap GUI");
  
  title = new JLabel("Enter Dimensions");
  title.setForeground(Color.blue);
  name = new JLabel("Name");
  width = new JLabel("Width");
  height = new JLabel("Height");
  nameField = new JTextField();
  widthField = new JTextField();
  heightField = new JTextField();
  generateBmp = new JButton("Generate Bitmap");
 
  name.setBounds(10, 10, 80, 50);
  nameField.setBounds(100, 10, 180, 50);
  width.setBounds(10, 85, 80, 50);
  widthField.setBounds(100, 85, 180, 50);
  height.setBounds(10, 160, 80, 50);
  heightField.setBounds(100, 160, 180, 50);
  generateBmp.setBounds(85, 220, 150, 30);

  frame.add(name);
  frame.add(nameField);
  frame.add(width);
  frame.add(widthField);
  frame.add(height);
  frame.add(heightField);
  frame.add(generateBmp);
 
  frame.setSize(300,300);
  frame.setLayout(null);
  frame.setVisible(true);

   
}
}




    
    

