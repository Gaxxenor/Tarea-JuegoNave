package com.balitechy.spacewar.main;

public class SpriteGameFactory implements GameFactory {

    @Override
    public PlayerRenderer createPlayerRenderer() {
        return new SpritePlayerRenderer();
    }

    @Override
    public BulletRenderer createBulletRenderer() {
        return new SpriteBulletRenderer();
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new SpriteBackgroundRenderer();
    }
}