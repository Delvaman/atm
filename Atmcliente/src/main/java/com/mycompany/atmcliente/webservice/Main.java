/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.atmcliente.webservice;

import com.mycompany.atmcliente.AtmWebService;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;



/**
 *
 * @author dlvmnfch3pla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AtmWebService webservice = new AtmWebService();
        
    }
  private static void MenuPrincipal() {

        JFrame frame = new JFrame("Menu Principal");
        frame.setLayout(new GridBagLayout());

        GridBagConstraints constraint = new GridBagConstraints();
        constraint.gridx = 1;
        constraint.gridy = 0;

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setVisible(true);
    MenuPrincipal();
}
                
}
           