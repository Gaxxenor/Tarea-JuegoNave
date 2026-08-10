package com.balitechy.spacewar.main;

public class ColorfulVectorGameFactory implements GameFactory {
    @Override
    public PlayerRenderer createPlayerRenderer() {
        return new ColorfulVectorPlayerRenderer();
    }

    @Override
    public BulletRenderer createBulletRenderer() {
        return new ColorfulVectorBulletRenderer();
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new ColorfulVectorBackgroundRenderer();
    }
}