package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class ColorfulVectorBulletRenderer implements BulletRenderer {
    @Override
    public void render(Graphics g, Bullet bullet) {
        g.setColor(Color.RED);
        g.fillRect((int) bullet.getX(), (int) bullet.getY(), 4, 10);
    }
}