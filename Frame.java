import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Frame{
public static void main(String[] args){
    // JFrame fenetre = new JFrame("Ma première fenêtre Swing"); 
    // fenetre.setSize(400, 200); 
    // fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    // JButton bouton = new JButton("Clique moi !"); 
    // fenetre.add(bouton); 
    // fenetre.setVisible(true);

    // JFrame fenetre = new JFrame("Événement bouton"); 
    // JButton bouton = new JButton("Cliquez ici"); 
    // bouton.addActionListener(new ActionListener() { 
    //     public void actionPerformed(ActionEvent e) { 
    //         JOptionPane.showMessageDialog(null, "Bouton cliqué !"); 
    //     } 
    // }); 
    //  fenetre.add(bouton);
    //  fenetre.setSize(300, 150); 
    //  fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    //  fenetre.setVisible(true);

    JFrame fenetre = new JFrame("Bienvenue !"); 
    fenetre.setSize(400, 200); 
    fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    fenetre.setLayout(new FlowLayout()); 
    JLabel label = new JLabel("Votre nom :"); 
    JTextField champTexte = new JTextField(15); 
    JButton bouton = new JButton("Dire bonjour"); 
    bouton.addActionListener(e -> { 
        String nom = champTexte.getText(); 
        JOptionPane.showMessageDialog(null, "Bonjour " + nom + " !"); 
    }); 
    fenetre.add(label); 
    fenetre.add(champTexte); 
    fenetre.add(bouton); 
    fenetre.setVisible(true);
}
}