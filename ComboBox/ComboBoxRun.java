import java.awt.Color;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;

import java.awt.*;


public class ComboBoxRun extends JPanel implements ActionListener {

    JLabel picture;
    JLabel picture2;
    public ComboBoxRun() {
        String[] carsStrings = { "Lambo", "BMW", "Bentley" };

        // Create the combo box, select the item at index 0.
        // Indices start at 0, so 4 specifies the Bentley.
        JComboBox<String> carList = new JComboBox<String>(carsStrings);
        carList.setSelectedIndex(0);
        carList.addActionListener(this);
        carList.setForeground(Color.BLUE);
        
        // Set up the car picture.
        picture = new JLabel();
        picture.setHorizontalAlignment(JLabel.CENTER);
        updateLabel(carsStrings[carList.getSelectedIndex()]);

        //Setup app logo
        picture2 = new JLabel();
        picture2.setHorizontalAlignment(JLabel.LEADING);
        updateLogo();

        //Add car and picture
        add(carList);
        add(picture);
        add(picture2);
        
    }

    private static void showGUI() {
        // Create and set up the window.
        JFrame frame = new JFrame("Car Picture App");

        // Create and set up the content pane.
        JPanel newContentPane = new ComboBoxRun();
        frame.setContentPane(newContentPane);
        
        // Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    //Actions performed on the combobox
    @Override
    public void actionPerformed(ActionEvent evt) {
        JComboBox combo = (JComboBox)evt.getSource();
        String carName = (String)combo.getSelectedItem();
        updateLabel(carName);

    }
    

    /** Returns an ImageIcon, or null if the path was invalid. */
    protected static ImageIcon createImageIcon(String path) {
        URL imgURL = ComboBoxRun.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    protected void updateLabel(String name) {
        ImageIcon icon = createImageIcon("images/" + name + ".png");
        picture.setIcon(icon);
        picture.setToolTipText("Logo of a " + name.toLowerCase());
        if (icon != null) {
            picture.setText(null);
        } else {
            picture.setText("Image not found");
        }
    }

    protected void updateLogo(){
        ImageIcon imageIcon = new ImageIcon(new ImageIcon("images/logo.png").getImage().getScaledInstance(50, 50, 20));
        picture2.setIcon(imageIcon);
    }

    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                showGUI();
            }

        });

    }
    
}
