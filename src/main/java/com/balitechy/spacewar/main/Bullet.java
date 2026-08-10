package com.balitechy.spacewar.main;

import java.awt.Graphics;

public class Bullet {
	
	private double x;
	private double y;
	public static final int WIDTH = 11;
	public static final int HEIGHT = 21;
	
	public Bullet(double x, double y, Game game){
		this.x = x;
		this.y = y;
	}
	
	public void tick(){
		y -= 5;
	}
	
	// Delega el dibujado al renderizador que recibe por parámetro
	public void render(Graphics g, BulletRenderer renderer){
		renderer.render(g, this);
	}
	
	public double getX(){
		return x;
	}

	public double getY(){
		return y;
	}
}