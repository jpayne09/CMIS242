package Assignment3;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * GUIConverter application
 * This application has two main functions
 * 1. Convert Miles to Kilometers
 * 2. Convert Fahrenheit to Celsius
 */
public class GUIConverter extends JPanel implements ActionListener {

    //private variables
    JButton button1, button2, button3;
    JFrame frame;

    //GUIConverter constructor design to initialize the Jframe,Jpanel,buttons and perform actions
    public GUIConverter() {

        JFrame frame = new JFrame("GUi Converter");
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(0, 0));

        JButton button1 = new JButton("Distance Converter");
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                try {
                    String inputData =JOptionPane.showInputDialog(frame,"Input miles distance to convert");
                    double inputData2 = Double.parseDouble(inputData); 
                    Converter dc = new DistanceConverter(inputData2);
                    Double output = dc.convert(inputData2);
                    JOptionPane.showMessageDialog(null, inputData2 + " equals " + output + " KM");
                } catch (Exception e) {
                    Converter dc1 = new DistanceConverter();
                    JOptionPane.showMessageDialog(null, dc1.toString());
                } 
                
            }
        });
        JButton button2 = new JButton("Temperature Converter");
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                try {
                    //JFrame frame = new JFrame();   
                    String inputData =JOptionPane.showInputDialog(frame,"Input fahrenheit temperature to convert");
                    double inputData2 = Double.parseDouble(inputData); 
                    Converter dc = new TemperatureConverter(inputData2);
                    Double output = dc.convert(inputData2);
                    JOptionPane.showMessageDialog(null, inputData2 + " equals " + output +" C");
                } catch (Exception e) {
                    Converter dc1 = new TemperatureConverter();
                    JOptionPane.showMessageDialog(null, dc1.toString());
                }

            }
        });
        JButton button3 = new JButton("Exit");
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0){
                System.exit(0);
            }
        });

        //Adding buttons to panel layout
        panel.add(button1, BorderLayout.CENTER);
        panel.add(button2, BorderLayout.EAST);
        panel.add(button3, BorderLayout.PAGE_END);
        //Adding to the window frame
        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    
        
    }

    //method to display the JFRAME and add to the content pane
    private static void showGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("App");

        // Create and set up the content pane.
        JPanel newContentPane = new GUIConverter();
        frame.setContentPane(newContentPane);
        
        // Display the window.
        frame.pack();
    }
    
    //Main Entry method to show the GUI

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showGUI();
            }

        });
    }



    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub


    }

}
