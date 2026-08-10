package com.balitechy.spacewar.main;

public interface GameFactory {
    PlayerRenderer createPlayerRenderer();
    BulletRenderer createBulletRenderer();
    BackgroundRenderer createBackgroundRenderer();
}