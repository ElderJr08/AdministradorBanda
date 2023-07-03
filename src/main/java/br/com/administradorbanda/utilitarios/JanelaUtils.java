/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.administradorbanda.utilitarios;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Point;
import java.awt.Window;

/**
 *
 * @author renato
 */
public class JanelaUtils {
    public static void centralizar(Window window) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        Point centerPoint = ge.getCenterPoint();
        Dimension screenSize = ge.getMaximumWindowBounds().getSize();

        int windowWidth = window.getWidth();
        int windowHeight = window.getHeight();

        int windowX = Math.max(0, centerPoint.x - windowWidth / 2);
        int windowY = Math.max(0, centerPoint.y - windowHeight / 2);

        // Verificar se a janela não vai ficar fora da tela
        if (windowX + windowWidth > screenSize.width) {
            windowX = screenSize.width - windowWidth;
        }
        if (windowY + windowHeight > screenSize.height) {
            windowY = screenSize.height - windowHeight;
        }

        window.setLocation(windowX, windowY);
    }
}
