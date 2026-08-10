package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorfulVectorPlayerRenderer implements PlayerRenderer {
    @Override
    public void render(Graphics g, Player player) {
        g.setColor(Color.CYAN);
        int x = (int) player.getX();
        int y = (int) player.getY();
        int w = player.getWidth();
        int h = player.getHeight();

        int[] xPoints = {x + w / 2, x, x + w};
        int[] yPoints = {y, y + h, y + h};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}