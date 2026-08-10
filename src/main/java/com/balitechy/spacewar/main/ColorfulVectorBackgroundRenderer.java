package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorfulVectorBackgroundRenderer implements BackgroundRenderer {
    @Override
    public void render(Graphics g, Game game) {
        g.setColor(new Color(10, 10, 40)); // Fondo azul oscuro estilo espacio
        g.fillRect(0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE);
    }
}