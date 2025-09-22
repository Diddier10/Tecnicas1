/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ambientegraficopobre;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author Alima
 */

public class Gui03 extends JFrame {

        Container panel;

        public Gui03() {
            super("FEAAAA");
            // Configurar componentes:
            panel = this.getContentPane();
            // GridLayout
            panel.setLayout(new GridLayout(4, 4, 10, 5));
            // Add buttons to the frame
            for (int i = 1; i <= 10; i++) {
                panel.add(new JButton(Integer.toString(i)));
            }
            setSize(200, 200);
            setVisible(true);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        public static void main(String args[]) {
            Gui03 ventana = new Gui03();
        }
}

