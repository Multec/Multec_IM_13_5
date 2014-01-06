package be.pandapp.ehb;

import processing.core.PApplet;
import processing.core.PImage;

public class NewsTile extends Shape {
	
	public int posX;
	public int posY;
	//public String imagePath;
	public PImage image;
	

	public NewsTile(float posX, float posY, float posZ, int fillColor, PImage image) {
		super(posX, posY, posZ, fillColor);
		this.image = image;
	}
	
	public void setup() {
		
	}

	public void draw() {
		
	}

	@Override
	public void draw(PApplet app) {
		// TODO Auto-generated method stub
		
	}
}
