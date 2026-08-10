package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.util.LinkedList;

public class BulletController {
	private LinkedList<Bullet> bl = new LinkedList<Bullet>();
	
	public void tick(){
		for(int i=0; i < bl.size(); i++){
			if(bl.get(i).getY() < 0){
				removeBullet(bl.get(i));
			}else{
				bl.get(i).tick();
			}
		}
	}
	
	// Recibe el renderer abstracto y se lo pasa a cada objeto Bullet
	public void render(Graphics g, BulletRenderer renderer){
		for(int i=0; i < bl.size(); i++){
			bl.get(i).render(g, renderer);
		}
	}
	
	public void addBullet(Bullet bullet){
		bl.add(bullet);
	}
	
	public void removeBullet(Bullet bullet){
		bl.remove(bullet);
	}
}
