package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class VectorBackgroundRenderer implements BackgroundRenderer {

    @Override
    public void render(Graphics g, Game game) {
        // Fondo blanco
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE);
        
        // Elemento gráfico decorativo en vectores (por ejemplo, un círculo central)
        g.setColor(Color.BLACK);
        g.drawOval(100, 100, 200, 200);
    }
}