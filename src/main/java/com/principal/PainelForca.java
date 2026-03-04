/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.principal;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author arthur
 */
public class PainelForca extends JPanel {
    private int erros = 0;

    public void setErros(int erros) {
        this.erros = erros;
        repaint(); // Atualiza o desenho na tela
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(4));
        
        g2.drawLine(50, 250, 200, 250); //base
        g2.drawLine(100, 250, 100, 50); //mastro
        g2.drawLine(100, 50, 150, 50); //topo
        
        if (erros >= 1) g2.drawOval(130, 70, 30, 30); // Cabeça
        if (erros >= 2) g2.drawLine(145, 100, 145, 160); // Corpo
        if (erros >= 3) g2.drawLine(145, 120, 120, 140); // Braço Esq
        if (erros >= 4) g2.drawLine(145, 120, 170, 140); // Braço Dir
        if (erros >= 5) g2.drawLine(145, 160, 120, 190); // Perna Esq
        if (erros >= 6) g2.drawLine(145, 160, 170, 190); // Perna Dir
        
    }
    
}
