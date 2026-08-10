package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpriteBackgroundRenderer implements BackgroundRenderer {

    private BufferedImage background;

    public SpriteBackgroundRenderer() {
        try {
            SpritesImageLoader bg = new SpritesImageLoader("/bg.png");
            bg.loadImage();
            background = bg.getImage(0, 0, 640, 480);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g, Game game) {
        if (background != null) {
            g.drawImage(background, 0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE, null);
        }
    }
}