package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteBulletRenderer implements BulletRenderer {

    private BufferedImage bulletImage;

    public SpriteBulletRenderer() {
        try {
            SpritesImageLoader sprites = new SpritesImageLoader("/sprites.png");
            sprites.loadImage();
            bulletImage = sprites.getImage(35, 53, 11, 21);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g, Bullet bullet) {
        if (bulletImage != null) {
            g.drawImage(bulletImage, (int) bullet.getX(), (int) bullet.getY(), null);
        }
    }
}