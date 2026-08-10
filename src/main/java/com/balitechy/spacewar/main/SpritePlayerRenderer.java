package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SpritePlayerRenderer implements PlayerRenderer {

    private BufferedImage playerImage;

    public SpritePlayerRenderer() {
        try {
            SpritesImageLoader sprites = new SpritesImageLoader("/sprites.png");
            sprites.loadImage();
            // Extrae la subimagen del jugador según la hoja de sprites original
            playerImage = sprites.getImage(219, 304, 56, 28);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g, Player player) {
        if (playerImage != null) {
            g.drawImage(playerImage, (int) player.getX(), (int) player.getY(), null);
        }
    }
}